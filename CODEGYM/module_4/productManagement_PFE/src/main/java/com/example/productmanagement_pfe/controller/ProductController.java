package com.example.productmanagement_pfe.controller;

import com.example.productmanagement_pfe.model.Product;
import com.example.productmanagement_pfe.service.ManufacturerService;
import com.example.productmanagement_pfe.service.ProductService;
import org.hibernate.cfg.annotations.reflection.internal.XMLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ManufacturerService manufacturerService;

    @GetMapping("/showAll")
    public String showALl(Model model){
        model.addAttribute("products", productService.getAll());
        return "showProduct";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("manufacturers", manufacturerService.getAll());
        model.addAttribute("product", new Product());
        return "creatForm";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/main/showAll";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        Product product = productService.findById(id);
        productService.delete(product);
        return "redirect:/main/showAll";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable("id") int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("manufacturers", manufacturerService.getAll());
        model.addAttribute("product", product);
        return "updateForm";
    }

    @GetMapping("/search")
    public String searchProducts(@RequestParam(value = "nameProduct", defaultValue = "") String nameProduct,
                                 @RequestParam(defaultValue = "0") int page,
                                 Model model) {
        Pageable pageable = PageRequest.of(page, 2, Sort.by("nameProduct"));
        Page<Product> productPage = productService.findAllByName(nameProduct, pageable);

        model.addAttribute("nameProduct", nameProduct);
        model.addAttribute("products", productPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", productPage.getTotalPages());
        model.addAttribute("totalItems", productPage.getTotalElements());
        return "showProduct";
    }
}
