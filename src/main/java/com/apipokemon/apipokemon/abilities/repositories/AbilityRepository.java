package com.apipokemon.apipokemon.abilities.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apipokemon.apipokemon.abilities.models.AbilityModel;

@Repository
public interface AbilityRepository extends CrudRepository<AbilityModel, Integer>{
    
    //public abstract ArrayList<AbilityModel> findByPokemonId(Integer pokemon_id);
}
