package classes.personnages;

import classes.ContenuCase;

public class Ennemi implements ContenuCase {
    private String nom;

    public Ennemi(String nom) {
        this.nom = nom;
    }
public void interaction() {
    System.out.println("Interaction avec un ennemi !");
}

    @Override
    public String toString() {
        return "Ennemi : " + nom;
    }
}
