package com.portfolio.profileit.service;

import com.portfolio.profileit.model.Skills;
import com.portfolio.profileit.repositroy.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SkillsService {

    @Autowired
    SkillsRepo skillsRepo;

    public ResponseEntity<List<Skills>> getUserSkills() {
        return new ResponseEntity<>(skillsRepo.findAll(), HttpStatus.OK);

    }

    public ResponseEntity<List<Skills>> addUserSkills(List<Skills> skills) {
        return new ResponseEntity<>(skillsRepo.saveAll(skills),HttpStatus.CREATED);
    }

    @Transactional
    public ResponseEntity<List<Skills>> getUserSkillsByName(String name) {
        return new ResponseEntity<>(skillsRepo.findByName(name),HttpStatus.OK);
    }
}
