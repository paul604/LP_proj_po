package fr.nicoPaul.stocks;

/**
 * Classe SouleveMalades
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class SouleveMalade extends Article {

    private static final long serialVersionUID = 1834603164967030938L;

    private int capLevage;
    private int degrePivo;
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
     * @param capLevage
     * @param degrePivo
     */
    public SouleveMalade(String reference, String marque, String modele, double prix, int capLevage, int degrePivo) {
        super(reference, marque, modele, prix);
        this.capLevage = capLevage;
        this.degrePivo = degrePivo;
        nbMax++;
        nbDispo++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SouleveMalade)) return false;
        if (!super.equals(o)) return false;

        SouleveMalade that = (SouleveMalade) o;

        if (capLevage != that.capLevage) return false;
        return degrePivo == that.degrePivo;
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
        SouleveMalade.nbDispo = nbDispo;
    }

    public void addNbDispo(){
        SouleveMalade.nbDispo++;
    }

    public void supNbDispo(){
        SouleveMalade.nbDispo--;
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
        SouleveMalade.nbMax = nbMax;
    }

    public void addNbMax(){
        SouleveMalade.nbMax++;
    }

    public void supNbMax(){
        SouleveMalade.nbMax--;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SouleveMalade{");
        sb.append("reference='").append(reference).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", modele='").append(modele).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", capLevage=").append(capLevage);
        sb.append(", degrePivo=").append(degrePivo);
        sb.append('}');
        return sb.toString();
    }
}
