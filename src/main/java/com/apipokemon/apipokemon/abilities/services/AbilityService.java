package com.apipokemon.apipokemon.abilities.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipokemon.apipokemon.abilities.models.AbilityModel;
import com.apipokemon.apipokemon.abilities.repositories.AbilityRepository;

@Service
public class AbilityService {
    
    @Autowired
    AbilityRepository abilityRepository;

    public ArrayList<AbilityModel> obtenerAbility(){
        return (ArrayList<AbilityModel>) abilityRepository.findAll();
    }


    public AbilityModel guardarAbility(AbilityModel ability){
        return abilityRepository.save(ability);
    }


    /*public Optional<AbilityModel> obtenerPorPokemonId(Integer pokemon_id){
        return abilityRepository.findByPokemonId(pokemon_id);
    }*/

    public Optional<AbilityModel> obtenerPorId(Integer id){
        return abilityRepository.findById(id);
    }


}
