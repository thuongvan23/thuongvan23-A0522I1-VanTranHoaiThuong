package com.example.ss8_validateform.controller;

import com.example.ss8_validateform.model.User;
import com.example.ss8_validateform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "index";
    }
    @PostMapping("/check")
    public String save(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "index";
        } else {
            userRepository.save(user);
            return "result";
        }
    }
}
