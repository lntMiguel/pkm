package org.example;

import org.example.controller.BatalhaController;
import org.example.models.pokemons.Caterpie;
import org.example.models.pokemons.Charmander;
import org.example.models.pokemons.Jogador;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ash", new Charmander());
        Jogador jogador2 = new Jogador("Brock", new Caterpie());

        BatalhaController batalhaController = new BatalhaController();

        batalhaController.iniciaBatalha(jogador1,jogador2);
    }


}