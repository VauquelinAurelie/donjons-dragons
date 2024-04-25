public class Personnage {
    private String nom;
    private String type; // peut-être "guerrier" ou "magicien"
    private String equipementOffensif;
    private String equipementDefensif;

    // constructeur de la class Personnage
    public Personnage() {
        //constucteur sans paramètres
    }
    // constructeur de la class Personnage  avec le nom
    public Personnage(String nom) {

        this.nom = nom;
    }
    // constructeur de la class Personnage  avec le nom et le type
    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }
}