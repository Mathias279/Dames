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
public class PositionMTest {
    
    public PositionMTest() {
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
     * Test of getAxeX method, of class PositionM.
     */
    @Test
    public void testGetAxeX() {
        System.out.println("getAxeX");
        PositionM instance = new PositionM();
        int expResult = 0;
        int result = instance.getAxeX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAxeX method, of class PositionM.
     */
    @Test
    public void testSetAxeX() {
        System.out.println("setAxeX");
        int axeX = 0;
        PositionM instance = new PositionM();
        instance.setAxeX(axeX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAxeY method, of class PositionM.
     */
    @Test
    public void testGetAxeY() {
        System.out.println("getAxeY");
        PositionM instance = new PositionM();
        int expResult = 0;
        int result = instance.getAxeY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAxeY method, of class PositionM.
     */
    @Test
    public void testSetAxeY() {
        System.out.println("setAxeY");
        int axeY = 0;
        PositionM instance = new PositionM();
        instance.setAxeY(axeY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class PositionM.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int axeX = 0;
        int axeY = 0;
        PositionM instance = new PositionM();
        instance.setPosition(axeX, axeY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
