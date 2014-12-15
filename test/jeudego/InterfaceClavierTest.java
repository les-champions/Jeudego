/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IAZERTYUIOPI
 */
public class InterfaceClavierTest {
    
    public InterfaceClavierTest() {
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
     * Test of tourDeJeu method, of class InterfaceClavier.
     */
    @Test
    public void testTourDeJeu() {
        System.out.println("tourDeJeu");
        InterfaceClavier instance = null;
        boolean expResult = false;
        boolean result = instance.tourDeJeu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avertirMouvementInvalide method, of class InterfaceClavier.
     */
    @Test
    public void testAvertirMouvementInvalide() {
        System.out.println("avertirMouvementInvalide");
        InterfaceClavier instance = null;
        instance.avertirMouvementInvalide();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class InterfaceClavier.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        InterfaceClavier instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
