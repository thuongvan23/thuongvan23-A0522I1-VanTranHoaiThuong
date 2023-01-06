package com.example.controller;

import com.example.model.Song;
import com.example.model.SongForm;
import com.example.service.SongService;
import com.example.service.SongServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class SongController {
    private final SongService songService = new SongServiceImpl();

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("songs", songService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("songForm", new  SongForm());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("productForm") SongForm songForm){
        String filePath = songForm.getInputSong().getOriginalFilename();
        Song song = new Song(songForm.getId(), songForm.getName(),
                songForm.getSinger(), songForm.getType(), filePath);
        songService.save(song);
        return "create";
    }

}
