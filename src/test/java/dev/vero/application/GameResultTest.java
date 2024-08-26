// package dev.vero.application;

// import dev.vero.models.*;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// class GameResultTest {

//     @Test
//     void testWinnerRockVsScissors() {
//         GameResult gameResult = new GameResult();
//         Game rock = new Rock();
//         Game scissors = new Scissors();
//         String result = gameResult.winner(rock, scissors);
//         assertEquals("Rock crushes Scissors. Congrats, You won!", result, "Rock crushes Scissors.");
//     }

//     @Test
//     void testWinnerScissorsVsPaper() {
//         GameResult gameResult = new GameResult();
//         Game scissors = new Scissors();
//         Game paper = new Paper();
//         String result = gameResult.winner(scissors, paper);
//         assertEquals("Scissors cuts Paper. Congrats, You won!", result, "Scissors cuts Paper.");
//     }

//     @Test
//     void testWinnerPaperVsRock() {
//         GameResult gameResult = new GameResult();
//         Game paper = new Paper();
//         Game rock = new Rock();
//         String result = gameResult.winner(paper, rock);
//         assertEquals("Paper covers Rock. Congrats, You won!", result, "Paper covers Rock.");
//     }

//     @Test
//     void testTieRockVsRock() {
//         GameResult gameResult = new GameResult();
//         Game rock1 = new Rock();
//         Game rock2 = new Rock();
//         String result = gameResult.winner(rock1, rock2);
//         assertEquals("It's a draw!", result, "Rock vs Rock should be a tie.");
//     }

//     @Test
//     void testTiePaperVsPaper() {
//         GameResult gameResult = new GameResult();
//         Game paper1 = new Paper();
//         Game paper2 = new Paper();
//         String result = gameResult.winner(paper1, paper2);
//         assertEquals("It's a draw!", result, "Paper vs Paper should be a tie.");
//     }

//     @Test
//     void testTieScissorsVsScissors() {
//         GameResult gameResult = new GameResult();
//         Game scissors1 = new Scissors();
//         Game scissors2 = new Scissors();
//         String result = gameResult.winner(scissors1, scissors2);
//         assertEquals("It's a draw!", result, "Scissors vs Scissors should be a tie.");
//     }


 // }
