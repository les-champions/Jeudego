/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.ArrayList;

/**
 *
 * @author marc
 */
public class GroupeDePierres {
    
    PierrePoint debut;
    Goban plateau;
    ArrayList<PierrePoint> groupe;
    
    public GroupeDePierres(PierrePoint p, Goban g)
    {
        debut = p;
        plateau = g;
        groupe = new ArrayList<PierrePoint>();
        groupe.add(p);
        

    }
    
    public void ajouter(PierrePoint p)
    {
        for (PierrePoint k : plateau.getPierresAutorDe(p.x, p.y))
        {
            if(k != null)
            {
                groupe.add(k);
                ajouter(k);
            }
        }
    }
}
