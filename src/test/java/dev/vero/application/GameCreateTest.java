// package dev.vero.application;

// import dev.vero.models.*;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertNull;


// public class GameCreateTest {

//     @Test
//     void testGetMoveRock() {
//         GameCreate gameCreate = new GameCreate();
//         Game move = gameCreate.getMove(0);
//         assertTrue(move instanceof Rock, "Choice 0 should return an instance of Rock");
//     }

//     @Test
//     void testGetMovePaper() {
//         GameCreate gameCreate = new GameCreate();
//         Game move = gameCreate.getMove(1);
//         assertTrue(move instanceof Paper, "Choice 1 should return an instance of Paper");
//     }

//     @Test
//     void testGetMoveScissors() {
//         GameCreate gameCreate = new GameCreate();
//         Game move = gameCreate.getMove(2);
//         assertTrue(move instanceof Scissors, "Choice 2 should return an instance of Scissors");
//     }

//     @Test
//     void testGetMoveInvalid() {
//         GameCreate gameCreate = new GameCreate();
//         Game move = gameCreate.getMove(3); 
//         assertNull(move, "Invalid choice should return null");
//     }

//     @Test
//     void testGetMoveNegativeChoice() {
//         GameCreate gameCreate = new GameCreate();
//         Game move = gameCreate.getMove(-1); 
//         assertNull(move, "Negative choice should return null");
//     }
// }
