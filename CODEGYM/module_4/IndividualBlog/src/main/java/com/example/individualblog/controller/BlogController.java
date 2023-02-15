package com.example.individualblog.controller;

import com.example.individualblog.model.Blog;
import com.example.individualblog.model.BlogForm;
import com.example.individualblog.model.Category;
import com.example.individualblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
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

//    @GetMapping("/showSummary")
//    public String show(Model model){
//        model.addAttribute("blogs", blogService.findAll());
//        return "show";
//    }
    @GetMapping("/showSummary")
        public ResponseEntity<List<Blog>> show(){
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogList, HttpStatus.OK);
        }
    }
//
//    @GetMapping("/create")
//    public String showCreate(Model model){
//        model.addAttribute("blog_form", new BlogForm());
//        model.addAttribute("categories", new ArrayList<>(categories.values()));
//        return "create";
//    }
//
//    @PostMapping("/save")
//    public String save(@ModelAttribute("blog_form") BlogForm blogForm, RedirectAttributes redirectAttributes){
//        redirectAttributes.addFlashAttribute("notice", "Success!!!");
//        Blog blog = new Blog(blogForm.getId(), blogForm.getName(), blogForm.getContent(), categories.get(blogForm.getCategoryId()));
//        blogService.save(blog);
//        return "redirect:showSummary";
//    }
//
    @PostMapping("/save")
    public ResponseEntity<Blog> save(@RequestBody BlogForm blogForm) {
        Blog blog = new Blog(blogForm.getId(), blogForm.getName(), blogForm.getContent(), categories.get(blogForm.getCategoryId()));
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.CREATED);
    }

//    @GetMapping("/detail/{id}")
//    public String showDetail(Model model, @PathVariable("id") int id){
//        model.addAttribute("blog", blogService.findById(id));
//        return "detail";
//    }
//
    @GetMapping("/detail/{id}")
    public ResponseEntity<Blog> showDetail(@PathVariable("id") int id){
        Blog blog = blogService.findById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

//    @GetMapping("/update/{id}")
//    public String showUpdate(Model model, @PathVariable("id") int id){
//        model.addAttribute("blog_form", new BlogForm(blogService.findById(id)));
//        model.addAttribute("categories", new ArrayList<>(categories.values()));
//        return "update";
//    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Blog> update(@PathVariable("id") int id, @RequestBody BlogForm blogForm){
        Blog blog = new Blog(id, blogForm.getName(), blogForm.getContent(), categories.get(blogForm.getCategoryId()));
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.OK);
    }

//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable("id") int id){
//        blogService.delete(blogService.findById(id));
//        return "redirect:/main/showSummary";
//    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Blog> delete(@PathVariable("id") int id){
        Blog blog = blogService.findById(id);
        blogService.delete(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
