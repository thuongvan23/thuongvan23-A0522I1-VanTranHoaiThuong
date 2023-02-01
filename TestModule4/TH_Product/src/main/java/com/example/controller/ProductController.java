package com.example.controller;

import com.example.model.Product;
import com.example.model.ProductForm;
import com.example.serivice.ProductService;
import com.example.serivice.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/main")
public class ProductController {
    @Value("${file-upload}")
    private String fileUpload;
    private final ProductService productService = new ProductServiceImpl();

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("productForm", new ProductForm());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("productForm") ProductForm productForm){
        MultipartFile multipartFile = productForm.getImage();
        String fileName = multipartFile.getName();
        try {
            FileCopyUtils.copy(productForm.getImage().getBytes(), new File(fileUpload + fileName));
        } catch (IOException e){
            e.printStackTrace();
        }
        Product product = new Product(productForm.getId(), productForm.getName(),
                productForm.getDescription(), fileName);
        productService.save(product);
        return "create";
    }

}
