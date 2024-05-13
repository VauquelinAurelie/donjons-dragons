package classes;
import classes.equipements.Arme;
import classes.personnages.Ennemi;
import classes.equipements.Potion;
import java.util.ArrayList;

public class Plateau {
//    private ArrayList<Case> cases;
    private ContenuCase[] cases;

    public Plateau(int nombreCase) {
        cases = new ContenuCase[nombreCase];
        //cases = new ArrayList<>();
        this.initialisationCase(nombreCase);
    }

    // méthode pour initialiser les cases avec leur contenu
    private void initialisationCase(int nombreCase) {
        cases[0] = null;
        cases[1] = new Ennemi("Gobelin");
        cases[2] = new Arme("Epée",10);
        cases[3] = new Potion();
        // ...
    }

    public int getNombreCase() {
        return cases.length;
    }

    public ContenuCase getContenuCase(int index) {
        if (index >= 0 && index < cases.length) {
            return cases[index];
        } else {
            System.out.println("Index de case invalide.");
            return null;
        }
    }
}




