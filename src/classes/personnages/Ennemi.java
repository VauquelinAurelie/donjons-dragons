package classes.personnages;

public class Ennemi {
    private String nom;

    public Ennemi(String nom) {
        this.nom = nom;
    }
 void interaction() {

}

    @Override
    public String toString() {
        return "Ennemi : " + nom;
    }
}
