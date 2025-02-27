package org.example.models.cartas;

import java.util.ArrayList;

public class Deck implements Carta{

    private ArrayList<CartaPkm> deck;

    @Override
    public String getNome() {
        String temp ="";

        for(CartaPkm c : deck){
            temp = temp + c.getNome() + "\n";
        }

        return "";
    }

    @Override
    public int getHP() {
        return 0;
    }

    @Override
    public int getATK() {
        return 0;
    }

    @Override
    public int getDEF() {
        return 0;
    }



    public Deck(){
        this.deck = new ArrayList<>();
    }


    public Deck(ArrayList<CartaPkm> deck){
        this.deck = deck;
    }

    public ArrayList<CartaPkm> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<CartaPkm> deck) {
        this.deck = deck;
    }

    public boolean addCarta(CartaPkm carta){
        if(deck.size() == 6){
            System.out.println("Deck cheio");
            return false;
        }

        else {
            deck.add(carta);
            return true;
        }

    }

    public boolean removeCarta(int i) {
        return false;
    }

}
