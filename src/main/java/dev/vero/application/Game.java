package dev.vero.application;

import dev.vero.models.Player;

public class Game {

    private Player player;
    private Player computer;

    public Game(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
    }

    public String getGameResult() {
        Rules result = new Rules(); 
        return result.winner(player, computer); 
    }
}
