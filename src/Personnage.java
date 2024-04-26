import java.util.Scanner;

public class Personnage {
    private String nom;
    private String type;
    private String equipementOffensif;
    private String equipementDefensif;

    // constructeur de la class Personnage
    public Personnage() {
        //constucteur sans paramètres
        this.nom = "nouveau joueur";
        this.type = "Magicien";
    }
    // constructeur de la class Personnage  avec le nom
    public Personnage(String nom) {
        this.nom = nom;
        this.type = "Magicien";
    }
    // constructeur de la class Personnage  avec le nom et le type
    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    // Méthode pour créer un personnage
    public Personnage creerPersonnage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Votre nom : ");
        this.nom = scanner.nextLine();
        System.out.print("Votre métier ( Guerrier ou Magicien ) : ");
        this.type = scanner.nextLine();
        Metier metier = new Metier(); //instancier un objet Metier
        metier = metier.getMetierByNom(type);
        this.type = type;
        System.out.println("Votre personnage : " + nom + " (" + type + ")");
        return this;
    }

    // Méthodes d'accès pour obtenir le nom et le type du personnage
    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }
}