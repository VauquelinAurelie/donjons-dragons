package classes.equipements;
import classes.personnages.Guerrier;
import classes.personnages.Personnage;
import classes.plateau.ContenuCase;

public class Arme extends EquipementOffensif implements ContenuCase { // Classe Arme, héritant de EquipementOffensif
    private int niveauAttaque;
//    protected EquipementOffensif offensif;

    // Constructeur prenant en compte le bonus d'attaque
    public Arme(String nom, int niveauAttaque) {
        super(nom, niveauAttaque, 0, "Arme"); // L'attaque de l'arme est initialisée à 0 car elle sera modifiée par le bonus
        this.niveauAttaque = niveauAttaque;
    }

    // Implémentation de la méthode interaction
    @Override
    public void interaction(Personnage personnage) {
        if (personnage instanceof Guerrier) {  // Vérifie si le personnage est un Guerrier
            Guerrier guerrier = (Guerrier) personnage; // Cast le personnage en Guerrier
            Arme offensif = guerrier.getOffensif();  // Obtient l'arme actuellement équipée par le Guerrier
            if (offensif == null || offensif.getNiveauAttaque() < niveauAttaque) {  // Vérifie si l'arme actuelle est moins puissante
                guerrier.setOffensif(this);
                System.out.println(guerrier.getNom() + " a pris l'arme " + getNom());
                System.out.println(personnage.getNom() + "ta force d'attaque augmente de  " + getNiveauAttaque());
            } else {
                System.out.println(guerrier.getNom() + " possède déjà une arme plus puissante.");
            }
        } else {
            System.out.println(personnage.getNom() + " n'est pas un guerrier et ne peut pas prendre l'arme.");
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
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}

