package com.example.clase9ws20232.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pokemon-api")
public class PokemonApiController {

    @GetMapping("/{name}")
    public String getPokemonLocation(@PathVariable String name) {
        final String uri = "https://pokeapi.co/api/v2/" + name;   //locations areas
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
}