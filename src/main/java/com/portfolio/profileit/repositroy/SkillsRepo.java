package com.portfolio.profileit.repositroy;

import com.portfolio.profileit.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkillsRepo extends JpaRepository<Skills, Integer> {

    List<Skills> findByName(String name);
}
