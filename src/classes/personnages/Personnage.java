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
    protected boolean estGuerrier;
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

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", position=" + position +
                '}';
    }

    // Méthode abstraite pour attaquer
    public abstract void attaquer();

    public void equiperPotion(Potion potion) {
        // Vérifie si le personnage a déjà une potion équipée
        if (this.offensif instanceof Potion) {
            System.out.println("Le personnage " + this.nom + " possède déjà une potion équipée.");
        } else {
            // Équipe la nouvelle potion
            this.offensif = potion;
            System.out.println("Le personnage " + this.nom + " a équipé la potion : " + potion.getNom());
        }
    }

    // Méthode pour obtenir la position du personnage
    public int getPosition() {
        return position;
    }

    // Méthode pour définir la position du personnage
    public void setPosition(int position) {
        this.position = position;
    }

    // Getters Setters

    public EquipementOffensif getOffensif() {
        return offensif;
    }

    public void setOffensif(EquipementOffensif offensif) {
        this.offensif = offensif;
        // Mise à jour de la force d'attaque actuelle si l'équipement offensif est un sort
        if (offensif instanceof Sort) {
            this.forceAttaqueActuelle += ((Sort) offensif).getNiveauAttaque();
        }
        // Mise à jour de la force d'attaque actuelle si l'équipement offensif est une arme
        if (offensif instanceof Arme) {
            this.forceAttaqueActuelle += ((Arme) offensif).getNiveauAttaque();
        }
        // Mise à jour du niveau de vie actuel si l'équipement offensif est une potion
        if (offensif instanceof Potion) {
            this.niveauVieActuel += ((Potion) offensif).getNiveauVie();
        }
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public int getNiveauAttaque() {
        return forceAttaqueActuelle;
    }

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