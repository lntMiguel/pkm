package org.example.models.factory;

import org.example.models.cartas.CartaPokemon;
import org.example.models.cartas.TipoPokemon;

public final class CartaPokemonFactory {

    private CartaPokemonFactory() {
        // Construtor privado para impedir instanciação
        throw new UnsupportedOperationException("Esta é uma classe utilitária e não pode ser instanciada.");
    }

    public static CartaPokemon criarCarta(TipoPokemon tipo) {
        return new CartaPokemon(tipo);
    }
}
