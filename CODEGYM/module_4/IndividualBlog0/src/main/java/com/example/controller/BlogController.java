package com.example.controller;

import com.example.model.Blog;
import com.example.service.BlogService;
import com.example.service.BlogServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main")
public class BlogController {

    private final BlogService blogService = new BlogServiceImpl();

    @GetMapping("/showSummary")
    public String show(Model model){
        model.addAttribute("blogs", blogService.findAll());
        return "show";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        return "redirect:showSummary";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(Model model, @PathVariable("id") Integer id){
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable("id") Integer id){
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("blog") Blog blog){
        blogService.edit(blog.getId(), blog);
        model.addAttribute("blogs", blogService.findAll());
        return "show";
    }
}
