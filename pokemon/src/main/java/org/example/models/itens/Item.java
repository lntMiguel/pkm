package org.example.models.itens;

public enum Item {

    FORCA(10, 0),
    VIDA(0,10);

    int atk;
    int def;

    private Item(int atk, int def){
        this.atk = atk;
        this.def = def;
    }

}
