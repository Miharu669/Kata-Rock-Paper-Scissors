package dev.vero.models;

import dev.vero.application.Game;

public class Paper implements Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Rock;
    }

    @Override
    public String getName() {
        return "Paper";
    }
}