package dev.vero.models.factories;

import dev.vero.contracts.ISelectable;
import dev.vero.models.Lizard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LizardFactoryTest {

    @Test
    void testCreate() {
        LizardFactory lizardFactory = new LizardFactory();

        ISelectable result = lizardFactory.create();

        assertTrue(result instanceof Lizard, "Expected result to be an instance of Lizard");
    }
}
