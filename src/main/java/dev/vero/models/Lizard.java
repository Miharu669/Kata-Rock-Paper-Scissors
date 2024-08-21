package dev.vero.models;

import dev.vero.application.*;

public class Lizard implements Game {
    @Override
    public boolean beats(Game other) {
        return other instanceof Paper || other instanceof Spock;
    }

    @Override
    public String getName() {
        return "Lizard";

    }
}
