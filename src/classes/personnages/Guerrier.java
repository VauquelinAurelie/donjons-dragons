package classes.personnages;
import classes.equipements.Arme;

public class Guerrier extends Personnage { // Classe Guerrier, héritant de Personnage
    private Arme offensif;

    // constructeur
    public Guerrier(String nom, String offensif) {
        super(nom, "Guerrier",10,10,"Bouclier");
    }

    // Redéfinition de la méthode attaquer
    @Override
    public void attaquer() {
        System.out.println("Le guerrier " + nom + " attaque avec " + offensif + " !");
    }

    @Override
    public String toString() {
        return "Guerrier : " + nom ;
    }

    public Arme getOffensif() {
        return offensif;
    }

    public void setOffensif(Arme arme) {
        this.offensif = arme;
        this.forceAttaqueActuelle += arme.getNiveauAttaque();
        this.niveauVieActuel += arme.getNiveauVie();
    }
}
