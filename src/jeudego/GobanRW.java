/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import static jeudego.Couleur.BLANC;
import static jeudego.Couleur.NOIR;

/**
 *
 * @author IAZERTYUIOPI
 */
public class GobanRW {
    
    public static void writeToFile(Goban goban, String filename) {
        
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(filename+".txt"));
            bw.write(goban.getWidth()+" <- size");
            bw.newLine();
            
            for(PierrePoint pArray[] : goban.getPointJoueArray()){
                for(PierrePoint p : pArray){
                    if(p == null){
                        bw.write(" ");
                    }
                    else{
                        bw.write(p.toString());
                    }
                }
                bw.newLine();    
            }   
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Goban readFromFile(String filename) throws FileNotFoundException, IOException {

       
            String ligne;
            BufferedReader br = new BufferedReader(new FileReader(filename+".txt"));  
            StringTokenizer tokenizer;
            int width;
            
            //On récupère largeur et hauteur
            ligne=br.readLine();
            tokenizer  = new StringTokenizer(ligne," ");
            width = Integer.parseInt(tokenizer.nextToken());
            
            //On crée l'objet Goban
            Goban goban = new Goban(width);
            
            
            //On remplit le tableau
            Couleur c;
            int i=0;
            int j=0;
            
            while((ligne = br.readLine())!=null){
                tokenizer  = new StringTokenizer(ligne," \t");
                while(tokenizer.hasMoreTokens()){
                    if("N".equals(tokenizer.nextToken())){
                        c = NOIR;
                    }
                    else{
                        c = BLANC;
                    }
                    goban.getPointJoueArray()[i][j]=new PierrePoint(i, j, c);
                    i++;                    
                }
                j++;
            }            
                       
            br.close();
            
            return goban;
        
    }
}
