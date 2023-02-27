package com.example.ss10_ecommerce.controller;

import com.example.ss10_ecommerce.model.Cart;
import com.example.ss10_ecommerce.model.Item;
import com.example.ss10_ecommerce.service.ItemService;
import com.example.ss10_ecommerce.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/main")
//Khai báo session saaas, sdkjfhs
@SessionAttributes({"saaas", "sdkjfhs"})
public class MainController {

    @Autowired
    ItemService itemService;
    @Autowired
    UserService userService;

//    Khởi tạo giá trị ban đầu cho session saaas
    @ModelAttribute("saaas")
    public Cart itemList(){
        return new Cart();
    }

    @GetMapping("/addToCart/{itemName}")
    public String addToCart(@PathVariable("itemName") String itemName, @SessionAttribute("saaas") Cart cart){
        Item item = itemService.findByName(itemName);
        cart.addProduct(item);
        return "description";
    }

    @GetMapping("/viewCart")
    public String showCart(@SessionAttribute("saaas") Cart cart, Model model){
        model.addAttribute("items", cart.getProducts());
        return "viewCart";
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("products", itemService.findAll());
        return "show";
    }

    @GetMapping("/description/{itemName}")
    public String showDescription(Model model, @PathVariable("itemName") String itemName){
        model.addAttribute("item", itemService.findByName(itemName));
        return "description";
    }

}
