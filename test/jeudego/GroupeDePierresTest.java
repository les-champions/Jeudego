package jeudego;

import static org.junit.Assert.*;

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
    fail("Not yet implemented");
  }

}
