package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public class MatelasAAir extends Article {

    protected int poidsMax;
    protected int gonflage;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public MatelasAAir(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, int gonflage) {
        super(reference, marque, modele, prix, nbDispo);
        this.poidsMax = poidsMax;
        this.gonflage = gonflage;
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
}
