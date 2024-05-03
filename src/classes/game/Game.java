package classes.game;
import classes.PersonnageHorsPlateauException;
import classes.Plateau;
import classes.equipements.EquipementOffensif;
import classes.personnages.Personnage;
import java.util.Random;

public class Game {
    private String joueur;
    private int[] plateau;
    private int dice;
    // menu


    public void intialisePartie(Menu menu) throws PersonnageHorsPlateauException {
        menu.afficherMenu();
    }

    public void jouer(Personnage personnage, Menu menu) throws PersonnageHorsPlateauException {
        // Boucle pour déplacer le personnage jusqu'à la dernière case du plateau
        while (true) {
            int diceRoll = lancerDe();
            int positionFinale = deplacement(personnage, diceRoll);

            // Afficher le résultat du lancer de dé et la nouvelle position du personnage
            System.out.println("Vous avez lancé un dé et obtenu : " + diceRoll);
            System.out.println("Vous êtes sur la case : " + personnage.getPosition());

            // Vérifier la condition de victoire
            if (personnage.getPosition() == 64) {
                menu.afficherVictoire(this, personnage);  // le joueur a gagné !
                break; // Sortir de la boucle
            }

            // Vérifier si le personnage est sorti du plateau
            if (personnage.getPosition() > 64) {
                throw new PersonnageHorsPlateauException();
            }

            // Afficher le déplacement
            menu.afficherDeplacement(this, personnage, positionFinale, diceRoll);
        }
    }








    private int lancerDe() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Lancer de dé virtuel (nombre aléatoire entre 1 et 6 inclus)
    }

    public int deplacement(Personnage personnage, int diceRoll) {
        int currentPosition = personnage.getPosition();
        currentPosition += diceRoll;
        personnage.setPosition(currentPosition);
        return currentPosition;
    }

}
