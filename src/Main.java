public class Main {

    public static void main(String[] args) {
        // créer une instance de la classe Personnage
        Personnage personnage = new Personnage();
        personnage = personnage.creerPersonnage();
        System.out.println("Personnage créé : " + personnage.getNom() + " (" + personnage.getType() + ")");
    }
}
