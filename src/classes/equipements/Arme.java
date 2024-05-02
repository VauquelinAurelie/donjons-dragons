package classes.equipements;

public class Arme extends EquipementOffensif{ // Classe Arme, héritant de EquipementOffensif
    // constructeur
    public Arme(String type, int niveauAttaque, String nom) {
        super(type, niveauAttaque, nom);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}
