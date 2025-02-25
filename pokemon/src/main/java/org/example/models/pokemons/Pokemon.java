package org.example.models.pokemons;

public interface Pokemon {

    public int getHp();
    public int getATK();
    public void dano(int dano);
    public String getNomeEspecial();
    public int getDanoEspecial();
    void evoluir();
}
