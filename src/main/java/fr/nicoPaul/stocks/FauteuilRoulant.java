package fr.nicoPaul.stocks;

/**
 * Classe FauteuilRoulant
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class FauteuilRoulant extends Article {

    private int largeurAssise;
    private double poids;
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
     * @param largeurAssise
     * @param poids
     */
    public FauteuilRoulant(String reference, String marque, String modele, double prix, int largeurAssise, double poids) {
        super(reference, marque, modele, prix);
        this.largeurAssise = largeurAssise;
        this.poids = poids;
    }

    //-------------------------------
    //            Getters
    //         de la classe
    //-------------------------------

    /**
     * fonction qui retourne la largeur d'assise d'un fauteuil roulant
     * @return largeurAssise
     */
    public int getLargeurAssise() {
        return largeurAssise;
    }

    /**
     *  fonction qui retourne le poids maximal que peut supporter un fauteuil roulant
     * @return
     */
    public double getPoids() {
        return poids;
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
        FauteuilRoulant.nbDispo = nbDispo;
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
        FauteuilRoulant.nbMax = nbMax;
    }
}
