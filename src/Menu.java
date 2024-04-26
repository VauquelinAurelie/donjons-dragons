import java.util.Scanner;

public class Menu {
    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Créer un personnage");
            System.out.println("2. Démarrer la partie");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    creerPersonnage();
                    break;
                case 2:
                    demarrerPartie();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 3);

        scanner.close();
    }

    public void creerPersonnage() {
        Personnage personnage = new Personnage();
    }

    public void demarrerPartie() {
        // Mettez ici votre logique pour démarrer la partie
        System.out.println("Partie démarrée !");
    }
}
