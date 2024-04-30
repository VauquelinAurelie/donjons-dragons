package classes.personnages;
import classes.equipements.EquipementDefensif;
import classes.equipements.EquipementOffensif;

public class Joueur extends Personnage { // classe joueur qui hérite de la classe personnage
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;

    // Constructeur pour un joueur avec un nom, un type et des équipements
    public Joueur(String nom, String type, EquipementOffensif equipementOffensif, EquipementDefensif equipementDefensif) {
        super(nom, type);
        this.equipementOffensif = equipementOffensif;
        this.equipementDefensif = equipementDefensif;
    }

    // Getters et setters pour les équipements offensifs et défensifs
    public EquipementOffensif getEquipementOffensif() {
        return equipementOffensif;
    }

    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    public EquipementDefensif getEquipementDefensif() {
        return equipementDefensif;
    }

    public void setEquipementDefensif(EquipementDefensif equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }
}
