package dev.vero.models;

import dev.vero.application.Game;

public class Scissors implements Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Paper || other instanceof Lizard;
    }

    @Override
    public String getName() {
        return "Scissors";
    }
}