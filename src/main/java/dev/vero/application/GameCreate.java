package dev.vero.application;

import dev.vero.models.*;

public class GameCreate {
    public Game getMove(int choice) {
        switch (choice) {
            case 0:
                return new Rock();
            case 1:
                return new Paper();
            case 2:
                return new Scissors();
            case 3: 
                return new Lizard();
            case 4:
                return new Spock();
            default:
                return null;
        }
    }
}
