package com.alabar.backend.controller.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Movie", schema = "alabar_schema")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    @Column(name = "age_restriction")
    private String ageRestriction;
    @Column(name = "format_movie")
    private FormatMovie formatMovie;

    @ManyToMany
    @JoinTable(
            name = "movie_genre",
            schema = "alabar_backend",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;

    @OneToMany(mappedBy = "movie")
    private List<Rating> movieRatingList;
}
