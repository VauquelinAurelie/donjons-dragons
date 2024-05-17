package classes.personnages;
import classes.equipements.Arme;
import classes.equipements.EquipementOffensif;
import classes.equipements.Potion;
import classes.equipements.Sort;

public abstract class Personnage {
    protected String nom;
    protected String type;
    protected int niveauVie;
    protected int niveauVieActuel;
    protected int forceAttaque;
    protected int forceAttaqueActuelle;
    protected String defensif;
    private EquipementOffensif offensif;
    private Potion potion;
    private Arme arme;
    private Sort sort;
    protected int position;

    // constructeur de la class classes.personnages.Personnage
    public Personnage(String nom, String type, int niveauVie, int forceAttaque, String defensif) {
        this.nom = nom;
        this.type = type;
        this.niveauVie = niveauVie;
        this.niveauVieActuel = niveauVie; // Initialise le niveau de vie actuel avec le niveau de vie initial
        this.forceAttaque = forceAttaque;
        this.forceAttaqueActuelle = forceAttaque; // Initialise la force d'attaque actuelle avec la force d'attaque initiale
        this.defensif = defensif;
        this.position = 1;
    }

    // Redéfinition de la méthode attaquer
    public abstract void attaquer(Ennemi ennemi);

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", position=" + position +
                '}';
    }

//    public void equiperPotion(Potion potion) {
//        // Vérifie si le personnage a déjà équipé d'une potion
//        if (this.offensif instanceof Potion) {
//            System.out.println("Le personnage " + this.nom + " possède déjà équipé d'une potion.");
//        } else {
//            // Équipe la nouvelle potion
//            this.offensif = potion;
//            System.out.println("Le personnage " + this.nom + " s'est équipé de la potion : " + potion.getNom());
//        }
//    }

    // Méthode pour obtenir la position du personnage
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public EquipementOffensif getOffensif() {
        return offensif;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
        // Mise à jour de la force d'attaque actuelle si l'équipement offensif est un sort
        if (offensif instanceof Sort sort) {
            this.forceAttaqueActuelle += ((Sort) offensif).getNiveauAttaque();
            this.offensif = sort;
            this.niveauVieActuel += sort.getNiveauVie();
            System.out.println("test sort");
        }
        // Mise à jour de la force d'attaque actuelle si l'équipement offensif est une arme
        if (offensif instanceof Arme arme) {
            this.forceAttaqueActuelle += ((Arme) offensif).getNiveauAttaque();
            this.offensif = arme;
            this.niveauVieActuel += arme.getNiveauVie();
            System.out.println("test arme");
        }
        // Mise à jour du niveau de vie actuel si l'équipement offensif est une potion
        if (offensif instanceof Potion ) {
            this.niveauVieActuel += ((Potion) offensif).getNiveauVie();
            System.out.println("test potion");
        }
    }

    public int getNiveauVie() {
        return niveauVie;
    }
    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public int getNiveauVieActuel() { return niveauVieActuel; }
    public void setNiveauVieActuel(int niveauVieActuel) { this.niveauVieActuel = niveauVieActuel; }

    public int getNiveauAttaque() { return forceAttaqueActuelle; }

    public void setForceAttaque() { this.forceAttaque = getNiveauAttaque() + getOffensif().getNiveauAttaque(); }
    public int getForceAttaque() { return forceAttaque; }

    public int getForceAttaqueActuelle() { return forceAttaqueActuelle; }
    public void setForceAttaqueActuelle(int forceAttaqueActuelle) { this.forceAttaqueActuelle = forceAttaqueActuelle; }


    public Potion getPotion() {
        return potion;
    }     // Méthode pour obtenir la potion actuelle
    public void setPotion(Potion potion) {
        this.potion = potion;
    }     // Méthode pour équiper une nouvelle potion

    public Arme getArme() {
        return arme;
    }     // Méthode pour obtenir la potion actuelle
    public void setArme(Arme arme) {
        this.arme = arme;
    }     // Méthode pour équiper une nouvelle potion

    public Sort getSort() {
        return sort;
    }     // Méthode pour obtenir la potion actuelle
    public void setSort(Sort sort) {
        this.sort = sort;
    }     // Méthode pour équiper une nouvelle potion

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}