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
public class PionTest {
    
    public PionTest() {
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
     * Test of isBlanc method, of class Pion.
     */
    @Test
    public void testIsBlanc() {
        System.out.println("isBlanc");
        Pion instance = new Pion();
        boolean expResult = false;
        boolean result = instance.isBlanc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBlanc method, of class Pion.
     */
    @Test
    public void testSetBlanc() {
        System.out.println("setBlanc");
        boolean blanc = false;
        Pion instance = new Pion();
        instance.setBlanc(blanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Pion.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Pion instance = new Pion();
        Position expResult = null;
        Position result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class Pion.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Position position = null;
        Pion instance = new Pion();
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDame method, of class Pion.
     */
    @Test
    public void testIsDame() {
        System.out.println("isDame");
        Pion instance = new Pion();
        boolean expResult = false;
        boolean result = instance.isDame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDame method, of class Pion.
     */
    @Test
    public void testSetDame() {
        System.out.println("setDame");
        boolean dame = false;
        Pion instance = new Pion();
        instance.setDame(dame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBlocked method, of class Pion.
     */
    @Test
    public void testIsBlocked() {
        System.out.println("isBlocked");
        Pion instance = new Pion();
        boolean expResult = false;
        boolean result = instance.isBlocked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBlocked method, of class Pion.
     */
    @Test
    public void testSetBlocked() {
        System.out.println("setBlocked");
        boolean blocked = false;
        Pion instance = new Pion();
        instance.setBlocked(blocked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pion instance = new Pion();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
