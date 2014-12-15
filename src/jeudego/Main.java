/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author zhaoshuli
 */
public class Main {

  /**
   * @param args
   *          the command line arguments
     * @throws java.io.FileNotFoundException
   */
  public static void main(String[] args) throws FileNotFoundException,IOException{
    Goban goban = new Goban(9);
    
    GobanRW.writeToFile(goban, "testwrite");
    Goban testgoban = GobanRW.readFromFile("testwrite");
    GobanRW.writeToFile(testgoban,"testwrite2");
    
    InterfaceClavier ui = new InterfaceClavier(goban);
    Jeu j = new Jeu(goban, ui);
    j.jouer();
  }
}
