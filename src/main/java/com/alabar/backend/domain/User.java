package com.alabar.backend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "User", schema = "alabar_backend")
@Data
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "login_image")
    private String loginImage;
    @OneToMany(mappedBy = "user")
    private List<Rating> ratingList;
}
