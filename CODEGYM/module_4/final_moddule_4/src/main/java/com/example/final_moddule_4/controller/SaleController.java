package com.example.final_moddule_4.controller;

import com.example.final_moddule_4.model.InfoSale;
import com.example.final_moddule_4.service.InfoSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/main")
public class SaleController {
    @Autowired
    InfoSaleService infoSaleService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }


    @GetMapping("/show2")
    public String show2(Model model){
        List<InfoSale> infoSales = infoSaleService.findAll();
        model.addAttribute("infoSales", infoSales);
        return "show";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("infoSale", new InfoSale());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("infoSale") InfoSale infoSale, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            infoSaleService.save(infoSale);
            return "redirect:/main/show";
        }
    }

    @PostMapping("/saveUpdate")
    public String saveUpdate(@Valid @ModelAttribute("infoSale") InfoSale infoSale, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "updateForm";
        } else {
            infoSaleService.save(infoSale);
            return "redirect:/main/show";
        }
    }

    @GetMapping("/update/{idSale}")
    public String showUpdateForm(Model model, @PathVariable("idSale") int idSale) {
        model.addAttribute("infoSale", infoSaleService.findById(idSale));
        return "updateForm";
    }

    @GetMapping("/delete/{idSale}")
    public String delete(@PathVariable("idSale") int idSale) {
        infoSaleService.deleteById(idSale);
        return "redirect:/main/show";
    }

    @GetMapping("findByRateSale")
    public String findByRateSale(@RequestAttribute("searchInfo") String searchInfo, Model model){
        Integer searchInfoI = Integer.valueOf(searchInfo);
        InfoSale infoSales = infoSaleService.searchByRateSale(searchInfoI);
        model.addAttribute("infoSales", infoSales);
        return "show";
    }


}
