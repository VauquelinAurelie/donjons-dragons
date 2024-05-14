package classes.equipements;
import classes.personnages.Personnage;
import classes.plateau.ContenuCase;

public class Sort extends EquipementOffensif implements ContenuCase { // Classe Sort, héritant de EquipementOffensif
    // constructeur
    public Sort(int niveauAttaque, String nom) {
        super("Sort", niveauAttaque, nom);
    }

    // Implémentation de la méthode interaction
    @Override
    public void interaction(Personnage personnage) {
        System.out.println("Interaction avec un sort !");
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Sort : " + nom + ", Niveau d'attaque : " + niveauAttaque;

    }
}
