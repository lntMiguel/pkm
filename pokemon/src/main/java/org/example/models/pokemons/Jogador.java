package org.example.models.pokemons;

public class Jogador {

    private String nome;
    private Pokemon pkm;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pokemon getPkm() {
        return pkm;
    }

    public void setPkm(Pokemon pkm) {
        this.pkm = pkm;
    }

    public Jogador(String nome, Pokemon pkm) {
        this.nome = nome;
        this.pkm = pkm;
    }
}
