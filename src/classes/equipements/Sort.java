package classes.equipements;
import classes.personnages.Magicien;
import classes.personnages.Personnage;
import classes.plateau.ContenuCase;

public class Sort extends EquipementOffensif implements ContenuCase { // Classe Sort, héritant de EquipementOffensif
    private int niveauAttaque;

    // constructeur
    public Sort(int niveauAttaque, String nom) {
        super(nom, niveauAttaque, 0,"Sort");
        this.niveauAttaque = niveauAttaque;
    }

    // Implémentation de la méthode interaction
    @Override
    public void interaction(Personnage personnage) {
        if (personnage instanceof Magicien) {  // Vérifie si le personnage est un magicien
            Magicien magicien = (Magicien) personnage; // Cast le personnage en magicien
            Sort offensif = magicien.getOffensif();  // Obtient le sort actuellement équipée par le magicien
            if (offensif == null || offensif.getNiveauAttaque() < niveauAttaque) {  // Vérifie si le sort actuelle est moins puissante
                magicien.setOffensif(this);
                System.out.println(magicien.getNom() + " a pris le sort " + getNom());
                System.out.println(personnage.getNom() + "ta force d'attaque augmente de  " + getNiveauAttaque());
            } else {
                System.out.println(magicien.getNom() + " possède déjà le sort plus puissante.");
            }
        } else {
            System.out.println(personnage.getNom() + " n'est pas un magicien et ne peut pas prendre le sort.");
        }
    }

    public String getNom() {
        return super.getNom();
    }

    // Méthode pour obtenir le bonus d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Sort : " + nom + ", Niveau d'attaque : " + niveauAttaque;

    }
}
