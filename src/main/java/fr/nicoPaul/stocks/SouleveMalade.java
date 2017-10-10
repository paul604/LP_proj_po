package fr.nicoPaul.stocks;

/**
 * Classe SouleveMalades
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class SouleveMalade extends Article {

    private int capLevage;
    private int degrePivo;

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
     * @param capLevage
     * @param degrePivo
     */
    public SouleveMalade(String reference, String marque, String modele, double prix, int nbDispo, int capLevage, int degrePivo) {
        super(reference, marque, modele, prix, nbDispo);
        this.capLevage = capLevage;
        this.degrePivo = degrePivo;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------

    /**
     * méthode qui récupère la capacité de levage d'un soulève malade
     * @return capLevage
     */
    public int getCapLevage() {
        return capLevage;
    }

    /**
     * méthode qui récupère le degré de pivotation d'un soulève malade
     * @return degrePivo
     */
    public int getDegrePivo() {
        return degrePivo;
    }
}
