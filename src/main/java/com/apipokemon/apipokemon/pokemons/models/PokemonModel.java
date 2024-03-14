package com.apipokemon.apipokemon.pokemons.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//CONTROLAR NAMES
@Entity
@Table(name = "pokemons")
public class PokemonModel {

    //Especificar ID AI NNULL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_pokemon;

    private String name;
    private Integer weight;
    private Integer height;
    private Integer pokemonclave;


    public Integer getPokemonclave() {
        return pokemonclave;
    }
    public void setPokemonclave(Integer pokemonclave) {
        this.pokemonclave = pokemonclave;
    }
    public Integer getId_pokemon() {
        return id_pokemon;
    }
    public void setId_pokemon(Integer id_pokemon) {
        this.id_pokemon = id_pokemon;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    
}
