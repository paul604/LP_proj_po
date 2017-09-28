package fr.nicoPaul.location;

/**
 * Created by Paul on 18/09/17.
 */
public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private String nmeroTel;
    private String email;

    public Client(String nom, String prenom, String adresse, String nmeroTel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.nmeroTel = nmeroTel;
        this.email = email;
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
