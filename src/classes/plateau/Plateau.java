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
        cases[4] = new Arme ("Massue",3);
        cases[5] = new Ennemi("Gobelin", 1, 6);
        cases[6] = new Potion ("Potion Standard", 2);
//        cases[7] = new Sort (2,"Eclair");
//        cases[8] = new Ennemi("Gobelin", 1, 6);
//        cases[9] = new Ennemi("Sorcier",2,9);
//        cases[10] = new Arme ("Massue",3);
//        cases[11] = new Ennemi("Gobelin", 1, 6);
//        cases[12] = new Potion (2,"Potion Standard");
//        cases[13] = null;
//        cases[14] = new Ennemi("Gobelin", 1, 6);
//        cases[15] = null;
//        cases[16] = new Sort (2, "Eclair");
//        cases[17] = new Ennemi("Gobelin", 1, 6);
//        cases[18] = new Arme ("Epee", 5);
//        cases[19] = new Ennemi("Sorcier", 2, 9);
//        cases[20] = null;
//        cases[21] = new Arme ("Massue", 3);
//        cases[22] = new Sort (2,"Eclair");
//        cases[23] = new Ennemi("Gobelin", 1, 6);
//        cases[24] = new Ennemi("Sorcier", 2, 9);
//        cases[25] = new Arme ("Epee", 5);
//        cases[26] = new Ennemi("Gobelin", 1, 6);
//        cases[27] = new Potion (5,"Grande Potion");
//        cases[28] = null;
//        cases[29] = new Ennemi("Gobelin", 1, 6);
//        cases[30] = new Potion (2,"Potion Standard");
//        cases[31] = new Ennemi("Sorcier", 2, 9);
//        cases[32] = new Sort (7,"Boule de feu");
//        cases[33] = null;
//        cases[34] = new Ennemi("Sorcier", 2, 9);
//        cases[35] = new Arme ("Massue", 3);
//        cases[36] = new Ennemi("Sorcier", 2, 9);
//        cases[37] = new Arme ("Epee", 5);
//        cases[38] = new Potion (2, "Potion Standard");
//        cases[39] = new Ennemi("Sorcier", 2, 9);
//        cases[40] = new Potion (5,"Grande Potion");
//        cases[41] = new Ennemi("Sorcier", 2, 9);
//        cases[42] = null;
//        cases[43] = new Ennemi("Sorcier", 2, 9);
//        cases[44] = new Ennemi("Dragon", 4, 15);
//        cases[45] = null;
//        cases[46] = new Ennemi("Sorcier", 2, 9);
//        cases[47] = new Sort (7,"Boule de feu");
//        cases[48] = new Potion (2, "Potion Standard");
//        cases[49] = null;
//        cases[50] = null;
//        cases[51] = null;
//        cases[52] = new Arme ("Epee", 5);
//        cases[53] = null;
//        cases[54] = null;
//        cases[55] = new Ennemi("Dragon", 4,15);
//        cases[56] = null;
//        cases[57] = null;
//        cases[58] = null;
//        cases[59] = null;
//        cases[60] = null;
//        cases[61] = new Ennemi("Dragon", 4,15);
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

    // Méthode pour gérer l'interaction en fonction de la classe de l'objet
    public void gererInteraction(ContenuCase contenu) {
        if (contenu instanceof Arme) {
            System.out.println("Interaction avec une arme !");
        } else if (contenu instanceof Potion) {
            System.out.println("Interaction avec une potion !");
        } else if (contenu instanceof Sort) {
            System.out.println("Interaction avec un sort !");
        } else if (contenu instanceof Ennemi) {
            System.out.println("Interaction avec un ennemi !");
        } else {
            System.out.println("Interaction avec un objet inconnu.");
        }
    }
}




