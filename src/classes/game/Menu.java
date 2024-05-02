package classes.game;
import classes.personnages.Guerrier;
import classes.personnages.Magicien;
import classes.personnages.Personnage;

import java.util.Scanner;

public class Menu {
    private Personnage personnage;

        public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("=== classes.game.Menu ===");
            System.out.println("1. Créer personnage");
            System.out.println("2. Modifier personnage");
            System.out.println("3. Démarrer la partie");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    personnage = creerPersonnage();
                    break;
                case 2:
                    modifierPersonnage(personnage);
                    break;
                case 3:
                    Game game = new Game();
                    demarrerPartie(personnage, game);

//                     demarrerPartie(personnage, this);
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 4);

        scanner.close();
    }
    // Méthode pour créer un personnage
    public Personnage creerPersonnage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Votre métier ( Guerrier ou Magicien ) : ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Guerrier")) {
            return new Guerrier(nom, type);
        } else if (type.equalsIgnoreCase("Magicien")) {
            return new Magicien(nom, type);
        } else {
            System.out.println("Choix invalide !");
            return null;
        }
    }

    public void modifierPersonnage(Personnage personnage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nouveau nom : ");
        String nouveauNom = scanner.nextLine();
        System.out.print("Nouveau métier (Guerrier ou Magicien) : ");
        String nouveauType = scanner.nextLine();

        //  Mettre à jour les informations du personnage
        personnage.setNom(nouveauNom);
        personnage.setType(nouveauType);

        System.out.println("classes.personnages.Personnage mis à jour : ");
        System.out.println("Nom : " + personnage.getNom());
        System.out.println("Métier : " + personnage.getType());
    }

    public void demarrerPartie(Personnage personnage, Game game) {
        personnage.setPosition(1); // Réinitialiser la position du personnage à 1
        System.out.println("Vous êtes sur la case : " + personnage.getPosition());

        // créer une instance de la classe Game
       // Game game = new Game();

        // Démarrer la boucle de jeu
        game.demarrerPartie(personnage, this);

        // Demander au joueur s'il souhaite quitter le jeu ou recommencer une partie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez-vous :");
        System.out.println("1. Recommencer une partie");
        System.out.println("2. Quitter");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                // Recommencer une partie en relançant la méthode demarrerPartie
                demarrerPartie(personnage, game);
                break;
            case 2:
                // Quitter le jeu
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Choix invalide !");
        }
        scanner.close();
    }
    public void afficherDeplacement(Game game, Personnage personnage, int position,int diceRoll) {
        System.out.println("Vous avez lancé un dé et obtenu : " + diceRoll);
        System.out.println("Vous êtes sur la case 2 : " + personnage.getPosition());
    }
}

