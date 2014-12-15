package jeudego;

public class Jeu {

  private Goban goban;
  private InterfaceClavier ui;

  public Jeu(Goban goban, InterfaceClavier ui) {
    this.goban = goban;
    this.ui = ui;
  }

  public void jouer() {
    while (!goban.partieTerminee()) {
      ui.tourDeJeu();
    }
  }
}
