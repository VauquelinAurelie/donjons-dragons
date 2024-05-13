package classes;
import classes.equipements.Arme;
import classes.personnages.Ennemi;
import classes.equipements.Potion;
import java.util.ArrayList;

public class Plateau {
    private ArrayList<Case> cases;

    public Plateau(int nombreCase) {
        cases = new ArrayList<>();
        this.initialisationCase(nombreCase);
    }

    // méthode pour initialiser les cases avec leur contenu
    private void initialisationCase(int nombreCase) {
        cases.add(new CaseImpl(null));
        cases.add(new CaseImpl(new Ennemi("Gobelin")));
        cases.add(new CaseImpl(new Arme("Epée",10)));
        cases.add(new CaseImpl(new Potion()));

    }

    public int getNombreCase() {
        return cases.size();
    }

    public Object getContenuCase(int index) {
        if (index >= 0 && index < cases.size()) {
            return cases.get(index).getContenu();
        } else {
            System.out.println("Index de case invalide.");
            return null;
        }
    }

    // Implémentation interne de l'interface Case
    private class CaseImpl implements Case {
        private Object contenu;

        public CaseImpl(Object contenu) {
            this.contenu = contenu;
        }

        @Override
        public Object getContenu() {
            return contenu;
        }

        @Override
        public void setContenu(Object contenu) {
            this.contenu = contenu;
        }
        @Override
        public void interaction() {
            if (contenu != null) {
                System.out.println("Interaction avec : " + contenu.toString());
            } else {
                System.out.println("Case vide, pas d'interaction.");
            }
        }
    }
}




