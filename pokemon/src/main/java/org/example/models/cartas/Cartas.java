package org.example.models.cartas;

public interface Cartas {

    public String getNome();
    public boolean adicionaCarta(CartaPokemon pkm);
    public int getHP();
    public int getATK();
    public int getDEF();
    public int getESP();
    public void evoluir();
    public CartaPokemon[] getCartas();


}
