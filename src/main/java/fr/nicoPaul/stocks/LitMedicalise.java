package fr.nicoPaul.stocks;

/**
 * Classe LitMedicalise qui hérite de la classe TabLit
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class LitMedicalise extends TabLit {

    protected MatelasAAir matelas;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------

    /**
     * Constructeur de la classe
     * @param reference
     * @param marque
     * @param modele
     * @param prix
     * @param nbDispo
     * @param poidsMax
     * @param dimension
     * @param matelas
     */
    public LitMedicalise(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, Dimension dimension, MatelasAAir matelas) {
        super(reference, marque, modele, prix, nbDispo, poidsMax, dimension);
        this.matelas = matelas;
    }
}
