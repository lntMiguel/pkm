package org.example.models.cartas;

public class CartaPkm implements Carta {

    private TipoPkm pkm;

    public CartaPkm(TipoPkm pkm){
        this.pkm = TipoPkm.CHARMANDER;
    }

    @Override
    public String getNome() {
        return this.pkm.name();
    }

    @Override
    public int getHP() {
        return this.pkm.getHP();
    }

    @Override
    public int getATK() {
        return this.pkm.getATK();
    }

    @Override
    public int getDEF() {
        return this.pkm.getDEF();
    }
}
