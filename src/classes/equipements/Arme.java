package classes.equipements;

import classes.personnages.Personnage;
import classes.plateau.ContenuCase;

public class Arme extends EquipementOffensif implements ContenuCase { // Classe Arme, héritant de EquipementOffensif
    private int niveauAttaque;
    private String type = "arme";

    // Implémentation de la méthode interaction
    @Override
    public void interaction(Personnage personnage) {
        System.out.println("Interaction avec une arme !");
    }

    // Constructeur prenant en compte le bonus d'attaque
    public Arme(String nom, int bonusAttaque) {
        super(nom, 0, "arme"); // L'attaque de l'arme est initialisée à 0 car elle sera modifiée par le bonus
        this.niveauAttaque = bonusAttaque;
    }

    // Méthode pour obtenir le bonus d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Arme : "; //+ getNom() + ", Bonus d'attaque : " + niveauAttaque;
    }
}



//
//// constructeur
//public Arme(int niveauAttaque, String nom) {
//    super("Arme", niveauAttaque, nom);
//}
//
//// Redéfinition de la méthode toString
//@Override
//public String toString() {
//    return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
//}