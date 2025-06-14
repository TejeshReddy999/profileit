package com.portfolio.profileit.service;

import com.portfolio.profileit.model.AboutMe;
import com.portfolio.profileit.repositroy.AboutMeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeService {

    @Autowired
    AboutMeRepo aboutMeRepo;

    public ResponseEntity<List<AboutMe>> getAboutMe() {
        return new ResponseEntity<>(aboutMeRepo.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<String> addAboutMe(List<AboutMe> aboutMe) {
        aboutMeRepo.saveAll(aboutMe);
        return new ResponseEntity<>("Data Saved",HttpStatus.CREATED);
    }
}
