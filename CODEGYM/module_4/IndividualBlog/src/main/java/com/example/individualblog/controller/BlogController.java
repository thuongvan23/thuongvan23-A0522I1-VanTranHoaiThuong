package com.example.individualblog.controller;

import com.example.individualblog.model.Blog;
import com.example.individualblog.model.BlogForm;
import com.example.individualblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/main")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/showSummary")
    public String show(Model model){
        model.addAttribute("blogs", blogService.findAll());
        return "show";
    }
//
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("blog_form", new BlogForm());
        return "create";
    }
//
    @PostMapping("/save")
    public String save(@ModelAttribute("blog_form") BlogForm blogForm, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("notice", "Success!!!");
        blogService.save(blogService.findById(blogForm.getId()));
        return "redirect:showSummary";
    }
//
    @GetMapping("/detail/{id}")
    public String showDetail(Model model, @PathVariable("id") int id){
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }
//
    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable("id") int id){
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }
//
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        blogService.delete(blogService.findById(id));
        return "redirect:/main/showSummary";
    }
}
