package dev.vero.application;

public class GameResult {
    public String winner(Game player, Game computer) {
        if (player.getClass() == computer.getClass()) {
            return "It's a draw!";
        } else if (player.beats(computer)) {
            return "Congrats, You won!";
        } else {
            return "You lost. Try again!";
        }
    }
}
