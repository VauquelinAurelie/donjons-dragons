package classes.personnages;

public class Personnage {
    private String nom;
    private String type;
    private int position;

     // constructeur de la class classes.personnages.Personnage  avec le nom et le type
    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
        this.position = 1;
    }
    // Méthode pour obtenir la position du personnage
    public int getPosition() {
        return position;
    }

    // Méthode pour définir la position du personnage
    public void setPosition(int position) {
        this.position = position;
    }

    // Getters Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}