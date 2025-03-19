package org.example.controller;


import org.example.facade.BatalhaFacade;
import org.example.models.cartas.CartaPokemon;
import org.example.models.jogador.Jogador;
import org.example.service.BatalhaService;

import java.util.Scanner;

public class BatalhaController{

    private static BatalhaController batalhaController;
    private BatalhaFacade batalhaFacade = new BatalhaFacade();

    private BatalhaController() {}

    public static BatalhaController getInstance() {
        if (batalhaController == null) {
            batalhaController = new BatalhaController();
        }
        return batalhaController;
    }

    public void iniciaBatalha(Jogador jogador1, Jogador jogador2) {
        batalhaFacade.iniciarBatalha(jogador1, jogador2);
    }



}
