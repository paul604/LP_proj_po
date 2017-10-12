package fr.nicoPaul.stocks;

/**
 * Classe LitMedicalise qui hérite de la classe TabLit
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class LitMedicalise extends TabLit {

    private static final long serialVersionUID = -2794976675098158048L;

    private static int nbDispo;
    private static int nbMax;

    //-------------------------------
    //   Constructeur de la classe
    //-------------------------------

    /**
     * Constructeur de la classe
     * @param reference
     * @param marque
     * @param modele
     * @param prix
     * @param poidsMax
     * @param dimension
     */
    public LitMedicalise(String reference, String marque, String modele, double prix, int poidsMax, Dimension dimension) {
        super(reference, marque, modele, prix, poidsMax, dimension);
    }


    /**
     * fonction qui retourne le nombre d'exemplaire disponible d'un article
     * @return le nombre disponible
     */
    public static int getNbDispo() {
        return nbDispo;
    }

    /**
     * fonction qui définit le nombre d'exemplaire disponible d'un article
     * @param nbDispo
     */
    public static void setNbDispo(int nbDispo) {
        LitMedicalise.nbDispo = nbDispo;
    }

    /**
     * fonction qui retourne le nombre d'exemplaire max d'un article
     * @return le nombre max
     */
    public static int getNbMax() {
        return nbMax;
    }
    /**
     * fonction qui définit le nombre max d'exemplaire d'un article
     * @param nbMax
     */
    public static void setNbMax(int nbMax) {
        LitMedicalise.nbMax = nbMax;
    }
}
