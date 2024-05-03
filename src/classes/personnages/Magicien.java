package classes.personnages;

public class Magicien extends Personnage { // Classe Magicien, héritant de Personnage
    // constructeur
    public Magicien(String nom) {
        super(nom, "Magicien", 15, 6,"Philtre");
    }
    // Redéfinition de la méthode attaquer
    @Override
    public void attaquer() {
        System.out.println("Le magicien " + nom + " lance un sort !");
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Magicien : " + nom ;
    }
}
