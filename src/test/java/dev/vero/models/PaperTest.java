// package dev.vero.models;

// import dev.vero.application.Game;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;

// public class PaperTest {

//     @Test
//     void testPaperBeatsRock() {
//         Game paper = new Paper();
//         Game rock = new Rock();
//         assertTrue(paper.beats(rock), "Paper should beat Rock");
//     }
//     @Test
//     void testPaperBeatsSpock() {
//         Game paper = new Paper();
//         Game spock = new Spock();
//         assertTrue(paper.beats(spock), "Paper should beat Spock");
//     }
//     @Test
//     void testPaperDoesNotBeatPaper() {
//         Game paper1 = new Paper();
//         Game paper2 = new Paper();
//         assertFalse(paper1.beats(paper2), "Paper should not beat Paper");
//     }

//     @Test
//     void testPaperDoesNotBeatScissors() {
//         Game paper = new Paper();
//         Game scissors = new Scissors();
//         assertFalse(paper.beats(scissors), "Paper should not beat Scissors");
//     }

//     @Test
//     void testGetName() {
//         Game paper = new Paper();
//         assertEquals("Paper", paper.getName(), "The name should be 'Paper'");
//     }
// }
