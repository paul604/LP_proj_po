package fr.nicoPaul.location;

import fr.nicoPaul.stocks.Article;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
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
public class Location implements java.io.Serializable{

    private static final long serialVersionUID = 9098703470456555011L;

    private double montantFacture;
    private List<Article> listeArticleLoue;
    private Calendar dateDebut;
    private Calendar dateFin;

    // transient => non serializable
    private transient static List<Location> locationEnCours = new ArrayList<>();
    private transient static List<Location> locationFini = new ArrayList<>();

    //-----------------------------
    //        Constructeur
    //-----------------------------

    /**
     * Main constructeur
     * @param listeArticleLoue
     * @param dateDebut
     * @param dateFin
     */
    public Location(List<Article> listeArticleLoue, Calendar dateDebut, Calendar dateFin) {
        this.listeArticleLoue = listeArticleLoue;
        this.dateDebut = resetTime(dateDebut);
        this.dateFin = resetTime(dateFin);
        this.calculeMontant();
    }

    public Location(Calendar dateDebut, Calendar dateFin) {
        this.listeArticleLoue = new ArrayList<>();
        this.dateDebut = resetTime(dateDebut);
        this.dateFin = resetTime(dateFin);
        this.montantFacture=0;
    }

    //-----------------------------
    //          Methodes
    //-----------------------------

    public static double recette(Calendar debut, Calendar fin){

        ArrayList<Location> locations = new ArrayList<>();
        locations.addAll(locationEnCours);
        locations.addAll(locationFini);

        Calendar finalDebut = resetTime(debut);
        Calendar finalFin = resetTime(fin);
        return locations.stream()
                .filter(location -> location.dateDebut.equals(finalDebut) || location.dateDebut.after(finalDebut))
                .filter(location -> location.dateFin.equals(finalFin) || location.dateFin.before(finalFin))
                .mapToDouble(value -> value.montantFacture)
                .sum();
    }

    public Boolean addArticle(Article article){
        article.supNbDispo();
        boolean bool = this.listeArticleLoue.add(article);
        if(bool){
            calculeMontant();
        }

        return bool;
    }

    private void calculeMontant(){
        long nbJour = this.nbJour();
        this.montantFacture = this.listeArticleLoue.stream()
                .mapToDouble(article -> article.getPrix()*nbJour)
                .sum();
    }

    private long nbJour(){

        LocalDate localDateDebut = LocalDate.of(dateDebut.get(Calendar.YEAR), dateDebut.get(Calendar.MONTH)+1, dateDebut.get(Calendar.DAY_OF_MONTH));
        LocalDate localDateFin = LocalDate.of(dateFin.get(Calendar.YEAR), dateFin.get(Calendar.MONTH)+1, dateFin.get(Calendar.DAY_OF_MONTH));

        return ChronoUnit.DAYS.between(localDateDebut, localDateFin)+1; // Nombre exact de jours entre les deux indicateurs temporels.
    }

    private static Calendar resetTime(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
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

    public Calendar getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Calendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    public static List<Location> getLocationEnCours() {
        return locationEnCours;
    }

    public static void setLocationEnCours(List<Location> locationEnCours) {
        Location.locationEnCours = locationEnCours;
    }

    public static List<Location> getLocationFini() {
        return locationFini;
    }

    public static void setLocationFini(List<Location> locationFini) {
        Location.locationFini = locationFini;
    }

    public static boolean addLocationEnCour(Location location){
        return locationEnCours.add(location);
    }

    public static boolean delLocationEnCours(Location location){
        return locationEnCours.remove(location);
    }

    public static boolean addLocationfini(Location location){
        return locationFini.add(location);
    }

    public static boolean delLocationFini(Location location){
        return locationFini.remove(location);
    }

    @Override
    public String toString() {
        return "Location{" +
                "montantFacture=" + montantFacture +
                ", listeArticleLoue=" + listeArticleLoue +
                ", dateDebut=" + dateDebut.getTime() +
                ", dateFin=" + dateFin.getTime() +
                '}';
    }
}
