package fr.nicoPaul.location;

import fr.nicoPaul.stocks.Article;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Location
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class Location {

    private double montantFacture;
    private List<Article> listeArticleLoue;
    private Date dateDebut;
    private Date dateFin;
    private Client client;

    private static List<Location> locationEnCours;

    //-----------------------------
    //        Constructeur
    //-----------------------------

    /**
     * Main constructeur
     * @param listeArticleLoue
     * @param dateDebut
     * @param dateFin
     */
    public Location(List<Article> listeArticleLoue, Date dateDebut, Date dateFin) {
        this.listeArticleLoue = listeArticleLoue;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.calculeMontant();
    }

    public Location(Date dateDebut, Date dateFin) {
        this.listeArticleLoue = new ArrayList<>();
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montantFacture=0;
    }

    //-----------------------------
    //          Methodes
    //-----------------------------

    public static List<Location> enCours(Client client){
        return null;
//        return locationEnCours.stream()
//                .filter(location -> location.client.equals(client))
//                .collect(Collectors.toList());
    }

    public static double recette(Date debut, Date fin){
        return locationEnCours.stream()
                .filter(location -> location.dateDebut.equals(debut) || location.dateDebut.after(debut))
                .filter(location -> location.dateFin.equals(fin) || location.dateFin.before(fin))
                .mapToDouble(value -> value.montantFacture)
                .sum();
    }

    public Boolean addArticle(Article article){
        boolean bool = this.listeArticleLoue.add(article);
        if(bool){
            calculeMontant();
        }

        return bool;
    }

    private void calculeMontant(){
        //TODO
    }

    //-----------------------------
    //          Get & Set
    //-----------------------------


    public double getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(double montantFacture) {
        this.montantFacture = montantFacture;
    }

    public List<Article> getListeArticleLoue() {
        return listeArticleLoue;
    }

    public void setListeArticleLoue(List<Article> listeArticleLoue) {
        this.listeArticleLoue = listeArticleLoue;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return null;
    }

    public void setClient(Client client) {

    }

    public static List<Location> getLocationEnCours() {
        return locationEnCours;
    }

    public static void setLocationEnCours(List<Location> locationEnCours) {
        Location.locationEnCours = locationEnCours;
    }
}
