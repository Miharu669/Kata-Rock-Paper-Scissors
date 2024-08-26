package dev.vero.application;

import dev.vero.models.Player;
import dev.vero.models.SelectableEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private Player player;
    private Player computer;
    private Game game;

    @BeforeEach
    void setUp() {
        player = new Player();
        computer = new Player();
        game = new Game(player, computer);
    }

    @Test
    void testPlayerWins() {
        player.selectedObject(SelectableEnum.Rock.getSelectable().getType());
        computer.selectedObject(SelectableEnum.Scissors.getSelectable().getType());

        String result = game.getGameResult();
        assertEquals("Rock crushes Scissors.", result);
    }

    @Test
    void testComputerWins() {
        player.selectedObject(SelectableEnum.Rock.getSelectable().getType());
        computer.selectedObject(SelectableEnum.Paper.getSelectable().getType());

        String result = game.getGameResult();
        assertEquals("Paper covers Rock.", result);
    }

    @Test
    void testDraw() {
        player.selectedObject(SelectableEnum.Rock.getSelectable().getType());
        computer.selectedObject(SelectableEnum.Rock.getSelectable().getType());

        String result = game.getGameResult();
        assertEquals("It's a draw!", result);
    }

}
