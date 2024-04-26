public class Metier {
    private String nom;
    private int niveauVie;
    private int forceAttaque;

    // constructeur de la classe Metier sans paramètres
    public Metier(){
        this.nom = "Magicien";
        this.niveauVie = 6;
        this.forceAttaque = 15;
    }
    // constructeur de la classe Metier
    public Metier(String nom, int niveauVie, int forceAttaque) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.forceAttaque = forceAttaque;
    }

    // Getters Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    // méthode pour obtenir un métier par nom
    public Metier getMetierByNom(String nom) {
        if (nom.equals("Guerrier")) {
            return new Metier("Guerrier", 10, 10);
        } else if (nom.equals("Magicien")) {
            return new Metier("Magicien", 6, 15);
        } else {
            throw new IllegalArgumentException("Métier invalide");
        }
    }
}
