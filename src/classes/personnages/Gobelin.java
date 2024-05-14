package classes.personnages;

public class Gobelin extends Ennemi {
    // Constructeur avec un argument
    public Gobelin(String nom) {
        super(nom, 1, 6); // Appel du constructeur de la classe parente pour initialiser le nom
    }

//    // Constructeur sans argument
//    public Gobelin() {
//        super("Ennemi sans nom"); // Par défaut, appelle le constructeur de la classe parente
//    }

    @Override
    public String toString() {
        return "Gobelin : "; //+ getNom(); // Utilisation d'un getter pour accéder au nom
    }
}
