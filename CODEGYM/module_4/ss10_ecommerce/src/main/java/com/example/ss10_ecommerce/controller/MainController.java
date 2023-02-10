package com.example.ss10_ecommerce.controller;

import com.example.ss10_ecommerce.model.Item;
import com.example.ss10_ecommerce.model.User;
import com.example.ss10_ecommerce.service.CartService;
import com.example.ss10_ecommerce.service.ItemService;
import com.example.ss10_ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    ItemService itemService;
    @Autowired
    UserService userService;
    @Autowired
    CartService cartService;

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

    @GetMapping("/addToCart/{itemName}")
    public String addToCart(@PathVariable("itemName") String itemName, HttpSession session){
//        cartService.addToCart();
    }
}
