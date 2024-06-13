package com.example.clase9ws20232.controller;

import com.example.clase9ws20232.entity.Pokemon;
import com.example.clase9ws20232.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/")
    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    @PostMapping("/")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable Integer id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Pokemon updatePokemon(@PathVariable Integer id, @RequestBody Pokemon pokemon) {
        pokemon.setId(id);
        return pokemonRepository.save(pokemon);
    }

    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable Integer id) {
        pokemonRepository.deleteById(id);
    }
}
