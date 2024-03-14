package com.apipokemon.apipokemon.pokemons.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipokemon.apipokemon.pokemons.models.PokemonModel;
import com.apipokemon.apipokemon.pokemons.repositories.PokemonRepository;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public ArrayList<PokemonModel> obtenerPokemones(){
        return (ArrayList<PokemonModel>) pokemonRepository.findAll();
    }

    public PokemonModel guardarPokemonModel(PokemonModel pokemon){
        return pokemonRepository.save(pokemon);
    }

    public Optional<PokemonModel> obtenerPorId(Integer id){
        return pokemonRepository.findById(id);
    }
    public boolean eliminaPokemon(Integer id){
        try{
            pokemonRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
