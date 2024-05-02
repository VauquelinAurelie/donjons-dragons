package classes.equipements;

public class Philtre extends EquipementDefensif{ // Classe Philtre, héritant de EquipementDefensif
    // constructeur
    public Philtre(String type, int niveauDefense, String nom) {
        super(type, niveauDefense, nom);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Philtre : " + nom + ", Niveau de défense : " + niveauDefense;
    }
}
