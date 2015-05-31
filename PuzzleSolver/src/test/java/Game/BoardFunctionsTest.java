package Game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static Game.BoardFunctions.*;

/**
 *
 * @author Johanna
 */
public class BoardFunctionsTest {

    private Board testBoard;
    private int[] testGoal;
    private int[] testNumbers;

    public BoardFunctionsTest() {
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
        assertEquals(getTile(0, testBoard), 15);
    }

    @Test
    public void returnsNumberInLastIndex() {
        assertEquals(getTile(15, testBoard), 0);
    }

    @Test
    public void canBeMonvedIfNextToAnEmptySlot() {
        testBoard = moveTile(1, testBoard);
        assertEquals(getNumberIndex(1, testBoard), 15);
    }

    @Test
    public void canBeMovedIfNextToAnEmptySlot2() {
        testBoard = moveTile(4, testBoard);
        assertEquals(getNumberIndex(4, testBoard), 15);

    }

    @Test
    public void cannotBeMovedIfNotNextToAnEmptySlot() {
        testBoard = moveTile(3, testBoard);
        assertEquals(getNumberIndex(3, testBoard), 12);
    }

    @Test
    public void cannotBeMovedIfNotNextToAnEmptySlot2() {
        testBoard = moveTile(12, testBoard);
        assertEquals(getNumberIndex(12, testBoard), 3);
    }

    @Test
    public void checksVictory() {
        assertEquals(checkVictory(testBoard), false);
    }
    @Test
    public void checksVictoryBoard() {
        testBoard = new Board(testGoal);
        assertEquals(checkVictory(testBoard), true);
    }
}
