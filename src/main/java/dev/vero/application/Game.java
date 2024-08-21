package dev.vero.application;

public interface Game {
    boolean beats(Game other);
    String getName();
}
