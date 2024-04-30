package classes;

import classes.game.Game;
import classes.game.Menu;
import classes.personnages.Metier;

public class Main {
    public static void main(String[] args) {
        // créer une instance de la classe classes.game.Menu
        Menu menu = new Menu();
        menu.afficherMenu();
        // créer une instance de la classe classes.game.Game
        Game game = new Game();
        // Création d'une instance de Metier
        Metier metier = new Metier();
        // Création d'une instance de Plateau
        Plateau plateau = new Plateau();
    }
}
