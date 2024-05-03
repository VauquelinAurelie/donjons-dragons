package classes.personnages;

public class Guerrier extends Personnage { // Classe Guerrier, héritant de Personnage

    // constructeur
    public Guerrier(String nom) {
        super(nom, "Guerrier",10,10,"Bouclier");
    }

    // Redéfinition de la méthode attaquer
    @Override
    public void attaquer() {
//        System.out.println("Le guerrier " + nom + " attaque avec son épée !");
    }

    @Override
    public String toString() {
        return "Guerrier : " + nom ;
    }
}
