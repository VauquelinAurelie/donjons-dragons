package classes.personnages;

public class Sorcier extends Ennemi {
    // Constructeur avec un argument
    public Sorcier(String nom) {
        super(nom, 2, 9); // Appel du constructeur parent avec un nom
    }

//    // Constructeur sans argument
//    public Sorcier() {
//        super("Ennemi sorcier sans nom"); // Par défaut, appelle le constructeur parent avec un nom par défaut
//    }

    @Override
    public String toString() {
        return "Sorcier : "; // + getNom();
    }
}
