package system;

import java.util.ArrayList;
import java.util.List;

public class Jeu {
    /**
     * Liste des joueurs
     */
    private final List<Joueur> joueurs;
    /**
     * Le joueur dont c'est le tour
     */
    private Joueur joueurCourant;
    /**
     * Le plateau de jeu
     */
    private Plateau plateau;
    /**
     * La pioche
     */
    private Carte pioche;
    /**
     * La defausse
     */
    private Carte defausse;


    /**
     * Constructeur
     * @param nomJoueurs Liste des noms des joueurs
     */
    public Jeu(String[] nomJoueurs) {



        joueurs = new ArrayList<Joueur>();
//        for (String nom : nomJoueurs) {
//            joueurs.add(new Joueur(nom, this));
//        }
        joueurCourant = joueurs.get(0);
    }

}
