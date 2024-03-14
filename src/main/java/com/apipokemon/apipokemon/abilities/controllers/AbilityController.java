package com.apipokemon.apipokemon.abilities.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipokemon.apipokemon.abilities.models.AbilityModel;
import com.apipokemon.apipokemon.abilities.services.AbilityService;

@RestController
@RequestMapping("/ability")
public class AbilityController {
    
     @Autowired
     AbilityService abilityService;

     @GetMapping
     public ArrayList<AbilityModel> obtenerAbility(){
        return abilityService.obtenerAbility();
     }

     @PostMapping
     public AbilityModel guardarAbility(@RequestBody AbilityModel ability){
        return this.abilityService.guardarAbility(ability);
     }


     @GetMapping(path = "/{id}")
     public Optional<AbilityModel> obtenerAbilityPorId(@PathVariable("id") Integer id){
        return this.abilityService.obtenerPorId(id);
     }


}
