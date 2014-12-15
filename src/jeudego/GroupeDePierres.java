/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author marc
 */
public class GroupeDePierres {
    
    Couleur c;
    Goban plateau;
    ArrayList<PierrePoint> groupe;
    
    public GroupeDePierres(PierrePoint p, Goban g)
    {
        c = p.couleur;
        plateau = g;
        groupe = new ArrayList<PierrePoint>();
        groupe.add(p);
        

    }
    
    public void ajouter(PierrePoint p)
    {
        for (PierrePoint k : plateau.getPierresAutorDe(p.x, p.y))
        {
            if(k != null && k.couleur == c)
            {
                groupe.add(k);
                ajouter(k);
            }
        }
    }
    
    public void supprimer(PierrePoint p)
    {
        groupe.remove(p);
    }
    
    public void supprimer(Collection<PierrePoint> p)
    {
        groupe.removeAll(p);
    }
}
