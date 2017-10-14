package fr.nicoPaul.stocks;

/**
 * Classe FauteuilRoulant
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class FauteuilRoulant extends Article {

    private static final long serialVersionUID = 2729766231753009560L;

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
        nbMax++;
        nbDispo++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FauteuilRoulant)) return false;
        if (!super.equals(o)) return false;

        FauteuilRoulant that = (FauteuilRoulant) o;

        if (largeurAssise != that.largeurAssise) return false;
        return Double.compare(that.poids, poids) == 0;
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

    public void addNbDispo(){
        FauteuilRoulant.nbDispo++;
    }

    public void supNbDispo(){
        FauteuilRoulant.nbDispo--;
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

    public void addNbMax(){
        FauteuilRoulant.nbMax++;
    }

    public void supNbMax(){
        FauteuilRoulant.nbMax--;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FauteuilRoulant{");
        sb.append("reference='").append(reference).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", modele='").append(modele).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", largeurAssise=").append(largeurAssise);
        sb.append(", poids=").append(poids);
        sb.append('}');
        return sb.toString();
    }
}
