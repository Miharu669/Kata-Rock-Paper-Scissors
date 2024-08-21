package dev.vero.application;

import dev.vero.models.*;

public class GameResult {
    public String winner(Game player, Game computer) {
        if (player.getClass() == computer.getClass()) {
            return "It's a tie!";
        } else if (player.beats(computer)) {
            return getVictoryMessage(player, computer, true);
        } else {
            return getVictoryMessage(computer, player, false);
        }
    }

    private String getVictoryMessage(Game winner, Game loser, boolean isPlayerWinner) {
        String resultMessage = isPlayerWinner ? "Congrats, You won!" : "You lost. Try again!";

        if (winner instanceof Scissors && loser instanceof Paper) {
            return "Scissors cuts Paper. " + resultMessage;
        } else if (winner instanceof Paper && loser instanceof Rock) {
            return "Paper covers Rock. " + resultMessage;
        } else if (winner instanceof Rock && loser instanceof Lizard) {
            return "Rock crushes Lizard. " + resultMessage;
        } else if (winner instanceof Lizard && loser instanceof Spock) {
            return "Lizard poisons Spock. " + resultMessage;
        } else if (winner instanceof Spock && loser instanceof Scissors) {
            return "Spock smashes Scissors. " + resultMessage;
        } else if (winner instanceof Scissors && loser instanceof Lizard) {
            return "Scissors decapitates Lizard. " + resultMessage;
        } else if (winner instanceof Lizard && loser instanceof Paper) {
            return "Lizard eats Paper. " + resultMessage;
        } else if (winner instanceof Paper && loser instanceof Spock) {
            return "Paper disproves Spock. " + resultMessage;
        } else if (winner instanceof Spock && loser instanceof Rock) {
            return "Spock vaporizes Rock. " + resultMessage;
        } else if (winner instanceof Rock && loser instanceof Scissors) {
            return "Rock crushes Scissors. " + resultMessage;
        } else {
            return "Something went wrong. Try again.";
        }
    }

}
