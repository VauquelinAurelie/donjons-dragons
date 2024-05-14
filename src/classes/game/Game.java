package classes.game;
import classes.Dice.OneFaceDice;
import classes.plateau.PersonnageHorsPlateauException;
import classes.plateau.Plateau;
import classes.personnages.Personnage;
import classes.Dice.Dice;
import classes.plateau.ContenuCase;


public class Game {
    private String joueur;
    private int[] plateau;
    private Dice dice;
    private String menu;

    // Méthode pour configurer le dé utilisé dans le jeu
    public void choisirDe(Dice dice) {
        this.dice = dice;
    }

    public void intialisePartie(Menu menu) throws PersonnageHorsPlateauException {
        // Afficher le menu
        menu.afficherMenu();
    }

    public void jouer(Plateau plateau, Personnage personnage, Menu menu) throws PersonnageHorsPlateauException {
        int nombreCase = plateau.getNombreCase();

        // choix du dé
        choisirDe(new OneFaceDice());
//        choisirDe(new SixFaceDice());

        // Boucle pour déplacer le personnage jusqu'à la dernière case du plateau
        while (true) {
            int diceRoll = dice.roll(); // Utilisation du dé choisi pour le lancer
            int positionFinale = deplacement(personnage, diceRoll);
            // Afficher le déplacement
            menu.afficherDeplacement(this, personnage, positionFinale, diceRoll);

            // Obtenir le contenu de la case actuelle
            ContenuCase contenuCase = plateau.getContenuCase(personnage.getPosition() - 1);
            // Si le contenu de la case n'est pas nul, interagir avec la case
            if (contenuCase != null) {
                System.out.print("La case contient : ");
                // Appeler la méthode interaction de la case
                contenuCase.interaction(personnage);
            }

            // Vérifier la condition de victoire
            if (personnage.getPosition() == nombreCase) {
                menu.afficherVictoire(this, personnage);  // le joueur a gagné !
                break; // Sortir de la boucle
            }

            // Vérifier si le personnage est sorti du plateau
            if (personnage.getPosition() > nombreCase) {
                throw new PersonnageHorsPlateauException();
            }
        }
    }

    public int deplacement(Personnage personnage, int diceRoll) {
        int currentPosition = personnage.getPosition();
        currentPosition += diceRoll ;
        personnage.setPosition(currentPosition);
        return currentPosition;
    }
}
