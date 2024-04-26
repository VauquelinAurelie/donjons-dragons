package classes;

public class Personnage {
    private String nom;
    private String type;
    private String equipementOffensif;
    private String equipementDefensif;
    private int position;

    // constructeur de la class classes.Personnage
    public Personnage() {
        //constucteur sans paramètres
        this.nom = "nouveau joueur";
        this.type = "Magicien";
        this.position = 1;
    }
    // constructeur de la class classes.Personnage  avec le nom
    public Personnage(String nom) {
        this.nom = nom;
        this.type = "Magicien";
    }
    // constructeur de la class classes.Personnage  avec le nom et le type
    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

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

    // Méthode pour obtenir la position du personnage
    public int getPosition() {
        return position;
    }

    // Méthode pour définir la position du personnage
    public void setPosition(int position) {
        this.position = position;
    }
}