package org.example.models.pokemons;

public class Atributos {

    private int hp;
    private int atk;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public Atributos(int atk, int hp) {
        this.atk = atk;
        this.hp = hp;
    }
}
