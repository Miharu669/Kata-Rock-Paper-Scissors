package dev.vero.models;

import dev.vero.application.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockTest {

    @Test
    void testRockBeatsScissors() {
        Game rock = new Rock();
        Game scissors = new Scissors();
        assertTrue(rock.beats(scissors), "Rock should beat Scissors");
    }

    @Test
    void testRockDoesNotBeatPaper() {
        Game rock = new Rock();
        Game paper = new Paper();
        assertFalse(rock.beats(paper), "Rock should not beat Paper");
    }

    @Test
    void testRockDoesNotBeatRock() {
        Game rock1 = new Rock();
        Game rock2 = new Rock();
        assertFalse(rock1.beats(rock2), "Rock should not beat Rock");
    }

    @Test
    void testGetName() {
        Game rock = new Rock();
        assertEquals("Rock", rock.getName(), "The name should be 'Rock'");
    }
}
