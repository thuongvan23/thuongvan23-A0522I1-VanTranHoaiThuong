package com.example.case_study_module4.controller;

import com.example.case_study_module4.model.Customer;
import com.example.case_study_module4.service.CustomerService;
import com.example.case_study_module4.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("/main")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/show")
    public String show(@RequestParam(value = "nameCustomer", defaultValue = "") String nameCustomer,
                       @RequestParam(defaultValue = "0") int page,
                       Model model){
        Pageable pageable = PageRequest.of(page, 2, Sort.by("customerName"));
        Page<Customer> customerPage = customerService.findAllByName(pageable, nameCustomer);

        model.addAttribute("nameCustomer", nameCustomer);
        model.addAttribute("customers", customerPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", customerPage.getTotalPages());
        model.addAttribute("totalItems", customerPage.getTotalElements());
        return "show";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        LocalDate date = customer.getBirthday();
        if (bindingResult.hasFieldErrors()){
            return "create";
        } else {
            customerService.save(customer);
            return "redirect:/main/show";
        }
    }

    @GetMapping("/delete/{customerId}")
    public String delete(@PathVariable("customerId") int id){
        customerService.deleteById(id);
        return "redirect:/main/show";
    }

    @GetMapping("/update/{customerId}")
    public String showUpdateForm(Model model, @PathVariable("customerId") int id){
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "updateForm";
    }
}
