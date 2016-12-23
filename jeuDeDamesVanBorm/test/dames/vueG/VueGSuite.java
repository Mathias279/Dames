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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mathias Van Borm
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dames.vueG.MapTest.class, dames.vueG.JoueurGTest.class, dames.vueG.PartieTest.class, dames.vueG.JoueurTest.class, dames.vueG.CaseTest.class, dames.vueG.CaseGTest.class, dames.vueG.PartieGTest.class, dames.vueG.PionTest.class, dames.vueG.PionGTest.class, dames.vueG.AccueilTest.class, dames.vueG.MapGTest.class})
public class VueGSuite {

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
