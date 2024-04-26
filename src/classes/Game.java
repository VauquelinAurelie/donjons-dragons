package classes;
import java.util.Random;

public class Game {
    public static void demarrerPartie(Personnage personnage) {
        System.out.println("Vous êtes sur la case : " + personnage.getPosition());

        // Boucle pour déplacer le personnage jusqu'à la dernière case du plateau
        while (personnage.getPosition() < 64) {
            lancerDe(personnage);
            if (personnage.getPosition() == 64) {
                System.out.println("Vous avez atteint la dernière case du plateau !");
                break;
            }
        }
    }

    private static void lancerDe(Personnage personnage) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1; // Lancer de dé virtuel (nombre aléatoire entre 1 et 6 inclus)
        int currentPosition = personnage.getPosition();
        currentPosition += diceRoll;
        personnage.setPosition(currentPosition);
        System.out.println("Vous êtes sur la case : " + personnage.getPosition());
    }
}
