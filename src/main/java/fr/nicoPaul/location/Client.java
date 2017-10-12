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

    public boolean addLocationEnCours(Location locationEnCours){
        return this.locationEnCours.add(locationEnCours);
    }

    public boolean delLocationEnCours(Location locationEnCours){
        return this.locationEnCours.remove(locationEnCours);
    }

    public boolean addLocationFini(Location locationFini){
        return this.locationFini.add(locationFini);
    }

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

    // ?? location fini dans this.locations ??
//    public List<Location> locationEnCours(){
//        return Location.getLocationEnCours().stream()
//                .filter(location -> location.client.equals(client))
//                .collect(Collectors.toList());
//    }


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nmeroTel='" + nmeroTel + '\'' +
                ", email='" + email + '\'' +
                ", locationEnCours=" + locationEnCours +
                ", locationFini=" + locationFini +
                '}';
    }
}
