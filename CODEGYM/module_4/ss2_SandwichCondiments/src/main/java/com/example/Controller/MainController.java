package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    List<String> savedList = new ArrayList<>();

    @GetMapping("/show")
    public String show(){
        return "index";
    }

    @GetMapping("/save")
    public String save(Model model, String cdm1, String cdm2, String cdm3, String cdm4){
        String condiments = cdm1 + " " + cdm2 + " " + cdm3 + " " + cdm4;
        savedList.add(condiments);
        model.addAttribute("savedList", savedList);
        return "saved";
    }
}
