package dev.vero.models;

import dev.vero.application.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LizardTest {

    @Test
    void testLizardBeatsPaper() {
        Game lizard = new Lizard();
        Game paper = new Paper();
        assertTrue(lizard.beats(paper), "Lizard should beat Paper");
    }

    @Test
    void testLizardBeatsSpock() {
        Game lizard = new Lizard();
        Game spock = new Spock();
        assertTrue(lizard.beats(spock), "Lizard should beat Spock");
    }

    @Test
    void testLizardDoesNotBeatRock() {
        Game lizard = new Lizard();
        Game rock = new Rock();
        assertFalse(lizard.beats(rock), "Lizard should not beat Rock");
    }

    @Test
    void testLizardDoesNotBeatScissors() {
        Game lizard = new Lizard();
        Game scissors = new Scissors();
        assertFalse(lizard.beats(scissors), "Lizard should not beat Scissors");
    }

    @Test
    void testGetName() {
        Game lizard = new Lizard();
        assertEquals("Lizard", lizard.getName(), "The name should be 'Lizard'");
    }
}
