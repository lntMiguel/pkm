package org.example.controller;

import org.example.models.pokemons.Jogador;
import org.example.service.BatalhaService;

import java.util.Scanner;

public class BatalhaController {
    private Scanner scanner = new Scanner(System.in);
    private BatalhaService batalhaService = new BatalhaService();

    public void iniciaBatalha(Jogador jogador1, Jogador jogador2) {
        int especialJ1 = 2;
        int especialJ2 = 2;

        while (!batalhaService.verificaFim(jogador1, jogador2)) {
            int escolhaJ1 = obterEscolha(jogador1, especialJ1);
            int escolhaJ2 = obterEscolha(jogador2, especialJ2);

            batalhaService.processarTurno(jogador1, jogador2, escolhaJ1, escolhaJ2);
            batalhaService.processarTurno(jogador2, jogador1, escolhaJ2, escolhaJ1);

            especialJ1 = batalhaService.atualizarEspecial(especialJ1, escolhaJ1);
            especialJ2 = batalhaService.atualizarEspecial(especialJ2, escolhaJ2);
        }
        batalhaService.exibirVencedor(jogador1, jogador2);
    }

    private int obterEscolha(Jogador jogador, int especial) {
        int escolha;
        do {
            batalhaService.exibirOpcoes(jogador, especial);
            escolha = scanner.nextInt();
        } while (escolha == 3 && especial > 0);
        return escolha;
    }










}
