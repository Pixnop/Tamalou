package system;

public class Carte {
    private String valeur;
    private String couleur;

    public Carte(String valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public String getValeur() {
        return this.valeur;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return this.valeur + " de " + this.couleur;
    }
}
