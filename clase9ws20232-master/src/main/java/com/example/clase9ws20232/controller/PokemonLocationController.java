package com.example.clase9ws20232.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pokemon-location")
public class PokemonLocationController {

    @GetMapping("/{name}") //name / id
    public String getPokemonLocation(@PathVariable String name) {
        final String uri = "https://pokeapi.co/api/v2/location-area/" + name;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}