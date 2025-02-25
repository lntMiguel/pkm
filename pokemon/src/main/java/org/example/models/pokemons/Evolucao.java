package org.example.models.pokemons;

import org.example.models.especiais.Especial;

public enum Evolucao {

    CHARIZARD(new Atributos(80, 200), new Especial("Fire Blast", 120), null),
    CHARMELEON(new Atributos(50, 150),  new Especial("Flamethrower", 80), Evolucao.CHARIZARD ),
    CHARMANDER( new Atributos(30, 100), new Especial("Ember", 50), Evolucao.CHARMELEON ),

    BUTTERFREE(new Atributos(60, 120),new Especial("Psychic", 90), null),
    METAPOD(new Atributos(30, 50), new Especial("Harden", 0), Evolucao.BUTTERFREE),
    CATERPIE(new Atributos(20, 100), new Especial("Bug Bite", 30), Evolucao.METAPOD );

    private final Atributos atributos;
    private final Especial especial;
    private final Evolucao proximaEvolucao;

    Evolucao(Atributos atributos, Especial especial, Evolucao proximaEvolucao) {
        this.atributos = atributos;
        this.especial = especial;
        this.proximaEvolucao = proximaEvolucao;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public Especial getEspecial() {
        return especial;
    }

    public Evolucao getProximaEvolucao() {
        return proximaEvolucao;
    }
}
