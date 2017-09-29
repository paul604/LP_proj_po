package fr.nicoPaul.stocks;

/**
 * Created by Paul on 18/09/17.
 */
public class LitMedicalise extends TabLit {

    protected MatelasAAir matelas;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------


    public LitMedicalise(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, Dimension dimension, MatelasAAir matelas) {
        super(reference, marque, modele, prix, nbDispo, poidsMax, dimension);
        this.matelas = matelas;
    }
}
