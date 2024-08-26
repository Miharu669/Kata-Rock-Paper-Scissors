package dev.vero;

import dev.vero.application.GameRunner;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameRunner gameRunner = new GameRunner(scanner);

        gameRunner.run();
        scanner.close();
    }
}
