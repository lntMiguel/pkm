package org.example.models.jogador;

import org.example.models.cartas.Deck;
import org.example.models.itens.Item;

public class Jogador {

    private String nome;
    private Deck deck ;
    private Item item;
    private int hp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Jogador(String nome, Deck deck, Item item,int hp) {
        this.nome = nome;
        this.deck = deck ;
        this.item = item;
        this.hp = hp;
    }

    public Jogador(){
        this.nome = "nome";
        this.deck = new Deck();
        this.item = Item.FORCA;
        this.hp = 50;
    }

}
