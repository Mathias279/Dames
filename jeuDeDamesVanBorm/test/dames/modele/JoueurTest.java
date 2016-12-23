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
public class JoueurTest {
    
    public JoueurTest() {
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
     * Test of setBlanc method, of class Joueur.
     */
    @Test
    public void testSetBlanc() {
        System.out.println("setBlanc");
        boolean blanc = false;
        Joueur instance = new Joueur();
        instance.setBlanc(blanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPionsJoueur method, of class Joueur.
     */
    @Test
    public void testGetPionsJoueur() {
        System.out.println("getPionsJoueur");
        Joueur instance = new Joueur();
        Pion[] expResult = null;
        Pion[] result = instance.getPionsJoueur();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPionJoueur method, of class Joueur.
     */
    @Test
    public void testGetPionJoueur() {
        System.out.println("getPionJoueur");
        int n = 0;
        Joueur instance = new Joueur();
        Pion expResult = null;
        Pion result = instance.getPionJoueur(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombrePions method, of class Joueur.
     */
    @Test
    public void testGetNombrePions() {
        System.out.println("getNombrePions");
        Joueur instance = new Joueur();
        int expResult = 0;
        int result = instance.getNombrePions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPionsJoueur method, of class Joueur.
     */
    @Test
    public void testSetPionsJoueur() {
        System.out.println("setPionsJoueur");
        Pion[] pionsJoueur = null;
        Joueur instance = new Joueur();
        instance.setPionsJoueur(pionsJoueur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
