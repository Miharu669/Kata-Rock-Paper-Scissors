package dev.vero.models;

import dev.vero.application.Game;

public class Rock extends Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Scissors;
    }

    @Override
    public String getName() {
        return "Rock";
    }
}