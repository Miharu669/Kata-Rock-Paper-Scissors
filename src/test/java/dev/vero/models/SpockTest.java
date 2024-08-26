package dev.vero.models;

import dev.vero.application.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpockTest {

    @Test
    void testSpockBeatsRock() {
        Game spock = new Spock();
        Game rock = new Rock();
        assertTrue(spock.beats(rock), "Spock should beat Rock");
    }

    @Test
    void testSpockBeatsScissors() {
        Game spock = new Spock();
        Game scissors = new Scissors();
        assertTrue(spock.beats(scissors), "Spock should beat Scissors");
    }

    @Test
    void testSpockDoesNotBeatPaper() {
        Game spock = new Spock();
        Game paper = new Paper();
        assertFalse(spock.beats(paper), "Spock should not beat Paper");
    }

    @Test
    void testSpockDoesNotBeatLizard() {
        Game spock = new Spock();
        Game lizard = new Lizard();
        assertFalse(spock.beats(lizard), "Spock should not beat Lizard");
    }

    @Test
    void testSpockDoesNotBeatSpock() {
        Game spock1 = new Spock();
        Game spock2 = new Spock();
        assertFalse(spock1.beats(spock2), "Spock should not beat Spock");
    }

    @Test
    void testGetName() {
        Game spock = new Spock();
        assertEquals("Spock", spock.getName(), "The name should be 'Spock'");
    }
}
