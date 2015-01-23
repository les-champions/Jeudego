/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author IAZERTYUIOPI
 */
public class GUIFiller implements Runnable{
int s_x;
int e_x;
int s_y;
int e_y;
JButton[][] GUIarr;
PierrePoint[][] logicArr;
    
    GUIFiller(int s_x, int e_x, int s_y, int e_y, JButton[][] GUIarr, PierrePoint[][] logicArr) {
    
        this.s_x = s_x;
        this.e_x = e_x;
        this.s_y = s_y;
        this.e_y = e_y;
        this.GUIarr = GUIarr;
        this.logicArr = logicArr;
        
    }

    @Override
    public void run() {
        
        
        for (int i = s_x; i < e_x; i++){
            for(int j = s_y; j < e_y; j++){
                if(logicArr[i][j]==null){
                    GUIarr[i][j].setIcon(new ImageIcon("res/fond.jpeg"));
                }
                else {
                    if("N".equals(logicArr[i][j].toString())){
                        GUIarr[i][j].setIcon(new ImageIcon("res/Noir/20.png"));
                    }
                    if(logicArr[i][j].toString().equals("B")){
                        GUIarr[i][j].setIcon(new ImageIcon("res/Blanc/20-30.png"));
                    }
                }
            }
        }
        throw new RuntimeException();
    }
    
}
