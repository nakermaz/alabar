package com.alabar.backend.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Player", schema = "alabar_backend")
public class Player {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
