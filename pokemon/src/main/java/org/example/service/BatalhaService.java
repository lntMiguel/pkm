package org.example.service;

import org.example.models.jogador.Jogador;

public class BatalhaService {
/*
    public void processarTurno(Jogador atacante, Jogador defensor, int escolhaAtacante, int escolhaDefensor) {
        if (escolhaAtacante == 1 || escolhaAtacante == 3) {
            int dano = calcularDano(atacante, defensor, escolhaAtacante, escolhaDefensor);
            defensor.getPkm().dano(dano);
            System.out.println(atacante.getNome() + " causou " + dano + " de dano em " + defensor.getNome());
        }
    }

    public int calcularDano(Jogador atacante,Jogador defensor, int escolhaAtacante, int escolhaDefensor) {
        int danoBase = atacante.getATK();

        if (escolhaAtacante == 3) {
            danoBase = atacante.getPkm().getDanoEspecial();
        }

        if (escolhaDefensor == 2) {
            return danoBase - defensor.getDEF();
        }

        return danoBase;
    }

    public int atualizarEspecial(int especial, int escolha) {

        if(escolha == 3){
            return 2;

        }
        else{
            return especial - 1;
        }
    }

    public boolean verificaFim(Jogador jogador1, Jogador jogador2) {
        return jogador1.getPkmHP() <= 0 || jogador2.getPkmHP() <= 0;
    }

    public void exibirVencedor(Jogador jogador1, Jogador jogador2) {
        System.out.println("Fim da batalha!");
        System.out.println((jogador1.getPkmHP() > 0 ? jogador1.getNome() : jogador2.getNome()) + " venceu!");
    }

    public void exibirOpcoes(Jogador jogador, int especial) {
        System.out.println(jogador.getNome() + ", escolha uma ação:");
        System.out.println("1- Atacar\n2- Defender");
        System.out.println(especial > 0 ? "3- Especial (Bloqueado, falta " + especial + " rounds)" : "3- Especial");
        System.out.print("Escolha: ");
    }
    */
}
