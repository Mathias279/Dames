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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mathias Van Borm
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dames.modele.PartieTest.class, dames.modele.JoueurTest.class, dames.modele.PositionTest.class, dames.modele.CaseMTest.class, dames.modele.CaseTest.class, dames.modele.JoueurMTest.class, dames.modele.PositionMTest.class, dames.modele.PionTest.class, dames.modele.MapTest.class, dames.modele.PionMTest.class, dames.modele.MapMTest.class, dames.modele.PartieMTest.class})
public class ModeleSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
