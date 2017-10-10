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
     * @param largeurAssise
     * @param poids
     */
    public FauteuilRoulant(String reference, String marque, String modele, double prix, int nbDispo, int largeurAssise, double poids) {
        super(reference, marque, modele, prix, nbDispo);
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
}
