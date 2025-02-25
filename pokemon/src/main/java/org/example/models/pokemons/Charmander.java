package org.example.models.pokemons;

import org.example.models.especiais.Especial;

public class Charmander implements Pokemon {
    private Evolucao evolucao;
    private Atributos atributos;

    public Charmander() {
        this.evolucao = Evolucao.CHARMANDER;
        this.atributos = this.evolucao.getAtributos();
    }

    @Override
    public int getHp() {
        return atributos.getHp();
    }

    @Override
    public int getATK() {
        return atributos.getAtk();
    }

    @Override
    public void dano(int dano) {
        this.atributos = this.atributos.reduzirHp(dano);
    }

    @Override
    public String getNomeEspecial() {
        return evolucao.getEspecial().getNome();
    }

    @Override
    public int getDanoEspecial() {
        return evolucao.getEspecial().getAtk();
    }

    @Override
    public void evoluir() {
        if (evolucao.getProximaEvolucao() != null) {
            this.evolucao = evolucao.getProximaEvolucao();
            this.atributos = this.evolucao.getAtributos();
            System.out.println("Seu Pokémon evoluiu para " + evolucao.name() + "!");
        } else {
            System.out.println("Seu Pokémon já está na evolução máxima!");
        }
    }
}
