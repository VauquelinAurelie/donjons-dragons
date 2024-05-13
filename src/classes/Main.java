package classes;
import classes.game.Game;
import classes.game.Menu;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException {
        // création des instances des classes Menu et Game
        Menu menu = new Menu();
        Game game = new Game();

        game.intialisePartie(menu);
    }
}
