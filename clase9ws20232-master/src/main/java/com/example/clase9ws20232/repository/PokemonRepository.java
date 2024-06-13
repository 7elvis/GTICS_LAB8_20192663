package com.example.clase9ws20232.repository;

import com.example.clase9ws20232.entity.Pokemon;
import com.example.clase9ws20232.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Integer> {
}
