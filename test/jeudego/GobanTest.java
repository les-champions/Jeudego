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
 * @author zhaoshuli
 */
public class GobanTest {
  
  public GobanTest() {
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
   * Test of ajouterPierre method, of class Goban.
   */
  @Test
  public void testAjouterPierre() {
    System.out.println("ajouterPierre");
    int x = 0;
    int y = 0;
    PierrePoint pierre= new PierrePoint(x, y, Couleur.NOIR);
    Goban instance = new Goban();
    instance.ajouterPierre(x, y);
    assertTrue(instance.getPierre(x, y).equals(pierre));
  }

  /**
   * Test of getPierre method, of class Goban.
   */
  @Test
  public void testGetPierre() {
    System.out.println("getPierre");
    int x = 2;
    int y = 3;
    Goban instance = new Goban();
    PierrePoint expResult = null;
    PierrePoint result = instance.getPierre(x, y);
    assertEquals(expResult, result);
    
  }
  
}
