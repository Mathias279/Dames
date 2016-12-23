/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mathias Van Borm
 */
public class MapMTest {
    
    public MapMTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTaille method, of class MapM.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        MapM instance = null;
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableauCases method, of class MapM.
     */
    @Test
    public void testGetTableauCases_0args() {
        System.out.println("getTableauCases");
        MapM instance = null;
        CaseM[][] expResult = null;
        CaseM[][] result = instance.getTableauCases();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableauCases method, of class MapM.
     */
    @Test
    public void testGetTableauCases_int_int() {
        System.out.println("getTableauCases");
        int x = 0;
        int y = 0;
        MapM instance = null;
        CaseM expResult = null;
        CaseM result = instance.getTableauCases(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
