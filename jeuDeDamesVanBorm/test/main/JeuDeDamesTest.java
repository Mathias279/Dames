/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dames.controleur.Controleur;
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
public class JeuDeDamesTest {
    
    public JeuDeDamesTest() {
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
     * Test of getControleur method, of class JeuDeDames.
     */
    @Test
    public void testGetControleur() {
        System.out.println("getControleur");
        JeuDeDames instance = new JeuDeDames();
        Controleur expResult = null;
        Controleur result = instance.getControleur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JeuDeDames.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JeuDeDames.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
