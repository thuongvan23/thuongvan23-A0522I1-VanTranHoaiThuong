package com.example.controller;

import com.example.model.Song;
import com.example.service.MusicService;
import com.example.service.MusicServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/main")
public class Controller {

    MusicService musicService = new MusicServiceImpl();

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("songs", musicService.findAll());
        return "show";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("song", new Song());
        return "show_create";
    }
}
