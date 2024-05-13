package classes.equipements;

import classes.ContenuCase;

public class Potion implements ContenuCase {
    // Implémentation de la méthode interaction
    @Override
    public void interaction() {
        System.out.println("Interaction avec une potion !");
    }
}
