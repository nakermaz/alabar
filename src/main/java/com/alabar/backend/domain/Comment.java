package com.alabar.backend.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Comment", schema = "alabar_backend")
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
