package com.example.ss8_validatesonginfo.controller;

import com.example.ss8_validatesonginfo.model.Song;
import com.example.ss8_validatesonginfo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private SongService songService;

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("songs", songService.findAll());
        return "show";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("song") Song song,
                       RedirectAttributes redirectAttributes,
                       BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            redirectAttributes.addFlashAttribute("notice", "Success...");
            songService.save(song);
            return "redirect:/main/show";
        }
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable("id") int id) {
        model.addAttribute("song", songService.findById(id));
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        songService.remove(songService.findById(id));
        return "redirect:/main/show";
    }
}
