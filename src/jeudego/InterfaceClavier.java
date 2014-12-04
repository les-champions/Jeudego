/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import static jeudego.Couleur.*;
import java.util.Scanner;

/**
 *
 * @author zhaoshuli
 */
public class InterfaceClavier {
  public PierrePoint getPierre(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrer l'abscisse");
    int i= sc.nextInt();
    System.out.println("Entrer l'ordonnée");
    int j= sc.nextInt();   
    System.out.println("Entrer la couleur(B pour Blanc/N pour Noir)");
    String s= sc.nextLine();
    Couleur c;
    if(s.equals("B"))
      c=BLANC;
    else 
      c=NOIR;
    sc.close();
    return new PierrePoint(i,j,c);
  }

}
