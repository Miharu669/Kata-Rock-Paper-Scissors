package dev.vero.models;

import dev.vero.application.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScissorsTest {

    @Test
    void testScissorsBeatsPaper() {
        Game scissors = new Scissors();
        Game paper = new Paper();
        assertTrue(scissors.beats(paper), "Scissors should beat Paper");
    }

    @Test
    void testScissorsDoesNotBeatRock() {
        Game scissors = new Scissors();
        Game rock = new Rock();
        assertFalse(scissors.beats(rock), "Scissors should not beat Rock");
    }

    @Test
    void testScissorsDoesNotBeatScissors() {
        Game scissors1 = new Scissors();
        Game scissors2 = new Scissors();
        assertFalse(scissors1.beats(scissors2), "Scissors should not beat Scissors");
    }

    @Test
    void testGetName() {
        Game scissors = new Scissors();
        assertEquals("Scissors", scissors.getName(), "The name should be 'Scissors'");
    }
}
