package org.example.models.jogador;

import org.example.models.cartas.CartaPokemon;
import org.example.models.cartas.Cartas;
import org.example.models.cartas.Deck;
import org.example.models.cartas.TipoPokemon;
import org.example.models.factory.CartaPokemonFactory;
import org.example.models.itens.TipoItens;

public class Jogador {

    private Cartas carta;
    private TipoItens item;
    private String nome;
    private int pontuacao;

    public Jogador(){
        this.nome = "Ash";
        this.carta = new Deck();
        this.carta.adicionaCarta(CartaPokemonFactory.criarCarta(TipoPokemon.CHARMANDER));
        this.carta.adicionaCarta(CartaPokemonFactory.criarCarta(TipoPokemon.CHARMANDER));
        this.carta.adicionaCarta(CartaPokemonFactory.criarCarta(TipoPokemon.CHARMANDER));
        this.item = TipoItens.POCAO;
    }

    public Jogador (CartaPokemon c, TipoItens i){
        this.carta = c;
        this.item = i;
    }

    public String getNomeCarta(){
        return carta.getNome();
    }

    public boolean adicionaCarta(CartaPokemon cpkm){
        if(carta.getClass().getSimpleName().equals("CartaPokemon")){
            Cartas tmp = this.carta;
            this.carta = new Deck();
            this.carta.adicionaCarta(tmp.getCartas()[0]);
        }
        return this.carta.adicionaCarta(cpkm);
    }

    public Cartas getCarta() {
        return carta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public TipoItens getItem() {
        return item;
    }
}
