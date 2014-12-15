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

/**
 *
 * @author IAZERTYUIOPI
 */
public class GobanRW {
    
    public static void writeToFile(Goban goban, String filename) {
        
        int compteur=0; //Permet de compter le nombre de caractères insérés.

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(filename+".pgm"));
            bw.write("P2 \n#\n");
            bw.write(goban.getL()+" "+goban.getH()+"\n");
            bw.write(Integer.toString(PGMImage.greyScale)+"\n");
            
            for(int i=0;i<(image.getL()*image.getH());i++ ){
                bw.write(Integer.toString(image.getPixelArray().get(i))+" ");
                compteur+= 4;
                if((i+1)%image.getL()==0 || compteur>70)
                {
                    bw.newLine();
                    compteur=0;
                }
            }   
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static PGMImage readFromFile(String filename) throws FileNotFoundException, IOException {

       
            String ligne;
            BufferedReader br = new BufferedReader(new FileReader(filename));  
            StringTokenizer tokenizer;
            int i=0;            
            int l,h;
            
            //On saute les deux premières lignes
            br.readLine();
            br.readLine();
            
            //On récupère largeur et hauteur
            ligne=br.readLine();
            tokenizer  = new StringTokenizer(ligne," ");
            l = Integer.parseInt(tokenizer.nextToken());
            h = Integer.parseInt(tokenizer.nextToken());
            
            //On crée l'objet PGMImage
            PGMImage image = new PGMImage(l,h);
            
            //On saute la ligne de niveau de gris max
            br.readLine();
            
            //On remplit le pixelArray
            while((ligne = br.readLine())!=null){
                tokenizer  = new StringTokenizer(ligne," \t");
                while(tokenizer.hasMoreTokens()){
                    image.getPixelArray().add(i,Integer.parseInt(tokenizer.nextToken()));
                    i++;                    
                }
            }            
                       
            br.close();
            
            return image;
        
    }
}
