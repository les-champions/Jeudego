/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

/**
 * 
 * @author zhaoshuli
 */
public class Main {

  /**
   * @param args
   *          the command line arguments
   */
  public static void main(String[] args) {
    Goban goban = new Goban(9);
    InterfaceClavier ui = new InterfaceClavier(goban);
    Jeu j = new Jeu(goban, ui);
    j.jouer();
  }
}
