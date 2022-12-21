package com.example.Controller;

import com.example.Model.HomeAddress;
import com.example.Model.Report;
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

    private final List<String> genderList = new ArrayList<>();
    private final List<String> nationalityList = new ArrayList<>();
    private final List<String> vehicleList = new ArrayList<>();
    private final List<String> signalList = new ArrayList<>();
    private final List<String> historyContact = new ArrayList<>();


    {
        signalList.add("1");
        signalList.add("2");
        signalList.add("3");
        signalList.add("4");
        signalList.add("5");
        signalList.add("6");
        signalList.add("7");
        signalList.add("8");
        signalList.add("9");
        vehicleList.add("Train");
        vehicleList.add("Car");
        vehicleList.add("Bus");
        nationalityList.add("VietNam");
        nationalityList.add("America");
        genderList.add("Male");
        genderList.add("Female");
        historyContact.add("1");
        historyContact.add("2");
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("genders", genderList);
        model.addAttribute("vehicles", vehicleList);
        model.addAttribute("nationalities", nationalityList);
        model.addAttribute("signals", signalList);
        model.addAttribute("homeAddress", new HomeAddress());
        model.addAttribute("report", new Report());
        model.addAttribute("histories", historyContact);
        return "index";
    }

    @PostMapping("/save")
    public String save(Model model, @ModelAttribute("report") Report report, @ModelAttribute("homeAddress") HomeAddress homeAddress){
        model.addAttribute("vehicles", vehicleList);
        model.addAttribute("nationalities", nationalityList);
        model.addAttribute("genders", genderList);
        model.addAttribute("signals", signalList);
        model.addAttribute("histories", historyContact);
        model.addAttribute("report", report);
        model.addAttribute("homeAddress", homeAddress);
        return "index";
    }
}
