package dev.vero.application;

import dev.vero.models.Player;

import java.util.Scanner;

public class GameRunner {
    private final Scanner scanner;
    private final String[] choices = { "Rock", "Paper", "Scissors", "Lizard", "Spock" };

    public GameRunner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock!");

        String playerChoice = getPlayerChoice();
        Player player = new Player();
        player.selectedObject(playerChoice);

        String computerChoice = getComputerChoice();
        Player computer = new Player();
        computer.selectedObject(computerChoice);

        System.out.println("Player chose: " + playerChoice);
        System.out.println("Computer chose: " + computerChoice);

        Game game = new Game(player, computer);
        String result = game.getGameResult();

        System.out.println("Result: " + result);
    }

    private String getPlayerChoice() {
        System.out.println("Pick one (0: Rock, 1: Paper, 2: Scissors, 3: Lizard, 4: Spock):");
        int playerPick = scanner.nextInt();

        while (!isValidChoice(playerPick)) {
            System.out.println(
                    "You MUST choose a number between 0 (Rock), 1 (Paper), 2 (Scissors), 3 (Lizard), or 4 (Spock).");
            playerPick = scanner.nextInt();
        }

        return choices[playerPick];
    }

    private boolean isValidChoice(int choice) {
        return choice >= 0 && choice <= 4;
    }

    private String getComputerChoice() {
        return choices[(int) (Math.random() * choices.length)];
    }
}
