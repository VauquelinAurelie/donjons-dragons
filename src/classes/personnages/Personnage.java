package classes.personnages;

 public abstract class Personnage {
    protected String nom;
    protected String type;
    protected int niveauVie;
    protected int forceAttaque;
    protected String defensif;
    protected int position;

     // constructeur de la class classes.personnages.Personnage  avec le nom et le type
    public Personnage(String nom, String type, int niveauVie, int forceAttaque, String defensif) {
        this.nom = nom;
        this.type = type;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;
        this.defensif = defensif;
        this.position = 1;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", position=" + position +
                '}';
    }
     // Méthode abstraite pour attaquer
     public abstract void attaquer();

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