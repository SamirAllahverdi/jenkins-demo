package com.example.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person_table")
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
}
