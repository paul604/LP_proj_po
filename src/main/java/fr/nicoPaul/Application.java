package fr.nicoPaul;

import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;
import fr.nicoPaul.save.Sauvegarde;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

    private static List<Client> clients;

    public static void main(String ... arg){
        clients = new ArrayList<>();

    }

    private static void start(){
        clients = Sauvegarde.recupDonneeClient();

        Map<Client, Location> clientLocationMap = Sauvegarde.recupDonneeLocation();
        clientLocationMap.forEach(Client::addLocation);
    }

    private static void end(){
        clients.forEach(client -> {
            Sauvegarde.sauvegarderClient(client);
            Sauvegarde.sauvegarderLocation(client.getLocations().toArray(new Location[0]));
        });
    }

    private static void addLocation(){

    }

    private static void addClient(){

    }
}
