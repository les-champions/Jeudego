package jeudego;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GroupeDePierresTest {

  private Goban createGoban() {
    Goban g = new Goban(4);
    /*
      Plateau:
      * + + 
      * + * *
      *     
     */
    int[][] tours = {
        {0,0},
        {1,1},
        {0,1},
        {2,1},
        {1,0}
    };
    for (int[] pos : tours) {
      if (pos != null)
        g.tourDeJeu(pos[0], pos[1]);
    }
    return g;
  }

  @Test
  public void test() {
    Goban g = createGoban();
    Set<PierrePoint> groupeAttendu = new HashSet<>();
    groupeAttendu.add(g.getPierre(0, 0));
    groupeAttendu.add(g.getPierre(0, 1));
    groupeAttendu.add(g.getPierre(1, 0));
    
    GroupeDePierres groupe = new GroupeDePierres(g.getPierre(0, 0), g);
    for (int x=0; x<g.getWidth(); x++) {
      for (int y=0; y<g.getWidth(); y++) {
        PierrePoint pierre = g.getPierre(x, y);
        assertEquals(groupeAttendu.contains(pierre), groupe.appartientA(pierre));
      }
    }
  }

}
