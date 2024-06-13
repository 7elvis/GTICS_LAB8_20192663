package com.example.clase9ws20232.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table(name = "pokemon")
public class Pokemon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpokemon", nullable = false)
    private int id;


    @Column(name = "user_iduser")
    private int iduser;


    @Column(name = "nombrepoke")
    private String nombrepoke;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Column(name = "height")
    private int height;
    @Column(name = "weight")
    private int weight;
    @Column(name = "generation")
    private String generation;
    @Column(name = "region")
    private String region;
    @Column(name = "artwork")

    private String artwork;
}