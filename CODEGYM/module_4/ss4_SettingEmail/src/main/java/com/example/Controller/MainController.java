package com.example.Controller;

import com.example.Model.ValueSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {
    private final List<String> languages = new ArrayList<>();

     {
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Chinese");
        languages.add("Japanese");
    }

    @GetMapping("/show")
    public String show(Model model){
        ValueSetting valueSetting = new ValueSetting();
        model.addAttribute("valueSetting", valueSetting);
        model.addAttribute("languages", languages);
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("valueSetting") ValueSetting valueSetting, Model model){
        model.addAttribute("valueSetting1", valueSetting);
        model.addAttribute("languages", languages);
        return "index";
    }

}
