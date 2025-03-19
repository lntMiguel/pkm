package org.example.models.cartas;


public enum TipoPokemon {

    // Família Charmander
    CHARMANDER{
        @Override
        public int getHP()  { return 25;}
        @Override
        public int getATK() { return 14;}
        @Override
        public int getDEF() { return 8;}
        @Override
        public int getESP() { return 12;}
        @Override
        public TipoPokemon evoluir() { return CHARMELEON; }

    },
    CHARMELEON{
        @Override
        public int getHP()  { return 35;}
        @Override
        public int getATK() { return 18;}
        @Override
        public int getDEF() { return 12;}
        @Override
        public int getESP() { return 16;}
        @Override
        public TipoPokemon evoluir() { return CHARIZARD; }

    },
    CHARIZARD{
        @Override
        public int getHP()  { return 50;}
        @Override
        public int getATK() { return 24;}
        @Override
        public int getDEF() { return 18;}
        @Override
        public int getESP() { return 20;}
        @Override
        public TipoPokemon evoluir() { return null; }

    },

    // Família Squirtle
    SQUIRTLE{
        @Override
        public int getHP()  { return 28;}
        @Override
        public int getATK() { return 12;}
        @Override
        public int getDEF() { return 10;}
        @Override
        public int getESP() { return 10;}
        @Override
        public TipoPokemon evoluir() { return WARTORTLE; }

    },
    WARTORTLE{
        @Override
        public int getHP()  { return 40;}
        @Override
        public int getATK() { return 16;}
        @Override
        public int getDEF() { return 14;}
        @Override
        public int getESP() { return 14;}
        @Override
        public TipoPokemon evoluir() { return BLASTOISE; }

    },
    BLASTOISE{
        @Override
        public int getHP()  { return 55;}
        @Override
        public int getATK() { return 20;}
        @Override
        public int getDEF() { return 22;}
        @Override
        public int getESP() { return 18;}
        @Override
        public TipoPokemon evoluir() { return null; }

    },

    // Família Bulbasaur
    BULBASAUR{
        @Override
        public int getHP()  { return 26;}
        @Override
        public int getATK() { return 13;}
        @Override
        public int getDEF() { return 9;}
        @Override
        public int getESP() { return 11;}
        @Override
        public TipoPokemon evoluir() { return IVYSAUR; }

    },
    IVYSAUR{
        @Override
        public int getHP()  { return 38;}
        @Override
        public int getATK() { return 17;}
        @Override
        public int getDEF() { return 13;}
        @Override
        public int getESP() { return 15;}
        @Override
        public TipoPokemon evoluir() { return VENUSAUR; }

    },
    VENUSAUR{
        @Override
        public int getHP()  { return 52;}
        @Override
        public int getATK() { return 22;}
        @Override
        public int getDEF() { return 20;}
        @Override
        public int getESP() { return 18;}
        @Override
        public TipoPokemon evoluir() { return null; }

    },

    // Família Pikachu
    PICHU{
        @Override
        public int getHP()  { return 20;}
        @Override
        public int getATK() { return 15;}
        @Override
        public int getDEF() { return 6;}
        @Override
        public int getESP() { return 12;}
        @Override
        public TipoPokemon evoluir() { return PIKACHU; }
    },
    PIKACHU{
        @Override
        public int getHP()  { return 30;}
        @Override
        public int getATK() { return 20;}
        @Override
        public int getDEF() { return 10;}
        @Override
        public int getESP() { return 16;}
        @Override
        public TipoPokemon evoluir() { return RAICHU; }

    },
    RAICHU{
        @Override
        public int getHP()  { return 45;}
        @Override
        public int getATK() { return 25;}
        @Override
        public int getDEF() { return 16;}
        @Override
        public int getESP() { return 20;}
        @Override
        public TipoPokemon evoluir() { return null; }

    },

    // Família Gengar
    GASTLY{
        @Override
        public int getHP()  { return 22;}
        @Override
        public int getATK() { return 17;}
        @Override
        public int getDEF() { return 6;}
        @Override
        public int getESP() { return 14;}
        @Override
        public TipoPokemon evoluir() { return HAUNTER; }

    },
    HAUNTER{
        @Override
        public int getHP()  { return 32;}
        @Override
        public int getATK() { return 22;}
        @Override
        public int getDEF() { return 10;}
        @Override
        public int getESP() { return 18;}
        @Override
        public TipoPokemon evoluir() { return GENGAR; }

    },
    GENGAR{
        @Override
        public int getHP()  { return 48;}
        @Override
        public int getATK() { return 28;}
        @Override
        public int getDEF() { return 18;}
        @Override
        public int getESP() { return 22;}
        @Override
        public TipoPokemon evoluir() { return null; }

    };

    abstract int getHP();
    abstract int getATK();
    abstract int getESP();
    abstract int getDEF();
    abstract TipoPokemon evoluir();

}
