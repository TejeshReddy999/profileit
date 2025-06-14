package com.portfolio.profileit.controller;

import com.portfolio.profileit.model.Skills;
import com.portfolio.profileit.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profileit/tejesh/skills")
public class SkillsController {

    @Autowired
    SkillsService skillsService;

    @GetMapping("fetch")
    public ResponseEntity<List<Skills>> getUserSkills(){
        return skillsService.getUserSkills();
    }

    @PostMapping("add")
    public ResponseEntity<List<Skills>> addUserSkills(@RequestBody List<Skills> skills){
        return  skillsService.addUserSkills(skills);
    }

    @GetMapping("name/{name}")
    public ResponseEntity<List<Skills>> getUserSkillsByName(@PathVariable String name){
        return skillsService.getUserSkillsByName(name);
    }

}
