package classes.personnages;
import classes.plateau.ContenuCase;

public class Ennemi implements ContenuCase {
    private String nom;
    protected int niveauVie;
    protected int forceAttaque;

    public Ennemi(String nom, int forceAttaque, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;
    }
public void interaction(Personnage personnage) {
    System.out.println("Interaction avec un ennemi !");
}

    @Override
    public String toString() {
        return "Ennemi : " + nom;
    }
}
