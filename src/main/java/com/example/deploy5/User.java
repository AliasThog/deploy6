package com.example.deploy5;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 20)
    private String name;

}