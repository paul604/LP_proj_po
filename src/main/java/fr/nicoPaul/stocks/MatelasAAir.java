package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public class MatelasAAir extends Article {

    private int poidsMax;
    private int gonflage;
    private Dimension dimension;


    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public MatelasAAir(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, int gonflage, Dimension dimension) {
        super(reference, marque, modele, prix, nbDispo);
        this.poidsMax = poidsMax;
        this.gonflage = gonflage;
        this.dimension = dimension;
    }

    //-------------------------------
    //           Getters
    //         de la classe
    //-------------------------------


    public int getPoidsMax() {
        return poidsMax;
    }

    public int getGonflage() {
        return gonflage;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
