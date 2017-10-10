package fr.nicoPaul.stocks;

/**
 * Classe MatelasAAir qui hérite de la classe Article
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class MatelasAAir extends Article {

    private int poidsMax;
    private int gonflage;
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
     * @param gonflage
     * @param dimension
     */
    public MatelasAAir(String reference, String marque, String modele, double prix, int nbDispo, int poidsMax, int gonflage, Dimension dimension) {
        super(reference, marque, modele, prix, nbDispo);
        this.poidsMax = poidsMax;
        this.gonflage = gonflage;
        this.dimension = dimension;
    }

    //-------------------------------
    //           Getters
    //         de la classe
    //-------------------------------

    /**
     * fonction qui retourne le poids maximale que peut supporter unmatelas à air
     * @return poidsMax
     */
    public int getPoidsMax() {
        return poidsMax;
    }

    /**
     * méthode qui retourne le gonflage nécessaire pour un matelas à air
     * @return gonflage
     */
    public int getGonflage() {
        return gonflage;
    }

    /**
     *  méthode qui retourne les dimensions du matelas
     * @return dimension
     */
    public Dimension getDimension() {
        return dimension;
    }
}
