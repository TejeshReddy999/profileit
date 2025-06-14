package com.portfolio.profileit.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AboutMe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Name;
    @Lob
    private String content;

    public AboutMe() {
    }
}
