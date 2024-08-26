package dev.vero.application;

import dev.vero.models.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RulesTest {

    private Rules rules;
    private Player player;
    private Player computer;

    @BeforeEach
    void setUp() {
       rules = new Rules();
        player = new Player();
        computer = new Player();
    }

    
    @Test
    void testRockCrushesScissors() {
        player.selectedObject("Rock");
        computer.selectedObject("Scissors");
        assertEquals("Rock crushes Scissors.", rules.winner(player, computer));
    }

    @Test
    void testScissorsCutsPaper() {
        player.selectedObject("Scissors");
        computer.selectedObject("Paper");
        assertEquals("Scissors cuts Paper.", rules.winner(player, computer));
    }

    @Test
    void testPaperCoversRock() {
        player.selectedObject("Paper");
        computer.selectedObject("Rock");
        assertEquals("Paper covers Rock.", rules.winner(player, computer));
    }

    @Test
    void testLizardPoisonsSpock() {
        player.selectedObject("Lizard");
        computer.selectedObject("Spock");
        assertEquals("Lizard poisons Spock.", rules.winner(player, computer));
    }

    @Test
    void testSpockVaporizesRock() {
        player.selectedObject("Spock");
        computer.selectedObject("Rock");
        assertEquals("Spock vaporizes Rock.", rules.winner(player, computer));
    }

    @Test
    void testLizardEatsPaper() {
        player.selectedObject("Lizard");
        computer.selectedObject("Paper");
        assertEquals("Lizard eats Paper.", rules.winner(player, computer));
    }

    @Test
    void testScissorsDecapitatesLizard() {
        player.selectedObject("Scissors");
        computer.selectedObject("Lizard");
        assertEquals("Scissors decapitates Lizard.", rules.winner(player, computer));
    }

    @Test
    void testPaperDisprovesSpock() {
        player.selectedObject("Paper");
        computer.selectedObject("Spock");
        assertEquals("Paper disproves Spock.", rules.winner(player, computer));
    }

    @Test
    void testSpockSmashesScissors() {
        player.selectedObject("Spock");
        computer.selectedObject("Scissors");
        assertEquals("Spock smashes Scissors.", rules.winner(player, computer));
    }

    @Test
    void testRockCrushesLizard() {
        player.selectedObject("Rock");
        computer.selectedObject("Lizard");
        assertEquals("Rock crushes Lizard.", rules.winner(player, computer));
    }

   

    @Test
    void testDrawWithRock() {
        player.selectedObject("Rock");
        computer.selectedObject("Rock");
        assertEquals("It's a draw!", rules.winner(player, computer));
    }

    @Test
    void testDrawWithPaper() {
        player.selectedObject("Paper");
        computer.selectedObject("Paper");
        assertEquals("It's a draw!", rules.winner(player, computer));
    }

    @Test
    void testDrawWithScissors() {
        player.selectedObject("Scissors");
        computer.selectedObject("Scissors");
        assertEquals("It's a draw!", rules.winner(player, computer));
    }

    @Test
    void testDrawWithLizard() {
        player.selectedObject("Lizard");
        computer.selectedObject("Lizard");
        assertEquals("It's a draw!", rules.winner(player, computer));
    }

    @Test
    void testDrawWithSpock() {
        player.selectedObject("Spock");
        computer.selectedObject("Spock");
        assertEquals("It's a draw!", rules.winner(player, computer));
    }

}
