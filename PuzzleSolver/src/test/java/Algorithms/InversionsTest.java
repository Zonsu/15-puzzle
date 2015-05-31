/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Game.Board;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static Algorithms.Inversions.*;

/**
 *
 * @author Johanna
 */
public class InversionsTest {

    private Board testBoard1;
    private Board testBoard2;

    public InversionsTest() {
    }

    @Before
    public void setUp() {
        int[] testNumbers = new int[16];

        for (int i = 0; i < 16; i++) {
            testNumbers[i] = 15 - i;
            System.out.println(testNumbers[i]);
        }

        testBoard1 = new Board(testNumbers);

        for (int i = 0; i < testBoard1.getBoard().length; i++) {
        }

        for (int i = 0; i < 15; i++) {
            testNumbers[i] = i;
        }
        testNumbers[15] = 15;
        testBoard2 = new Board(testNumbers);

    }

    @Test
    public void inversionsInBoard() {
        assertEquals(countInversions(testBoard1), 105);
    }

    @Test
    public void inversionsInBoard2() {
        assertEquals(countInversions(testBoard2), 0);
    }
}
