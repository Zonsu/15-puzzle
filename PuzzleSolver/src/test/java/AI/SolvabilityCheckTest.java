/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AI;

import Game.Board;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static AI.SolvabilityCheck.*;

/**
 *
 * @author Johanna
 */
public class SolvabilityCheckTest {

    private Board solvable;
    private Board notSolvable;

    public SolvabilityCheckTest() {
    }

    @Before
    public void setUp() {
        int[] testNumbers = new int[16];
        for (int i = 0; i < 16; i++) {
            testNumbers[i] = 15 - i;
        }

        notSolvable = new Board(testNumbers);

        testNumbers = new int[16];
        for (int i = 1; i < 15; i++) {
            testNumbers[i - 1] = i;
        }
        testNumbers[15] = 0;
        testNumbers[8] = 10;
        testNumbers[9] = 9;
        testNumbers[10] = 12;
        testNumbers[11] = 11;

        solvable = new Board(testNumbers);
    }

    @Test
    public void returnsTrueIfBoardIsSolvable() {
        assertEquals(getSolvability(solvable), true);
    }

    @Test
    public void returnsFalseIfNotSolvable() {
        assertEquals(getSolvability(notSolvable), false);
    }
}
