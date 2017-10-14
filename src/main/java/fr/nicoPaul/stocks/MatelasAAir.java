package fr.nicoPaul.stocks;

/**
 * Classe MatelasAAir qui hérite de la classe Article
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class MatelasAAir extends Article {

    private static final long serialVersionUID = 1750067814166608877L;

    private int poidsMax;
    private int gonflage;
    private Dimension dimension;
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
     * @param gonflage
     * @param dimension
     */
    public MatelasAAir(String reference, String marque, String modele, double prix, int poidsMax, int gonflage, Dimension dimension) {
        super(reference, marque, modele, prix);
        this.poidsMax = poidsMax;
        this.gonflage = gonflage;
        this.dimension = dimension;
        nbMax++;
        nbDispo++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatelasAAir)) return false;
        if (!super.equals(o)) return false;

        MatelasAAir that = (MatelasAAir) o;

        if (poidsMax != that.poidsMax) return false;
        if (gonflage != that.gonflage) return false;
        return dimension.equals(that.dimension);
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

    /**
     * fonction qui retourne le nombre d'exemplaire disponible d'un article
     * @return le nombre disponible
     */
    public  int getNbDispo() {
        return nbDispo;
    }

    /**
     * fonction qui définit le nombre d'exemplaire disponible d'un article
     * @param nbDispo
     */
    public  void setNbDispo(int nbDispo) {
        MatelasAAir.nbDispo = nbDispo;
    }

    public void addNbDispo(){
        MatelasAAir.nbDispo++;
    }

    public void supNbDispo(){
        MatelasAAir.nbDispo--;
    }

    /**
     * fonction qui retourne le nombre d'exemplaire max d'un article
     * @return le nombre max
     */
    public  int getNbMax() {
        return nbMax;
    }
    /**
     * fonction qui définit le nombre max d'exemplaire d'un article
     * @param nbMax
     */
    public  void setNbMax(int nbMax) {
        MatelasAAir.nbMax = nbMax;
    }

    public void addNbMax(){
        MatelasAAir.nbMax++;
    }

    public void supNbMax(){
        MatelasAAir.nbMax--;
    }
}
