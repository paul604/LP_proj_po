package fr.nicoPaul.stocks;

import java.io.Serializable;

/**
 * Classe Abstraite Article
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public abstract class Article implements Serializable {

    private static final long serialVersionUID = 3671723026294559812L;

    protected String reference;
    protected String marque;
    protected String modele;
    protected double prix;

  /**
   * Constructeur de la classe
   * @param reference
   * @param marque
   * @param modele
   * @param prix
   */
    public Article(String reference, String marque, String modele, double prix) {
        this.reference = reference;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (Double.compare(article.prix, prix) != 0) return false;
        if (!reference.equals(article.reference)) return false;
        if (!marque.equals(article.marque)) return false;
        return modele.equals(article.modele);
    }

    //-------------------------------
    //      Getters et Setters
    //         de la classe
    //-------------------------------

  /**
   *  fonction qui retourne la référence d'un article
   * @return
   */
  public String getReference() {
        return reference;
    }

    /**
     * fonction qui définit la référence d'un article
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

  /**
   *  foncyion qui retourne la marque d'un article
   * @return la marque de l'article
   */
  public String getMarque() {
        return marque;
    }

  /**
   * fonction qui définit la marque de l'article
   * @param marque
   */
    public void setMarque(String marque) {
        this.marque = marque;
    }

  /**
   * fonction qui retourne le modèle d'un article
   * @return le modèle
   */
  public String getModele() {
        return modele;
    }

  /**
   * fonction qui définit le modèle d'un article
   * @param modele
   */
  public void setModele(String modele) {
        this.modele = modele;
    }

  /**
   * fonction qui définit le prix d"'un article
   * @return le prix d'un article
   */
    public double getPrix() {
        return prix;
    }

  /**
   * fonction qui définit le prix d'un article
   * @param prix
   */
    public void setPrix(double prix) {
        this.prix = prix;
    }
//
//  /**
//   * fonction qui retourne le nombre d'exemplaire disponible d'un article
//   * @return le nombre disponible
//   */
//  public int getNbDispo() {
//        return nbDispo;
//    }
//
//  /**
//   * fonction qui définit le nombre d'exemplaire disponible d'un article
//   * @param nbDispo
//   */
//    public void setNbDispo(int nbDispo) {
//        this.nbDispo = nbDispo;
//    }
}
