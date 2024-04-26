package classes;

public class EquipementOffensif { // Equipement offensif par défaut "arme" ou "sort"
    String type;
    int niveauAttaque;
    String nom;

    // constructeur
    public EquipementOffensif(String type, int niveauAttaque, String nom) {
        this.type = type;
        this.niveauAttaque = niveauAttaque;
        this.nom = nom;
    }
    // getters et setteres
}