package fr.nicoPaul.location;

import com.sun.org.apache.xpath.internal.operations.Bool;
import fr.nicoPaul.stocks.Article;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
     * @param client
     */
    public Location(List<Article> listeArticleLoue, Date dateDebut, Date dateFin, Client client) {
        this.listeArticleLoue = listeArticleLoue;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        //TODO
    }

    public Location(Date dateDebut, Date dateFin, Client client) {
        this.listeArticleLoue = new ArrayList<>();
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        //TODO
    }

    //-----------------------------
    //          Methodes
    //-----------------------------

    public static List<Location> enCours(Client client){
        return locationEnCours.stream()
                .filter(location -> location.client.equals(client))
                .collect(Collectors.toList());
    }

    public static double recette(Date debut, Date fin){
        return locationEnCours.stream()
                .filter(location -> location.dateDebut.equals(debut) || location.dateDebut.after(debut))
                .filter(location -> location.dateFin.equals(fin) || location.dateFin.before(fin))
                .mapToDouble(value -> value.montantFacture)
                .sum();
    }

    public Boolean addArticle(Article article){
        return this.listeArticleLoue.add(article);
    }

    private void calculeMontant(){
        //TODO
    }

}
