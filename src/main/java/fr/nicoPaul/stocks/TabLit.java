package fr.nicoPaul.stocks;

/**
 * Classe TabLit qui hérite de la classe Article
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public abstract class TabLit extends Article {

    private int poidsMax;
    private Dimension dimension;

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
     */
    public TabLit(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, Dimension dimension) {
        super(reference, marque, modele, prix, nbDispo);
        this.poidsMax = poidsMax;
        this.dimension = dimension;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------

    /**
     * méthode qui récupère le poids maximal
     * @return
     */
    public int getPoidsMax() {
        return poidsMax;
    }

    /**
     * méthode qui récupère les dimensions
     * @return
     */
    public Dimension getDimension() {
        return dimension;
    }
}
