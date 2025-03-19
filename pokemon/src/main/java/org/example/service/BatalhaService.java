package org.example.service;

import org.example.models.cartas.CartaPokemon;
import org.example.models.jogador.Jogador;

public class BatalhaService {

    public int calcularDano(CartaPokemon atacante, CartaPokemon defensor, int escolhaAtacante, int escolhaDefensor, Jogador jAtacante, Jogador jDefensor) {
        int danoBase = atacante.getATK() + jAtacante.getItem().melhoraATK();

        if (escolhaAtacante == 3) {
            danoBase = atacante.getESP() + jAtacante.getItem().melhoraATK();
        }

        if (escolhaDefensor == 2) {
            return danoBase - (defensor.getDEF() + jDefensor.getItem().melhoraDEF());
        }

        return danoBase;
    }

    public int atualizarEspecial(int especial, int escolha) {
        if (escolha == 3) {
            return 2;
        } else {
            return especial - 1;
        }
    }

    public void exibirOpcoes(Jogador jogador, int especial) {
        System.out.println("\n\n" +jogador.getNome() + ", escolha uma ação:");
        System.out.println("1- Atacar\n2- Defender");
        System.out.println(especial > 0 ? "3- Especial (Bloqueado, falta " + especial + " ações)" : "3- Especial");
        System.out.print("Escolha: ");
    }

    public void processarTurno(CartaPokemon atacante, CartaPokemon defensor, int escolhaAtacante, int escolhaDefensor, Jogador jAtacante, Jogador jDefensor) {
        if (escolhaAtacante == 1 || escolhaAtacante == 3) {
            int dano = calcularDano(atacante, defensor, escolhaAtacante, escolhaDefensor, jAtacante, jDefensor);
            defensor.setCurrentHp(defensor.getCurrentHp() - dano);
            System.out.println("\n ###" + atacante.getNome() + " causou " + dano + " de dano em " + defensor.getNome() + "###");
        }
    }

    public boolean verificaFim(CartaPokemon pkm1, CartaPokemon pkm2) {
        return pkm1.getCurrentHp() <= 0 || pkm2.getCurrentHp() <= 0;
    }

    public void atualizarPontuacao(Jogador vencedor) {
        vencedor.setPontuacao(vencedor.getPontuacao() + 1);
    }

    public void exibirVencedorFinal(Jogador jogador1, Jogador jogador2) {
        System.out.println("Pontuação Final:");
        System.out.println("###" + jogador1.getNome() + ": " + jogador1.getPontuacao() + " pontos###");
        System.out.println(jogador2.getNome() + ": " + jogador2.getPontuacao() + " pontos");

        if (jogador1.getPontuacao() > jogador2.getPontuacao()) {
            System.out.println("\n###Jogador 1 venceu!###\n");
        } else if (jogador2.getPontuacao() > jogador1.getPontuacao()) {
            System.out.println("\n###Jogador 2 venceu!###\n");
        }
    }

    public int evoluir(CartaPokemon pkm1, CartaPokemon pkm2, int contadorAcoes) {
        contadorAcoes++;
        if (contadorAcoes >= 3) {
            pkm1.evoluir();
            pkm2.evoluir();
            System.out.println("\n####Os Pokémon evoluíram!####\n");
            contadorAcoes = 0;
        }
        return contadorAcoes;
    }
}
