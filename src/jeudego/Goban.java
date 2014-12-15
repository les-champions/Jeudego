/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import static jeudego.Couleur.*;

import java.util.ArrayList;


/**
 *
 * @author zhaoshuli
 */


public class Goban {
  public int width=9;
  private PierrePoint pointJoueArray[][];//liste des pierres poses sur le plateau
  private Couleur tour; // qui a son tour
  
  
  
  Goban(int width){
    pointJoueArray=new PierrePoint[width][width];
    tour=NOIR;
    this.width = width;
  }
  
  /**
   * Ajoute une pierre de la couleur du joueur dont c'est le tour
   * @param x  abscisse de la pierre a ajouter
   * @param y  ordonee de la pierre a ajouter
  */
  public void ajouterPierre(int x, int y){
    pointJoueArray[x][y]=new PierrePoint(x, y, tour);
  }
  
  public boolean estSurPlateau(int x, int y) {
    return (x>=0 && y>=0 && x<width && y<width);
  }
  
  public PierrePoint getPierre(int x,int y){
    return estSurPlateau(x, y) ? pointJoueArray[x][y] : null;
  }
  
  public ArrayList<PierrePoint> getPierresAutourDe(int x, int y) {
    ArrayList<PierrePoint> pierres = new ArrayList<>();
    int[][] positions = {{-1,0},{1,0},{0,-1},{0,1}};
    for (int[] pos : positions){
      PierrePoint pierre = getPierre(x+pos[0], y+pos[1]);
      if (pierre != null) pierres.add(pierre);
    }
    return pierres;
  }

  /**
   * Permet de savoir de quel joueur c'est le tour
   * @return la couleur du joueur dont  c'est le tour
   */
  public Couleur getTour() {
    return tour;
  }

  /**
   * @param x
   * @param y
   * @return true si la pierre a bien pu être posée 
   */
  public boolean tourDeJeu(int x, int y) {
    if (estMouvementValide(x,y)) {
      ajouterPierre(x, y);
      return true;
    } else {
      return false;
    }
  }

  private boolean estMouvementValide(int x, int y) {
    return true;
  }

  /**
   * Passe le tour du joueur actuel
   * @return
   */
  public boolean passerTour() {
    tour = tour.autre();
    return true;
  }

  public boolean partieTerminee() {
    // TODO Implémenter ça
    return false;
  }
}
