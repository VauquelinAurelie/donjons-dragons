package classes.personnages;

public class Dragon extends Ennemi {
    public Dragon(String nom) {
        super(nom, 4, 15); // Appel du constructeur de la classe parente avec le nom du dragon
    }
    @Override
    public String toString() {
        return "Dragon : "; // + getNom();
    }
}
