package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public abstract class TabLit extends Article {

    private int poidsMax;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public TabLit(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax) {
        super(reference, marque, modele, prix, nbDispo);
        this.poidsMax = poidsMax;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------


    public int getPoidsMax() {
        return poidsMax;
    }
}
