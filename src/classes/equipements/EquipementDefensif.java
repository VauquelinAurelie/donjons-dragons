package classes.equipements;

public class EquipementDefensif { // Equipement défensif par défaut "bouclier" ou "philtre"
    private String type;
    private int niveauDefense;
    private String nom;

    // Constructeur
    public EquipementDefensif(String type, int niveauDefense, String nom) {
        this.type = type;
        this.niveauDefense = niveauDefense;
        this.nom = nom;
    }

    // Getters et setters
}