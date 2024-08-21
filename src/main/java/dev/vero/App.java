package dev.vero;

import dev.vero.application.*;

import java.util.Random;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            GameCreate gameFactory = new GameCreate();

            System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock!");
            System.out.println("Pick one (0: Rock, 1: Paper, 2: Scissors, 3: Lizard, 4: Spock):");

            int playerPick = scanner.nextInt();
            Game playerMove = gameFactory.getMove(playerPick);

            if (playerMove == null) {
                System.out.println(
                        "You MUST choose one between 0 (Rock), 1 (Paper), or 2 (Scissors), 3 (Lizard), or 4 (Spock) .");
                return;
            }

            int computerPick = random.nextInt(3);
            Game computerMove = gameFactory.getMove(computerPick);

            System.out.println("Your pick: " + playerMove.getName());
            System.out.println("Computer pick: " + computerMove.getName());

            GameResult gameResult = new GameResult();
            String result = gameResult.winner(playerMove, computerMove);

            System.out.println(result);
        }
    }
}
