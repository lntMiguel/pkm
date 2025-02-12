package org.example.models.pokemons;

import org.example.models.especiais.Especial;

public class Charmander implements Pokemon{

    private Atributos atb;

    private Especial especial;

    public Charmander(){
        this.atb = new Atributos(30,100);
        this.especial = new Especial("Ember", 50);
    }


    @Override
    public int getHp() {
        return this.atb.getHp();
    }

    @Override
    public int getATK() {
        return this.atb.getAtk();
    }

    @Override
    public void dano(int dano) {
        atb.setHp(atb.getHp() - dano);
    }

    @Override
    public String getNomeEspecial() {
        return especial.getNome();
    }

    @Override
    public int getDanoEspecial() {
        return especial.getAtk();
    }
}
