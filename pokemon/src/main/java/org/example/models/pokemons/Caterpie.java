package org.example.models.pokemons;

import org.example.models.especiais.Especial;

public class Caterpie implements Pokemon{

    private Atributos atb;

    private Especial especial;

    public Caterpie(){
        this.atb = new Atributos(20,100);
        this.especial = new Especial("Bug Bite", 30);
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
