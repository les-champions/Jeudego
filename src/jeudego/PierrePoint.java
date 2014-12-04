/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import static jeudego.Couleur.BLANC;

/**
 *
 * @author zhaoshuli
 */
public class PierrePoint{
  int x;
  int y;
  Couleur couleur;
  
  PierrePoint(int x, int y, Couleur c){ 
    this.x=x;
    this.y=y;
    this.couleur=c;
  }
  
  PierrePoint(){
    this.x=0;
    this.y=0;
    this.couleur= BLANC;
  }
}
