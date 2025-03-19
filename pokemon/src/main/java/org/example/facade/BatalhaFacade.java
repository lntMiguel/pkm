package org.example.facade;

import org.example.models.cartas.CartaPokemon;
import org.example.models.jogador.Jogador;
import org.example.service.BatalhaService;

import java.util.Scanner;

public class BatalhaFacade {

    private final BatalhaService batalhaService = new BatalhaService();
    private final Scanner scanner = new Scanner(System.in);

    public void iniciarBatalha(Jogador jogador1, Jogador jogador2) {
        for (int round = 1; round <= 3; round++) {
            System.out.println("Rodada " + round);

            CartaPokemon pkm1 = jogador1.getCarta().getCartas()[round - 1];
            CartaPokemon pkm2 = jogador2.getCarta().getCartas()[round - 1];

            int especialJ1 = 2;
            int especialJ2 = 2;
            int contadorTurno = 0;

            processaBatalha(pkm1, pkm2, jogador1, jogador2, especialJ1, especialJ2, contadorTurno);

            if (pkm1.getCurrentHp() > 0) {
                System.out.println(jogador1.getNome() + " venceu a rodada!");
                batalhaService.atualizarPontuacao(jogador1);
            } else {
                System.out.println(jogador2.getNome() + " venceu a rodada!");
                batalhaService.atualizarPontuacao(jogador2);
            }


        }

        batalhaService.exibirVencedorFinal(jogador1, jogador2);
    }

    private void processaBatalha(CartaPokemon pkm1, CartaPokemon pkm2, Jogador jogador1, Jogador jogador2, int especialJ1, int especialJ2, int contadorTurno) {
        while (!batalhaService.verificaFim(pkm1, pkm2)) {
            int escolhaJ1 = obterEscolha(jogador1, especialJ1);
            int escolhaJ2 = obterEscolha(jogador2, especialJ2);

            batalhaService.processarTurno(pkm1, pkm2, escolhaJ1, escolhaJ2, jogador1, jogador2);
            batalhaService.processarTurno(pkm2, pkm1, escolhaJ2, escolhaJ1, jogador2, jogador1);

            especialJ1 = batalhaService.atualizarEspecial(especialJ1, escolhaJ1);
            especialJ2 = batalhaService.atualizarEspecial(especialJ2, escolhaJ2);
            contadorTurno = batalhaService.evoluir(pkm1, pkm2, contadorTurno);
        }
    }

    private int obterEscolha(Jogador jogador, int especial) {
        int escolha;
        do {
            batalhaService.exibirOpcoes(jogador, especial);
            escolha = scanner.nextInt();
        } while (escolha < 1 || escolha > 3 || (escolha == 3 && especial > 0));
        return escolha;
    }
}
