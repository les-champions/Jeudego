/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import static jeudego.Couleur.NOIR;


/**
 *
 * @author zhaoshuli
 */


public class Goban {
  public static final int width=9;
  private PierrePoint pointJoueArray[];//liste des pierres poses sur le plateau
  private Couleur tour; // qui a son tour
  
  
  
  Goban(){
    pointJoueArray=new PierrePoint[width];
    tour=NOIR;
  }
  
}
