package com.example.Controller;

import com.example.DictionaryRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping ("/show")
    public String show(){
        return "index";
    }

    @PostMapping ("/show1")
    String translate(String eng1, Model model){
        String result = DictionaryRepo.translate(eng1);
        model.addAttribute("eng", eng1);
        model.addAttribute("viet", result);
        return "index";
    }
}
