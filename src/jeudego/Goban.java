/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.Scanner;
import static jeudego.Couleur.BLANC;
import static jeudego.Couleur.NOIR;


/**
 *
 * @author zhaoshuli
 */


public class Goban {
  public static final int width=9;
  private PierrePoint pointJoueArray[][];//liste des pierres poses sur le plateau
  private Couleur tour; // qui a son tour
  
  
  
  Goban(){
    pointJoueArray=new PierrePoint[width][width];
    tour=NOIR;
  }
  
  /**
   * Ajoute une pierre de la couleur du joueur dont c'est le tour
   * @param x  abscisse de la pierre a ajouter
   * @param y  ordonee de la pierre a ajouter
  */
  public void ajouterPierre(int x, int y){
    pointJoueArray[x][y]=new PierrePoint(x, y, tour);
  }
  
  public PierrePoint getPierre(int x,int y){
    return pointJoueArray[x][y];
  }
  
}
