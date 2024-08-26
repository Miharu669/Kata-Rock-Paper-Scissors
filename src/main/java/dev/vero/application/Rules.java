package dev.vero.application;

import dev.vero.models.Player;

public class Rules {

    public String winner(Player player, Player computer) {
        String playerType = player.getObject().getType();
        String computerType = computer.getObject().getType();

        if ((playerType.equals("Paper") && computerType.equals("Scissors"))
                || (playerType.equals("Scissors") && computerType.equals("Paper"))) {
            return "Scissors cuts Paper.";
        }
        if ((playerType.equals("Paper") && computerType.equals("Rock"))
                || (playerType.equals("Rock") && computerType.equals("Paper"))) {
            return "Paper covers Rock.";
        }
        if ((playerType.equals("Rock") && computerType.equals("Lizard"))
                || (playerType.equals("Lizard") && computerType.equals("Rock"))) {
            return "Rock crushes Lizard.";
        }
        if ((playerType.equals("Spock") && computerType.equals("Lizard"))
                || (playerType.equals("Lizard") && computerType.equals("Spock"))) {
            return "Lizard poisons Spock.";
        }

        if ((playerType.equals("Scissors") && computerType.equals("Lizard"))
                || (playerType.equals("Lizard") && computerType.equals("Scissors"))) {
            return "Scissors decapitates Lizard.";
        }
        if ((playerType.equals("Paper") && computerType.equals("Lizard"))
                || (playerType.equals("Lizard") && computerType.equals("Paper"))) {
            return "Lizard eats Paper.";
        }

        if ((playerType.equals("Rock") && computerType.equals("Scissors"))
                || (playerType.equals("Scissors") && computerType.equals("Rock"))) {
            return "Rock crushes Scissors.";
        }

        if (playerType.equals(computerType)) {
            return "It's a draw!";
        }

        return null;
    }
}
