package classes.plateau;
import classes.game.Game;
import classes.game.Menu;
import classes.personnages.Personnage;

public interface ContenuCase {
    void interaction(Personnage personnage, Menu menu, Game game);
}
