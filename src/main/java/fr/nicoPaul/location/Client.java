package fr.nicoPaul.location;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Client implements java.io.Serializable{

    private static final long serialVersionUID = 6515209283352732717L;

    private String nom;
    private String prenom;
    private String adresse;
    private String nmeroTel;
    private String email;
    private List<Location> locationEnCours;
    private List<Location> locationFini;

    //-----------------------------
    //        Constructeur
    //-----------------------------

    public Client(String nom, String prenom, String adresse, String nmeroTel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nmeroTel = nmeroTel;
        this.email = email;
        this.locationEnCours = new ArrayList<>();
        this.locationFini = new ArrayList<>();
    }

    public Client(String nom, String prenom) {
        this(nom, prenom, null, null, null);
    }

    //-----------------------------
    //          Methodes
    //-----------------------------

    /**
     * ajoute une location à la list des location en cours
     * @param locationEnCours
     * @return true si l'ajout s'est bien passé
     */
    public boolean addLocationEnCours(Location locationEnCours){
        return this.locationEnCours.add(locationEnCours);
    }

    /**
     * suprime une location à la list des location en cours
     * @param locationEnCours
     * @return true si la suppression s'est bien passé
     */
    public boolean delLocationEnCours(Location locationEnCours){
        return this.locationEnCours.remove(locationEnCours);
    }

    /**
     * ajoute une location à la list des location fini
     * @param locationFini
     * @return true si l'ajout s'est bien passé
     */
    public boolean addLocationFini(Location locationFini){
        return this.locationFini.add(locationFini);
    }

    /**
     * suprime une location à la list des location fini
     * @param locationFini
     * @return true si la suppression s'est bien passé
     */
    public boolean delLocationFini(Location locationFini){
        return this.locationFini.remove(locationFini);
    }

    //-----------------------------
    //          Get & Set
    //-----------------------------

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNmeroTel() {
        return nmeroTel;
    }

    public void setNmeroTel(String nmeroTel) {
        this.nmeroTel = nmeroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Location> getLocationEnCours() {
        return locationEnCours;
    }

    public void setLocationEnCours(List<Location> locationEnCours) {
        this.locationEnCours = locationEnCours;
    }

    public List<Location> getLocationFini() {
        return locationFini;
    }

    public void setLocationFini(List<Location> locationFini) {
        this.locationFini = locationFini;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", nmeroTel='").append(nmeroTel).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", locationEnCours=").append(locationEnCours);
        sb.append(", locationFini=").append(locationFini);
        sb.append('}');
        return sb.toString();
    }
}
