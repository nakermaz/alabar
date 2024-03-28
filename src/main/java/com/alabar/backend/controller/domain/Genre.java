package com.alabar.backend.controller.domain;

import jakarta.persistence.*;
import jdk.jfr.Name;

import java.util.List;

@Entity
@Table(name = "Genre", schema = "alabar_backend")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "genres")
    private List<Movie> movies;
}
