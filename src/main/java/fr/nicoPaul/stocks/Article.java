package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public abstract class Article {

    private String reference;
    private String marque;
    private String modele;
    private double prix;
    private int nbDispo;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public Article(String reference, String marque, String modele, double prix, int nbDispo) {
        this.reference = reference;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.nbDispo = nbDispo;
    }

    //-------------------------------
    //      Getters et Setters
    //         de la classe
    //-------------------------------


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbDispo() {
        return nbDispo;
    }

    public void setNbDispo(int nbDispo) {
        this.nbDispo = nbDispo;
    }
}
