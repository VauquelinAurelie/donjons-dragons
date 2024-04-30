package classes;

import classes.equipements.EquipementOffensif;
import classes.personnages.Personnage;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Plateau {
    private int nombreCase = 64;

    public void placerEnnemis(Personnage[] ennemis) { // position aléatoire de 5 ennemis
        int nombreEnnemis = 5;
        Random random = new Random();
        Set<Integer> positionsOccupees = new HashSet<>(); // stock les positions ennemis

        for (int i = 0; i < nombreEnnemis; i++) {
            ennemis[i] = new Personnage();
            int positionEnnemi;
            do {
                positionEnnemi = random.nextInt(nombreCase) + 1;
            } while (positionsOccupees.contains(positionEnnemi));

            positionsOccupees.add(positionEnnemi); // Ajoute la position à l'ensemble des positions prises
            ennemis[i].setPosition(positionEnnemi); // Affecte la position à l'ennemi
            System.out.println("Ennemi " + (i + 1) + " positionné sur la case : " + positionEnnemi); // affichage pour tester à supprimer
        }
    }

        public void placerSurprise(EquipementOffensif[] surprise) { // position aléatoire des caisses surprise
            int nombreSurprise = 5;
            Random random1 = new Random();
            Set<Integer> positionsOccupeesSurprise = new HashSet<>(); // stock les positions des box surprise

            for (int i = 0; i < nombreSurprise; i++) {
                // Génération aléatoire des valeurs
                String type = "Type " + (i + 1);
                int niveauAttaque = random1.nextInt(20) + 1; // Valeur aléatoire entre 1 et 20
                String nom = "Nom " + (i + 1);

                // Création de l'équipement offensif avec les valeurs aléatoires
                surprise[i] = new EquipementOffensif(type, niveauAttaque, nom);
                int positionSurprise;
                do {
                    positionSurprise = random1.nextInt(nombreCase) + 1;
                }while (positionsOccupeesSurprise.contains(positionSurprise));
                positionsOccupeesSurprise.add(positionSurprise);
                surprise[i].setPosition(positionSurprise);
                System.out.println("Surprise " + (i + 1) + "positionné sur la case : " + positionSurprise);
            }
        }
}

