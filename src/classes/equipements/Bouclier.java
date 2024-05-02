package classes.equipements;

public class Bouclier extends EquipementDefensif{ // Classe Bouclier, héritant de EquipementDefensif
    // construteur
    public Bouclier(String type, int niveauDefense, String nom) {
        super(type, niveauDefense, nom);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Bouclier : " + nom + ", Niveau de défense : " + niveauDefense;
    }
}
