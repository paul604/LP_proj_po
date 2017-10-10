package fr.nicoPaul.stocks;

/**
 * Classe TabAlite qui hérite de TabLit
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class TableAlite extends TabLit {


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
    public TableAlite(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, Dimension dimension) {
        super(reference, marque, modele, prix, nbDispo, poidsMax, dimension);
    }
}
