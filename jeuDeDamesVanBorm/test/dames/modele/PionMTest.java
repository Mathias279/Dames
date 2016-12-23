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
public class PionMTest {
    
    public PionMTest() {
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
     * Test of isBlanc method, of class PionM.
     */
    @Test
    public void testIsBlanc() {
        System.out.println("isBlanc");
        PionM instance = new PionM();
        boolean expResult = false;
        boolean result = instance.isBlanc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBlanc method, of class PionM.
     */
    @Test
    public void testSetBlanc() {
        System.out.println("setBlanc");
        boolean blanc = false;
        PionM instance = new PionM();
        instance.setBlanc(blanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class PionM.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        PionM instance = new PionM();
        PositionM expResult = null;
        PositionM result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class PionM.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        PositionM position = null;
        PionM instance = new PionM();
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDame method, of class PionM.
     */
    @Test
    public void testIsDame() {
        System.out.println("isDame");
        PionM instance = new PionM();
        boolean expResult = false;
        boolean result = instance.isDame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDame method, of class PionM.
     */
    @Test
    public void testSetDame() {
        System.out.println("setDame");
        boolean dame = false;
        PionM instance = new PionM();
        instance.setDame(dame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBlocked method, of class PionM.
     */
    @Test
    public void testIsBlocked() {
        System.out.println("isBlocked");
        PionM instance = new PionM();
        boolean expResult = false;
        boolean result = instance.isBlocked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBlocked method, of class PionM.
     */
    @Test
    public void testSetBlocked() {
        System.out.println("setBlocked");
        boolean blocked = false;
        PionM instance = new PionM();
        instance.setBlocked(blocked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
