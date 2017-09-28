package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public class Dimension {

    private double longueur;
    private double largeur;
    private double hauteur;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public Dimension(double longueur, double largeur, double hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    //-------------------------------
    //      Getters et Setters
    //         de la classe
    //-------------------------------


    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}
