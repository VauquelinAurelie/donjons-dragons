package classes.equipements;
import classes.personnages.Personnage;
import classes.plateau.ContenuCase;

public class Potion extends EquipementOffensif implements ContenuCase {
    private int niveauVie;
    protected EquipementOffensif offensif;

    // constructeur
    public Potion( String nom, int niveauVie) {
        super(nom, 0, niveauVie, "Potion");
        this.niveauVie = niveauVie;
    }

    // Implémentation de la méthode interaction
    @Override
    public void interaction(Personnage personnage) {
        if (personnage instanceof Personnage) {
            EquipementOffensif offensifActuel = personnage.getOffensif();  // Obtient le sort actuellement équipée par le magicien
            if (offensifActuel == null || offensifActuel.getNiveauVie() < niveauVie) {  // Vérifie si le sort actuelle est moins puissante
               personnage.setOffensif(this); // Equipe la potion
                personnage.setNiveauVie(personnage.getNiveauVie() + niveauVie); // Augmente le niveau de vie du personnage
                System.out.println(personnage.getNom() + " a pris la potion " + getNom());
                System.out.println(personnage.getNom() + "ton niveau de vie augmente de  " + getNiveauVie());
            } else {
                System.out.println(personnage.getNom() + " possède déjà une potion plus puissante.");
            }
        }
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Potion : " + nom + ", Niveau de vie : " + niveauVie;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
    }
    public int getNiveauAttaque() {
        // Implémentez la logique pour obtenir le niveau d'attaque de la potion
        return niveauAttaque; // Par exemple, retournez le niveau d'attaque de la potion
    }
}
