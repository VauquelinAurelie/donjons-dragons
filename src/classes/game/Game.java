package classes.game;
import classes.Plateau;
import classes.equipements.EquipementOffensif;
import classes.personnages.Personnage;
import java.util.Random;

public class Game {
    public void demarrerPartie(Personnage personnage) {
       Plateau plateau = new Plateau(); // instanciation de l'objet Plateau
        // placement aléatoire des ennemis
        plateau.placerEnnemis(new Personnage[5]);
        // placement aléatoire des surprises
        plateau.placerSurprise(new EquipementOffensif[5]);
        // Boucle pour déplacer le personnage jusqu'à la dernière case du plateau
        while (personnage.getPosition() < 64) {
            lancerDe(personnage);
            if (personnage.getPosition() == 64) {
                System.out.println("Vous avez atteint la dernière case du plateau !");
                break;
            }
        }
    }

    private void lancerDe(Personnage personnage) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; // Lancer de dé virtuel (nombre aléatoire entre 1 et 6 inclus)
        deplacement(personnage, diceRoll);
    }

    private void deplacement(Personnage personnage, int diceRoll) {
        int currentPosition = personnage.getPosition();
        currentPosition += diceRoll;
        personnage.setPosition(currentPosition);
        System.out.println("Vous êtes sur la case : " + personnage.getPosition());
    }
}
