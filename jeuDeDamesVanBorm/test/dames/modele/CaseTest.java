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
public class CaseTest {
    
    public CaseTest() {
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
     * Test of setPosition method, of class Case.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Position position = null;
        Case instance = new Case();
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupe method, of class Case.
     */
    @Test
    public void testIsOccupe() {
        System.out.println("isOccupe");
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.isOccupe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupeParBlanc method, of class Case.
     */
    @Test
    public void testIsOccupeParBlanc() {
        System.out.println("isOccupeParBlanc");
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.isOccupeParBlanc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupeParDame method, of class Case.
     */
    @Test
    public void testIsOccupeParDame() {
        System.out.println("isOccupeParDame");
        Case instance = new Case();
        boolean expResult = false;
        boolean result = instance.isOccupeParDame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOccupe method, of class Case.
     */
    @Test
    public void testSetOccupe() {
        System.out.println("setOccupe");
        boolean occupe = false;
        Case instance = new Case();
        instance.setOccupe(occupe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOccupeParBlanc method, of class Case.
     */
    @Test
    public void testSetOccupeParBlanc() {
        System.out.println("setOccupeParBlanc");
        boolean occupeParBlanc = false;
        Case instance = new Case();
        instance.setOccupeParBlanc(occupeParBlanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Case.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Case instance = new Case();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
