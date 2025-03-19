package org.example.models.cartas;

import org.example.models.factory.CartaPokemonFactory;

public class CartaPokemon implements Cartas {

    private TipoPokemon pkm;

    private int currentHp;

    public CartaPokemon(){
        this.pkm = TipoPokemon.CHARMANDER;
        this.currentHp = pkm.getHP();
    }

    public CartaPokemon(TipoPokemon pkm){
        this.pkm = pkm;
        this.currentHp = pkm.getHP();
    }

    public TipoPokemon getTipoPokemon(){
        return this.pkm;
    }

    @Override
    public boolean adicionaCarta(CartaPokemon cpkm){
        if (this.pkm != null) return false;
        this.pkm = cpkm.getTipoPokemon();
        return true;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    @Override
    public int getHP(){
        return this.pkm.getHP();
    }

    @Override
    public int getATK(){
        return this.pkm.getATK();
    }

    @Override
    public int getDEF(){
        return this.pkm.getDEF();
    }

    @Override
    public int getESP(){
        return this.pkm.getESP();
    }

    @Override
    public void evoluir() {
        TipoPokemon pkm = this.pkm.evoluir();
        if(pkm == null){
            return;
        }
        this.currentHp = pkm.getHP() - this.getCurrentHp();
        this.pkm = pkm;
    }

    @Override
    public String getNome(){
        return this.pkm.name();
    }

    @Override
    public CartaPokemon[] getCartas() {
        CartaPokemon[] tmp = new CartaPokemon[1];
        tmp[0] = CartaPokemonFactory.criarCarta(this.pkm);

        return tmp;
    }
}
