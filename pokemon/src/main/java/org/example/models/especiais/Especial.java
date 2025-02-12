package org.example.models.especiais;

public class Especial {

    private String nome;
    private int atk;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public Especial(String nome, int atk) {
        this.nome = nome;
        this.atk = atk;
    }
}
