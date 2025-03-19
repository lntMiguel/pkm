package org.example;


import org.example.controller.BatalhaController;
import org.example.models.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        jogador2.setNome("mingal");

        BatalhaController batalhaController = BatalhaController.getInstance();

        batalhaController.iniciaBatalha(jogador1,jogador2);

    }


}