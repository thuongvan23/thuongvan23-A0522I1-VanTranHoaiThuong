package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/show")
    public String show(){
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(Model model, String operator, float num1, float num2){
        float result = 0;
        switch (operator){
            case "add":
                result = num1 + num2;
                break;
            case "minor":
                result = num1 - num2;
                break;
            case "multi":
                result = num1 * num2;
                break;
            case "div":
                result = num1/num2;
                break;
        }
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "index";
    }
}
