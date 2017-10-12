package fr.nicoPaul.stocks;

import java.io.Serializable;

/**
 * Classe qui définit les dimensions
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class Dimension implements Serializable{

    private static final long serialVersionUID = 7571525845514467168L;

    private double longueur;
    private double largeur;
    private double hauteur;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------

    /**
     * Constructeur de la classe
     * @param longueur
     * @param largeur
     * @param hauteur
     */
    public Dimension(double longueur, double largeur, double hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    //-------------------------------
    //      Getters et Setters
    //         de la classe
    //-------------------------------

    /**
     * méthode qui retourne la longueur
     * @return longueur
     */
    public double getLongueur() {
        return longueur;
    }

    /**
     * méthode qui définit la longueur
     * @param longueur
     */
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    /**
     * méthode qui retourne la largeur
     * @return
     */
    public double getLargeur() {
        return largeur;
    }

    /**
     * méthode qui définit la largeur
     * @param largeur
     */
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    /**
     * méthode qui retourne la hauteur
     * @return hauteur
     */
    public double getHauteur() {
        return hauteur;
    }

    /**
     * méthode qui modifie la hauteur
     * @param hauteur
     */
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}
