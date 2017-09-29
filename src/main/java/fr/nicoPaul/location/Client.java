package fr.nicoPaul.location;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private String nmeroTel;
    private String email;
    private List<Location> locations;

    //-----------------------------
    //        Constructeur
    //-----------------------------

    public Client(String nom, String prenom, String adresse, String nmeroTel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nmeroTel = nmeroTel;
        this.email = email;
        this.locations = new ArrayList<>();
    }

    public Client(String nom, String prenom) {
        this(nom, prenom, null, null, null);
    }

    //-----------------------------
    //          Methodes
    //-----------------------------

    public boolean addLocation(Location location){
        return this.locations.add(location);
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

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
