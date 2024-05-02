package classes.equipements;

 public abstract class EquipementOffensif { // Equipement offensif "arme" ou "sort"
    protected String type;
    protected int niveauAttaque;
    protected String nom;
    protected int position;

    // constructeur
    public EquipementOffensif(String type, int niveauAttaque, String nom) {
        this.type = type;
        this.niveauAttaque = niveauAttaque;
        this.nom = nom;
    }

     // Redéfinition de la méthode toString
     @Override
     public abstract String toString();

    // getters et setters
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}