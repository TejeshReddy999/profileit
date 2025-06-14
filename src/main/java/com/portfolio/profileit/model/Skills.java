package com.portfolio.profileit.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Lob
    private String Skills;

    public Skills() {
    }
}
