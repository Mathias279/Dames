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
public class CaseMTest {
    
    public CaseMTest() {
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
     * Test of setPosition method, of class CaseM.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        PositionM position = null;
        CaseM instance = new CaseM();
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupe method, of class CaseM.
     */
    @Test
    public void testIsOccupe() {
        System.out.println("isOccupe");
        CaseM instance = new CaseM();
        boolean expResult = false;
        boolean result = instance.isOccupe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupeParBlanc method, of class CaseM.
     */
    @Test
    public void testIsOccupeParBlanc() {
        System.out.println("isOccupeParBlanc");
        CaseM instance = new CaseM();
        boolean expResult = false;
        boolean result = instance.isOccupeParBlanc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupeParDame method, of class CaseM.
     */
    @Test
    public void testIsOccupeParDame() {
        System.out.println("isOccupeParDame");
        CaseM instance = new CaseM();
        boolean expResult = false;
        boolean result = instance.isOccupeParDame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOccupe method, of class CaseM.
     */
    @Test
    public void testSetOccupe() {
        System.out.println("setOccupe");
        boolean occupe = false;
        CaseM instance = new CaseM();
        instance.setOccupe(occupe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOccupeParBlanc method, of class CaseM.
     */
    @Test
    public void testSetOccupeParBlanc() {
        System.out.println("setOccupeParBlanc");
        boolean occupeParBlanc = false;
        CaseM instance = new CaseM();
        instance.setOccupeParBlanc(occupeParBlanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CaseM.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CaseM instance = new CaseM();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
