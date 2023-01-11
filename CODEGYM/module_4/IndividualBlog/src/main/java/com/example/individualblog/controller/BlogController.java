package com.example.individualblog.controller;

import com.example.individualblog.model.Blog;
import com.example.individualblog.model.BlogForm;
import com.example.individualblog.model.Category;
import com.example.individualblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main")
public class BlogController {

    private final Map<Integer, Category> categories = new HashMap<>();
    private final Map<Integer, BlogForm> blogFormMap = new HashMap<>();
    {
        categories.put(1, new Category(1, "Health"));
        categories.put(2, new Category(2, "World"));
        categories.put(3, new Category(3, "Finance"));
    }

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
        model.addAttribute("categories", new ArrayList<>(categories.values()));
        return "create";
    }
//
    @PostMapping("/save")
    public String save(@ModelAttribute("blog_form") BlogForm blogForm, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("notice", "Success!!!");
        Blog blog = new Blog(blogForm.getId(), blogForm.getName(), blogForm.getContent(), categories.get(blogForm.getCategoryId()));
        blogService.save(blog);
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
