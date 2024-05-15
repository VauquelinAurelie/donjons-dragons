package classes.personnages;
import classes.equipements.Arme;
import classes.equipements.Sort;

public class Magicien extends Personnage { // Classe Magicien, héritant de Personnage
   private Sort offensif;

    // constructeur
    public Magicien(String nom) {
        super(nom, "Magicien", 6, 15,"Philtre");
    }

    // Redéfinition de la méthode attaquer
    @Override
    public void attaquer() {
        System.out.println("Le magicien " + nom + " lance un sort avec " + offensif + "!");
    }

    @Override
    public String toString() {
        return "Magicien : " + nom ;
    }

    public Sort getOffensif() {
        return offensif;
    }

    public void setOffensif(Sort sort) {
        this.offensif = sort;
        this.forceAttaqueActuelle += sort.getNiveauAttaque();
        this.niveauVieActuel += sort.getNiveauVie();
    }
}
