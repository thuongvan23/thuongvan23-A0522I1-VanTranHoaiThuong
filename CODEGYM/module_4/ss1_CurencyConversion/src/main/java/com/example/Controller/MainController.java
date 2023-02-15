package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conversion")
public class MainController {

    @GetMapping ("/change")
    public String calculate(){
        return "index";
    }

    @GetMapping("change1")
    public String calculate1(Model model, String usd, String rate){
        Float result = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        model.addAttribute("result", result);
        return "index";
    }
}
