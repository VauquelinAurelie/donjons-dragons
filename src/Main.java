public class Main {

    public static void main(String[] args) {
        // créer une instance de la classe Personnage
        Personnage personnage = new Personnage();
        personnage.creerPersonnage();

        // créer une instance de la classe Menu
        Menu menu = new Menu();
        menu.afficherMenu();
    }

}
