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
        if (personnage instanceof Magicien magicien) {
            Sort sortActuel = magicien.getSort(); // Utiliser getSort() au lieu de getOffensif()
            if (sortActuel == null || sortActuel.getNiveauAttaque() < niveauAttaque) {
                magicien.setSort(this); // Utiliser setSort() au lieu de setOffensif()
                System.out.println(magicien.getNom() + " a pris le sort " + getNom());
                System.out.println(magicien.getNom() + " ta force d'attaque augmente de " + getNiveauAttaque());

                magicien.setSort(this);
                magicien.setForceAttaqueActuelle(magicien.getForceAttaqueActuelle() + magicien.getArme().getNiveauAttaque());
            } else {
                System.out.println(magicien.getNom() + " possède déjà un sort plus puissant.");
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
