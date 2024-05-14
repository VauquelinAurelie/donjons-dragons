package classes.equipements;
import classes.personnages.Personnage;
import classes.plateau.ContenuCase;

public class Potion extends EquipementOffensif implements ContenuCase {
    // constructeur
    public Potion(int niveauVie, String nom) {
        super("Potion", niveauVie, nom);
    }

    // Implémentation de la méthode interaction
    @Override
    public void interaction(Personnage personnage) {
        System.out.println("Interaction avec une potion !");
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Potion : " + nom + ", Niveau de vie : " + niveauVie;

    }
}
