package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public abstract class TabLit extends Article {

    private int poidsMax;
    private Dimension dimension;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public TabLit(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, Dimension dimension) {
        super(reference, marque, modele, prix, nbDispo);
        this.poidsMax = poidsMax;
        this.dimension = dimension;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------


    public int getPoidsMax() {
        return poidsMax;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
