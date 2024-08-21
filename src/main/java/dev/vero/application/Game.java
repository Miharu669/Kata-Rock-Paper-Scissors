package dev.vero.application;

public abstract class Game {
    public abstract boolean beats(Game other);

    public abstract String getName();
}