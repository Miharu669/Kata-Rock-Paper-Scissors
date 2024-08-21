package dev.vero.models;

import dev.vero.application.*;

public class Spock implements Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Scissors || other instanceof Rock;
    }

    @Override
    public String getName() {
        return "Spock";
    }
}
