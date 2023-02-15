package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import com.example.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main")
public class MainController {

    ProductService productService = new ProductServiceImpl();

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("products", productService.findAll());
        return "show";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "showCreate";
    }

    @PostMapping("/save")
    public String save(Model model, @ModelAttribute("product") Product product){
        productService.createAndUpdate(product);
        model.addAttribute("products", productService.findAll());
        return "show";
    }

    @GetMapping("/delete/{name}")
    public String delete(Model model, @PathVariable("name") String name){
        productService.delete(name);
        model.addAttribute("products", productService.findAll());
        return "show";
    }

    @GetMapping("/description/{name}")
    public String showDescription(Model model, @PathVariable("name") String name){
        String description = productService.findByName(name).getDescription();
        model.addAttribute("description", description);
        return "description";
    }

    @GetMapping("/update/{name}")
    public String showUpdate(Model model,@PathVariable("name") String name){
        Product product = productService.findByName(name);
        model.addAttribute("product", product);
        return "showUpdate";
    }
}
