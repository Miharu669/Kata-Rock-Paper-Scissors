package dev.vero.models.factories;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dev.vero.contracts.ISelectable;
import dev.vero.models.Rock;

public class RockFactoryTest {
     @Test
    void testCreate() {
        RockFactory rockFactory = new RockFactory();

        ISelectable result = rockFactory.create();

        assertTrue(result instanceof Rock, "Expected result to be an instance of Rock");
    }
}
