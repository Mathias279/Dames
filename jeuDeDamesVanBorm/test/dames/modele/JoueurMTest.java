/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.modele;

import main.JeuDeDames;
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
public class JoueurMTest {
    
    public JoueurMTest() {
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
     * Test of setBlanc method, of class JoueurM.
     */
    @Test
    public void testSetBlanc() {
        System.out.println("setBlanc");
        boolean blanc = false;
        JoueurM instance = null;
        instance.setBlanc(blanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPions method, of class JoueurM.
     */
    @Test
    public void testGetPions() {
        System.out.println("getPions");
        JoueurM instance = null;
        PionM[] expResult = null;
        PionM[] result = instance.getPions();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPions method, of class JoueurM.
     */
    @Test
    public void testSetPions() {
        System.out.println("setPions");
        PionM[] pions = null;
        JoueurM instance = null;
        instance.setPions(pions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPion method, of class JoueurM.
     */
    @Test
    public void testGetPion() {
        System.out.println("getPion");
        int n = 0;
        JoueurM instance = null;
        PionM expResult = null;
        PionM result = instance.getPion(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombrePions method, of class JoueurM.
     */
    @Test
    public void testGetNombrePions() {
        System.out.println("getNombrePions");
        JoueurM instance = null;
        int expResult = 0;
        int result = instance.getNombrePions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettrePions method, of class JoueurM.
     */
    @Test
    public void testMettrePions() {
        System.out.println("mettrePions");
        JeuDeDames jeudedames = null;
        JoueurM instance = null;
        instance.mettrePions(jeudedames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inverserCoordonnées method, of class JoueurM.
     */
    @Test
    public void testInverserCoordonnées() {
        System.out.println("inverserCoordonn\u00e9es");
        PionM[] pion = null;
        JoueurM instance = null;
        instance.inverserCoordonnées(pion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPionsM method, of class JoueurM.
     */
    @Test
    public void testGetPionsM() {
        System.out.println("getPionsM");
        JoueurM instance = null;
        PionM[] expResult = null;
        PionM[] result = instance.getPionsM();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPionsM method, of class JoueurM.
     */
    @Test
    public void testSetPionsM() {
        System.out.println("setPionsM");
        PionM[] sesPions = null;
        JoueurM instance = null;
        instance.setPionsM(sesPions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
