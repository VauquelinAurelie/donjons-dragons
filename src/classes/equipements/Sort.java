package classes.equipements;

public class Sort extends EquipementOffensif{ // Classe Sort, héritant de EquipementOffensif
    // constructeur
    public Sort(int niveauAttaque, String nom) {
        super("Sort", niveauAttaque, nom);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Sort : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}
