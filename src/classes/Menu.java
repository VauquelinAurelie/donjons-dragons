package classes;

import java.util.Scanner;

public class Menu {
    private Personnage personnage;

        public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("=== classes.Menu ===");
            System.out.println("1. Créer personnage");
            System.out.println("2. Modifier personnage");
            System.out.println("3. Démarrer la partie");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    creerPersonnage();
                    break;
                case 2:
                    modifierPersonnage(personnage);
                    break;
                case 3:
                     demarrerPartie(personnage);
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
        Metier metier = new Metier(); //instancier un objet classes.Metier
        metier = metier.getMetierByNom(type);
        personnage = new Personnage(nom,type);
        System.out.println("Votre personnage : " + nom + " (" + type + ")");
        return new Personnage (nom,type);
    }

    public void modifierPersonnage(Personnage personnage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nouveau nom : ");
        String nouveauNom = scanner.nextLine();
        System.out.print("Nouveau métier (Guerrier ou Magicien) : ");
        String nouveauMetier = scanner.nextLine();

        //  Mettre à jour les informations du personnage
        personnage.setNom(nouveauNom);
        personnage.setType(nouveauMetier);

        System.out.println("classes.Personnage mis à jour : ");
        System.out.println("Nom : " + personnage.getNom());
        System.out.println("Métier : " + personnage.getType());
    }

    public void demarrerPartie(Personnage personnage) {
        personnage.setPosition(1); // Réinitialiser la position du personnage à 1
        // Démarrer la boucle de jeu
        Game.demarrerPartie(personnage);

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
                demarrerPartie(personnage);
                break;
            case 2:
                // Quitter le jeu
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Choix invalide !");
        }
    }
}

