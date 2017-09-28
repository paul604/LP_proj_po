package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public class SouleveMalade extends Article {

    private int capLevage;
    private int degrePivo;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public SouleveMalade(String reference, String marque, String modele, double prix, int nbDispo, int capLevage, int degrePivo) {
        super(reference, marque, modele, prix, nbDispo);
        this.capLevage = capLevage;
        this.degrePivo = degrePivo;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------


    public int getCapLevage() {
        return capLevage;
    }

    public int getDegrePivo() {
        return degrePivo;
    }
}
