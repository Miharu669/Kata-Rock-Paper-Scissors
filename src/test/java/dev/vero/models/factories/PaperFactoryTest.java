
package dev.vero.models.factories;

import dev.vero.contracts.ISelectable;
import dev.vero.models.Paper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaperFactoryTest {

    @Test
    void testCreate() {
        PaperFactory paperFactory = new PaperFactory();

        ISelectable result = paperFactory.create();

        assertTrue(result instanceof Paper, "Expected result to be an instance of Paper");
    }
}
