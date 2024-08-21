package dev.vero.models;

import dev.vero.application.Game;

public class Rock implements Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Scissors || other instanceof Lizard;
    }

    @Override
    public String getName() {
        return "Rock";
    }
}