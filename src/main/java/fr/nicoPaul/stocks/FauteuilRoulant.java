package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public class FauteuilRoulant extends Article {

    protected int largeurAssise;
    protected double poids;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public FauteuilRoulant(String reference, String marque, String modele, double prix, int nbDispo, int largeurAssise, double poids) {
        super(reference, marque, modele, prix, nbDispo);
        this.largeurAssise = largeurAssise;
        this.poids = poids;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------


    public int getLargeurAssise() {
        return largeurAssise;
    }

    public double getPoids() {
        return poids;
    }
}
