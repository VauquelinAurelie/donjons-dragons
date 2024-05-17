package classes.game;
import classes.plateau.PersonnageHorsPlateauException;
import classes.plateau.Plateau;
import classes.personnages.Guerrier;
import classes.personnages.Magicien;
import classes.personnages.Personnage;
import java.util.Scanner;

public class Menu {
    private Personnage personnage;
    public int nombreCase = 64;

    public void afficherMenu() throws PersonnageHorsPlateauException {
        Scanner scanner = new Scanner(System.in);
        int choix;
        boolean joueurCreer = false;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Créer personnage");
            System.out.println("2. Modifier personnage");
            System.out.println("3. Démarrer la partie");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    personnage = creerJoueur();
                    joueurCreer = true;
                    break;
                case 2:
                    if (joueurCreer) {
                        modifierJoueur(personnage);
                    } else {
                        System.out.println("veuillez créer un joueur");
                    }
                    break;
                case 3:
                    Game game = new Game();
                    if (joueurCreer) {
                        demarrerPartie(personnage, game);
                    } else {
                        System.out.println("veuillez créer un joueur");
                    }
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

    // Méthode pour créer un joueur
    public Personnage creerJoueur() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Votre métier ( Guerrier ou Magicien ) : ");
        String type = scanner.nextLine().toUpperCase();

        Personnage personnage = null;

        if (type.equalsIgnoreCase("Guerrier")) {
            personnage = new Guerrier(nom,"Pas d'arme");
        } else if (type.equalsIgnoreCase("Magicien")) {
            personnage = new Magicien(nom);
        } else {
            System.out.println("Choix invalide !");
        }

        // Afficher les informations du personnage créé
        if (personnage != null) {
            System.out.println("Personnage créé : ");
            System.out.println("Nom : " + personnage.getNom());
            System.out.println("Métier : " + personnage.getType());
        }

        return personnage;
    }

    public void modifierJoueur(Personnage personnage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nouveau nom : ");
        String nouveauNom = scanner.nextLine();
        System.out.print("Nouveau métier (Guerrier ou Magicien) : ");
        String nouveauType = scanner.nextLine();

        //  Mettre à jour les informations du personnage
        personnage.setNom(nouveauNom);
        personnage.setType(nouveauType);

        System.out.println("Personnage mis à jour : ");
        System.out.println("Nom : " + personnage.getNom());
        System.out.println("Métier : " + personnage.getType());
    }

    public void demarrerPartie(Personnage personnage, Game game) throws PersonnageHorsPlateauException {

        personnage.setPosition(1); // Réinitialiser la position du personnage à 1
        System.out.println("Vous êtes sur la case : " + personnage.getPosition());
        Plateau plateau = new Plateau(nombreCase);
        // Démarrer la boucle de jeu
        try {
            game.jouer(plateau, personnage, this);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());
        }
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

    public void afficherDeplacement(Game game, Personnage personnage, int position, int diceRoll) {
        System.out.println("Vous avez lancé un dé et obtenu : " + diceRoll);
        System.out.println("Vous êtes sur la case : " + personnage.getPosition());
    }

    public void afficherVictoire(Game game, Personnage personnage) {
        System.out.println("Vous avez gagné !");
    }

    public void afficherDefaite(Game game, Personnage personnage) {
        System.out.println("Vous avez perdu !");
    }

    public void message(String message) {
        System.out.println(message);
    }
}

