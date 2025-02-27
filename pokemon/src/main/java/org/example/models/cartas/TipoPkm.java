package org.example.models.cartas;

import org.example.models.especiais.Especial;

public enum TipoPkm {

    CHARIZARD(new Especial("Fire Blast", 120)){

        @Override
        public int getHP(){return 1;};
        @Override
        public int getATK(){return 1;};
        @Override
        public int getDEF(){return 1;};
        },
    CHARMELEON(new Especial("Flamethrower", 80) ){
        @Override
        public int getHP(){return 1;};
        @Override
        public int getATK(){return 1;};
        @Override
        public int getDEF(){return 1;};
    },
    CHARMANDER(new Especial("Ember", 50) ){
        @Override
        public int getHP(){return 1;};
        @Override
        public int getATK(){return 1;};
        @Override
        public int getDEF(){return 1;};
    },

    BUTTERFREE(new Especial("Psychic", 90)){
        @Override
        public int getHP(){return 1;};
        @Override
        public int getATK(){return 1;};
        @Override
        public int getDEF(){return 1;};
    },
    METAPOD(new Especial("Harden", 0)){
        @Override
        public int getHP(){return 1;};
        @Override
        public int getATK(){return 1;};
        @Override
        public int getDEF(){return 1;};
    },
    CATERPIE(new Especial("Bug Bite", 30) ){
        @Override
        public int getHP(){return 1;};
        @Override
        public int getATK(){return 1;};
        @Override
        public int getDEF(){return 1;};
    };

    private final Especial especial;

    TipoPkm(Especial especial) {
        this.especial = especial;
    }

    abstract int getHP();
    abstract int getATK();
    abstract int getDEF();

    public Especial getEspecial() {
        return especial;
    }

}
