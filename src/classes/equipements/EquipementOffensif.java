package classes.equipements;

public class EquipementOffensif { // Equipement offensif par défaut "arme" ou "sort"
    private String type;
    private int niveauAttaque;
    private String nom;
    private int position;

    // constructeur
    public EquipementOffensif(String type, int niveauAttaque, String nom) {
        this.type = type;
        this.niveauAttaque = niveauAttaque;
        this.nom = nom;
    }
    // getters et setters
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}