package Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johanna
 */
public class BoardTest {

    private Board testBoard;
    private int[] testGoal;
    private int[] testNumbers;

    public BoardTest() {
    }

    @Before
    public void setUp() {

        testNumbers = new int[16];
        for (int i = 0; i < 16; i++) {
            testNumbers[i] = 15 - i;
        }

        testGoal = new int[16];
        for (int i = 0; i < 15; i++) {
            testGoal[i] = i + 1;
        }
        testGoal[15] = 0;

        testBoard = new Board(testNumbers);
    }

    @Test
    public void newBoardIsGeneratedWithGivenNumbers() {
        assertEquals(testNumbers, testBoard.getBoard());
    }

    @Test
    public void returnsNumberInFirstIndex() {
        assertEquals(testBoard.getTile(0), 15);
    }

    @Test
    public void returnsNumberInLastIndex() {
        assertEquals(testBoard.getTile(15), 0);
    }

    @Test
    public void canBeMonvedIfNextToAnEmptySlot() {
        testBoard.moveTile(1);
        assertEquals(testBoard.getNumberIndex(1), 15);
    }

    @Test
    public void canBeMovedIfNextToAnEmptySlot2() {
        testBoard.moveTile(4);
        assertEquals(testBoard.getNumberIndex(4), 15);

    }

    @Test
    public void cannotBeMovedIfNotNextToAnEmptySlot() {
        testBoard.moveTile(3);
        assertEquals(testBoard.getNumberIndex(3), 12);
    }

    @Test
    public void cannotBeMovedIfNotNextToAnEmptySlot2() {
        testBoard.moveTile(12);
        assertEquals(testBoard.getNumberIndex(12), 3);
    }

    @Test
    public void checksVictory() {
        assertEquals(testBoard.checkVictory(), false);
    }
    @Test
    public void checksVictoryBoard() {
        testBoard = new Board(testGoal);
        assertEquals(testBoard.checkVictory(), true);
    }
}
