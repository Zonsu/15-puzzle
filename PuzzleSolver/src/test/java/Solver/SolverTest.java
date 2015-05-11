/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import fi.zonsu.puzzlesolver.Solver.*;

/**
 *
 * @author johanna
 */
public class SolverTest {
    
    public SolverTest() {
    }

    
    @Before
    public void setUp() {
    }
    
    @Test
    public void tilapainenTesti() {
        Solver tilapainenRatkaisija = new Solver();
        
        assertEquals(tilapainenRatkaisija.helloMaven(), "hello");
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
