package com.apipokemon.apipokemon.pokemons.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apipokemon.apipokemon.pokemons.models.PokemonModel;
import java.util.List;


@Repository
public interface PokemonRepository extends CrudRepository<PokemonModel, Integer>{
    
    
}