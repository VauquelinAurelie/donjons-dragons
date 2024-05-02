package classes.game;
import classes.Plateau;
import classes.equipements.EquipementOffensif;
import classes.personnages.Personnage;
import java.util.Random;

public class Game {
    public void demarrerPartie(Personnage personnage, Menu menu) {
//       Plateau plateau = new Plateau(); // instanciation de l'objet Plateau

        // placement aléatoire des ennemis
//        Personnage[] ennemis = new Personnage[5]; // tableau pour stocker les ennemis
//        plateau.placerEnnemis(ennemis);
//        // placement aléatoire des surprises
//        EquipementOffensif[] surprises = new EquipementOffensif[5]; // tableau pour stocker les surprises
//        plateau.placerSurprise(surprises);

        // Boucle pour déplacer le personnage jusqu'à la dernière case du plateau
        while (personnage.getPosition() < 64) {
            int diceRoll = lancerDe();
           int positionfinale = deplacement(personnage, diceRoll);
//            if (personnage.getPosition() == 64) {
//                menu.afficherDeplacement(this, personnage, positionfinale,diceRoll);
//                break;
//            }
            menu.afficherDeplacement(this, personnage, positionfinale,diceRoll);
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
