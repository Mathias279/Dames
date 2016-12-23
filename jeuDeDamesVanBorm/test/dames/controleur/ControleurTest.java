/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dames.controleur;

import dames.modele.JoueurM;
import dames.vueG.Accueil;
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
public class ControleurTest {
    
    public ControleurTest() {
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
     * Test of getAccueil method, of class Controleur.
     */
    @Test
    public void testGetAccueil_0args() {
        System.out.println("getAccueil");
        Controleur instance = new Controleur();
        Accueil expResult = null;
        Accueil result = instance.getAccueil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbrPions method, of class Controleur.
     */
    @Test
    public void testGetNbrPions() {
        System.out.println("getNbrPions");
        Controleur instance = new Controleur();
        int expResult = 0;
        int result = instance.getNbrPions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbrPionsLautre method, of class Controleur.
     */
    @Test
    public void testGetNbrPionsLautre() {
        System.out.println("getNbrPionsLautre");
        Controleur instance = new Controleur();
        int expResult = 0;
        int result = instance.getNbrPionsLautre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbrPionsMoi method, of class Controleur.
     */
    @Test
    public void testGetNbrPionsMoi() {
        System.out.println("getNbrPionsMoi");
        Controleur instance = new Controleur();
        int expResult = 0;
        int result = instance.getNbrPionsMoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbrPions method, of class Controleur.
     */
    @Test
    public void testSetNbrPions() {
        System.out.println("setNbrPions");
        int nbrPions = 0;
        Controleur instance = new Controleur();
        instance.setNbrPions(nbrPions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoueurG method, of class Controleur.
     */
    @Test
    public void testGetJoueurG() {
        System.out.println("getJoueurG");
        JeuDeDames jeudedames = null;
        String joueur = "";
        boolean blanc = false;
        Controleur instance = new Controleur();
        instance.getJoueurG(jeudedames, joueur, blanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaille method, of class Controleur.
     */
    @Test
    public void testSetTaille() {
        System.out.println("setTaille");
        int taille = 0;
        Controleur instance = new Controleur();
        instance.setTaille(taille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Controleur.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Controleur instance = new Controleur();
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccueil method, of class Controleur.
     */
    @Test
    public void testGetAccueil_JeuDeDames() {
        System.out.println("getAccueil");
        JeuDeDames jeudedames = null;
        Controleur instance = new Controleur();
        instance.getAccueil(jeudedames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartieG method, of class Controleur.
     */
    @Test
    public void testGetPartieG() {
        System.out.println("getPartieG");
        JeuDeDames jeudedames = null;
        Controleur instance = new Controleur();
        instance.getPartieG(jeudedames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServeur method, of class Controleur.
     */
    @Test
    public void testGetServeur() throws Exception {
        System.out.println("getServeur");
        JeuDeDames jeudedames = null;
        Controleur instance = new Controleur();
        instance.getServeur(jeudedames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class Controleur.
     */
    @Test
    public void testGetClient() throws Exception {
        System.out.println("getClient");
        JeuDeDames jeudedames = null;
        Controleur instance = new Controleur();
        instance.getClient(jeudedames);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoi method, of class Controleur.
     */
    @Test
    public void testGetMoi() {
        System.out.println("getMoi");
        Controleur instance = new Controleur();
        JoueurM expResult = null;
        JoueurM result = instance.getMoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLautre method, of class Controleur.
     */
    @Test
    public void testGetLautre() {
        System.out.println("getLautre");
        Controleur instance = new Controleur();
        JoueurM expResult = null;
        JoueurM result = instance.getLautre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
