/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.vueG;

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
public class CaseGTest {
    
    public CaseGTest() {
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
     * Test of isOccupe method, of class CaseG.
     */
    @Test
    public void testIsOccupe() {
        System.out.println("isOccupe");
        CaseG instance = null;
        boolean expResult = false;
        boolean result = instance.isOccupe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupeParBlanc method, of class CaseG.
     */
    @Test
    public void testIsOccupeParBlanc() {
        System.out.println("isOccupeParBlanc");
        CaseG instance = null;
        boolean expResult = false;
        boolean result = instance.isOccupeParBlanc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOccupeParDame method, of class CaseG.
     */
    @Test
    public void testIsOccupeParDame() {
        System.out.println("isOccupeParDame");
        CaseG instance = null;
        boolean expResult = false;
        boolean result = instance.isOccupeParDame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caseConsole method, of class CaseG.
     */
    @Test
    public void testCaseConsole() {
        System.out.println("caseConsole");
        CaseG instance = null;
        String expResult = "";
        String result = instance.caseConsole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
