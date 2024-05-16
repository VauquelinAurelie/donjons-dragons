package classes.plateau;
import classes.equipements.Arme;
import classes.equipements.Sort;
import classes.personnages.Ennemi;
import classes.equipements.Potion;


public class Plateau {
    private ContenuCase[] cases;

    public Plateau(int nombreCase) {
        cases = new ContenuCase[nombreCase];
        this.initialisationCase(nombreCase);
    }

    // méthode pour initialiser les cases avec leur contenu
    private void initialisationCase(int nombreCase) {
        cases[0] = null;
        cases[1] = new Arme ("Massue",3);
        cases[2] = new Ennemi("Gobelin", 1, 6);
        cases[3] = new Sort (2,"Eclair");
        cases[4] = new Arme ("Epee", 5);
        cases[5] = new Ennemi ("Sorcier", 2, 9);
        cases[6] = new Potion ("Potion Standard", 2);
        cases[7] = new Sort (7,"Boule de feu");
        cases[8] = new Ennemi("Dragon", 4, 15);
        cases[9] = new Potion ("Grande Potion",5);
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




