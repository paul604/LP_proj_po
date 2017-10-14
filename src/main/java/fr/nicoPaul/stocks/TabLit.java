package fr.nicoPaul.stocks;

/**
 * Classe TabLit qui hérite de la classe Article
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public abstract class TabLit extends Article {

    private static final long serialVersionUID = -622225826023814833L;

    protected int poidsMax;
    protected Dimension dimension;

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
    public TabLit(String reference, String marque, String modele, double prix, int poidsMax, Dimension dimension) {
        super(reference, marque, modele, prix);
        this.poidsMax = poidsMax;
        this.dimension = dimension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabLit)) return false;
        if (!super.equals(o)) return false;

        TabLit tabLit = (TabLit) o;

        if (poidsMax != tabLit.poidsMax) return false;
        return dimension.equals(tabLit.dimension);
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
