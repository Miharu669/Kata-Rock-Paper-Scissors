package dev.vero.models;

import dev.vero.contracts.ISelectable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void testSelectedObjectValidType() {
        String type = "Lizard";

        player.selectedObject(type);

        ISelectable selectedObject = player.getObject();
        assertEquals(type, selectedObject.getType(), "Expected selected object to be of type 'Lizard'");
    }

    @Test
    void testSelectedObjectInvalidType() {
        String type = "Dragon";

        player.selectedObject(type);

        ISelectable selectedObject = player.getObject();
        assertNull(selectedObject, "Expected selected object to be null for an invalid type");
    }

    @Test
    void testSelectedObjectValidOtherType() {
        String type = "Rock";

        player.selectedObject(type);

        ISelectable selectedObject = player.getObject();
        assertEquals(type, selectedObject.getType(), "Expected selected object to be of type 'Rock'");
    }
}
