package system;

import java.util.ArrayList;

public class Joueur {
    /**
     * Jeu auquel le joueur est rattaché
     */
    private final Jeu jeu;
    /**
     * Nom du joueur
     */
    private final String nom;
    /**
     * Score du joueur
     */
    private int score;
    /**
     * Liste des cartes du joueur
     */
    private ArrayList<Carte> cartes = new ArrayList<Carte>();

    public Joueur(String nom, Jeu jeu, ArrayList<Carte> cartes) {
        this.nom = nom;
        this.jeu = jeu;
        this.score = 0;
        this.cartes = cartes;
    }
}
