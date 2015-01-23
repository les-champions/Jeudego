package jeudego;

public class Jeu {

  private Goban goban;
  private GoGUI gui;
  private InterfaceClavier ui;

  public Jeu(Goban goban, InterfaceClavier ui, GoGUI gui) {
    this.goban = goban;
    this.ui = ui;
    this.gui = gui;
  }

  public void jouer() {
      System.out.println("Bonjour et bienvenue");
      System.out.println("Appuyez sur 'p' pour passer votre tour, cliquez sur le plateau pour jouer");
    while (!goban.partieTerminee()) {
      //ui.tourDeJeu();
    }
  }
}
