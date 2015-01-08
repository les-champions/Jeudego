/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudego;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author marc
 */
public class GroupeDePierres implements Iterable<PierrePoint> {
    
    Couleur c;
    Goban plateau;
    ArrayList<PierrePoint> groupe;
    
    @Override
    public Iterator<PierrePoint> iterator()
    {
        Iterator<PierrePoint> iPP = groupe.iterator();
        return iPP;
    }
    
    public GroupeDePierres(PierrePoint p, Goban g)
    {
        c = p.couleur;
        plateau = g;
        groupe = new ArrayList<>();
        groupe.add(p);
        ajouter(p);
        

    }
    
    private void ajouter(PierrePoint p)
    {
        for (PierrePoint k : plateau.getPierresAutourDe(p.x, p.y))
        {
            if(k != null && k.couleur == c && !groupe.contains(k))
            {
                groupe.add(k);
                ajouter(k);
            }
        }
    }
    
   /*public void supprimer(PierrePoint p)
    {
        groupe.remove(p);
    }
    
    public void supprimer(Collection<PierrePoint> p)
    {
        groupe.removeAll(p);
    }*/    
    
    public Boolean appartientA(PierrePoint p)
    {
        return groupe.contains(p);
    }
    
    public int liberteRestantes()
    {
        int lr = 0 ;
        for(PierrePoint p : groupe)
        {
            for( PierrePoint n : plateau.getPierresAutourDe(p.x, p.y))
            {
                if(n == null)
                {
                    lr+=1;
                }
            }
        }
        return lr;
    }
}
