package com.apipokemon.apipokemon.pokemons.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.apipokemon.apipokemon.pokemons.models.PokemonModel;
import com.apipokemon.apipokemon.pokemons.services.PokemonService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    

    @Autowired
    PokemonService pokemonService;

    @GetMapping
    public ArrayList<PokemonModel> obtenerPokemon(){
        return pokemonService.obtenerPokemones();
    }

    @PostMapping
    public PokemonModel guardarPokemon(@RequestBody PokemonModel pokemon){
        return this.pokemonService.guardarPokemonModel(pokemon);
    }

    @GetMapping( path= "/{id}")
    public Optional<PokemonModel> obtenerPokemonPorId(@PathVariable("id") Integer id) {
        return this.pokemonService.obtenerPorId(id);
    }
    
}
