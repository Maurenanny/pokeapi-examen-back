package com.apipokemon.apipokemon.abilities.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "abilities")
public class AbilityModel {
    //Especificar ID AI NNULL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_abilitie;
    private String name;

    private String url;
    private Integer pokemon_id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId_abilitie() {
        return id_abilitie;
    }
    public void setId_abilitie(Integer id_abilitie) {
        this.id_abilitie = id_abilitie;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getPokemon_id() {
        return pokemon_id;
    }
    public void setPokemon_id(Integer pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    
}
