package com.portfolio.profileit.controller;

import com.portfolio.profileit.model.AboutMe;
import com.portfolio.profileit.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profileit/tejesh/aboutme")
public class AboutMeController {
    
    @Autowired
    AboutMeService aboutMeService;
    
    @GetMapping("fetch")
    public ResponseEntity<List<AboutMe>> getAboutMe(){
        return aboutMeService.getAboutMe();
    }

    @PostMapping("add")
    public ResponseEntity<String> addAboutMe(@RequestBody List<AboutMe> aboutMe){
        return aboutMeService.addAboutMe(aboutMe);
    }
}
