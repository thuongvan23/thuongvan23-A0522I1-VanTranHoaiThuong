package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class MainController {

//    @GetMapping("/hi")
//    public String greeting() {
//        return "greeting";
//    }

    @GetMapping("/greeting")
    public String greeting(String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
}
