package dev.vero.models;

import dev.vero.application.Game;

public class Scissors extends Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Paper;
    }

    @Override
    public String getName() {
        return "Scissors";
    }
}