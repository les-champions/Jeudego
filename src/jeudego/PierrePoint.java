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
public class PierrePoint {
  int x;
  int y;
  Couleur couleur;

  PierrePoint(int x, int y, Couleur c) {
    this.x = x;
    this.y = y;
    this.couleur = c;
  }
  
  PierrePoint(int x, int y){
    this.x = x;
    this.y = y;
  }

  public boolean equals(PierrePoint pierre) {
    return (pierre.x == this.x && pierre.y == this.y && pierre.couleur == this.couleur);
  }
  
  public boolean equalsPosition(PierrePoint pierre) {
    return (pierre.x == this.x && pierre.y == this.y);
  }

  public String toString(){
      String res;
      res = this.couleur == NOIR ? "N" : "B";
      return res;
  }
  
  
}
