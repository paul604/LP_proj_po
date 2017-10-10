package fr.nicoPaul;

import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;
import fr.nicoPaul.save.Sauvegarde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static List<Client> clients;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String ... arg){
        clients = new ArrayList<>();
        System.out.println(
                "                                                   .,-:;//;:=,\n" +
                "                                               . :H@@@MM@M#H/.,+%;,\n" +
                "                                            ,/X+ +M@@M@MM%=,-%HMMM@X/,\n" +
                "                                          -+@MM; $M@@MH+-,;XMMMM@MMMM@+-\n" +
                "                                         ;@M@@M- XM@X;. -+XXXXXHHH@M@M#@/.\n" +
                "                                       ,%MM@@MH ,@%=            .---=-=:=,.\n" +
                "                                       =@#@@@MX .,              -%HX$$%%%+;\n" +
                "                                      =-./@M@M$                  .;@MMMM@MM:\n" +
                "                                      X@/ -$MM/                    .+MM@@@M$\n" +
                "                                     ,@M@H: :@:                    . =X#@@@@-\n" +
                "                                     ,@@@MMX, .                    /H- ;@M@M=\n" +
                "                                     .H@@@@M@+,                    %MM+..%#$.\n" +
                "                                      /MMMM@MMH/.                  XM@MH; =;\n" +
                "                                       /%+%$XHH@$=              , .H@@@@MX,\n" +
                "                                        .=--------.           -%H.,@@@@@MX,\n" +
                "                                        .%MM@@@HHHXX$$$%+= .:$MMX =M@@MM%.\n" +
                "                                          =XMMM@MM@MM#H;,-+HMM@M+ /MMMX=\n" +
                "                                            =%@M@M#@$-.=$@MM@@@M; %M%=\n" +
                "                                              ,:+$+-,/H#MMMMMMM@= =,\n" +
                "                                                    =++%%%%+/:-.\n\n"+
                "  _                 _   _               __  __       _            _      _   __  __          _ _           _ \n" +
                " | | ___   ___ __ _| |_(_) ___  _ __   |  \\/  | __ _| |_ ___ _ __(_) ___| | |  \\/  | ___  __| (_) ___ __ _| |\n" +
                " | |/ _ \\ / __/ _` | __| |/ _ \\| '_ \\  | |\\/| |/ _` | __/ _ \\ '__| |/ _ \\ | | |\\/| |/ _ \\/ _` | |/ __/ _` | |\n" +
                " | | (_) | (_| (_| | |_| | (_) | | | | | |  | | (_| | ||  __/ |  | |  __/ | | |  | |  __/ (_| | | (_| (_| | |\n" +
                " |_|\\___/ \\___\\__,_|\\__|_|\\___/|_| |_| |_|  |_|\\__,_|\\__\\___|_|  |_|\\___|_| |_|  |_|\\___|\\__,_|_|\\___\\__,_|_|\n" +
                "                                        _                 _ _                         \n" +
                "                                       | | ___   __ _  __| (_)_ __   __ _             \n" +
                "                                       | |/ _ \\ / _` |/ _` | | '_ \\ / _` |            \n" +
                "                                       | | (_) | (_| | (_| | | | | | (_| |  _   _   _ \n" +
                "                                       |_|\\___/ \\__,_|\\__,_|_|_| |_|\\__, | (_) (_) (_)\n" +
                "                                                                    |___/             \n");
        start();
//        Client client = new Client("nom", "prenom", "addr", "42", "@");
//        clients.add(client);
        System.out.println(clients);
        boolean run = true;
        while (run){
            System.out.println(
                    "---------- choix ----------\n"+
                    "   0 => end\n"+
                    "   1 => Ajouter un client\n"+
                    "   2 => save");
            int choix = getIntInput("");
            switch (choix){
                case 0:
                    run=false;
                    break;
                case 1:
                    addClient();
                    break;
                case 2:
                    Sauvegarde.sauvegarderClient(clients.toArray(new Client[0]));
                    break;
                default:
                    System.out.println(choix+": commande not found");
            }
        }
        end();
    }

    private static void start(){
        clients.addAll(Sauvegarde.recupDonneeClient());
        clients.forEach(
                client -> client.getLocations().forEach(
                        location -> Location.getLocationEnCours().add(location)
                )
        );
    }

    private static void end(){
        Sauvegarde.sauvegarderClient(clients.toArray(new Client[0]));
    }

    private static void addLocation(){

    }

    private static void addClient(){
        System.out.println("---------- Ajouter un client ----------\n * == obligatoire");

        String nom = "";
        while (nom.matches(" *")){
            nom = getStringInput("nom*");
        }

        String prenom = "";
        while (prenom.matches(" *")){
            prenom = getStringInput("prenom*");
        }

        String finalNom = nom;
        String finalPrenom = prenom;
        boolean match = clients.stream().anyMatch(
                client -> client.getNom().equalsIgnoreCase(finalNom)
                        && client.getPrenom().equalsIgnoreCase(finalPrenom)
        );
        if(match){
            System.out.println("un client porte deja ce nom et prenom, voulez vous continuer?");
            boolean ok = false;
            while (!ok) {
                switch (getStringInput("y/n")) {
                    case "y":
                        ok = true;
                        break;
                    case "n":
                        return;
                    default:
                        break;
                }
            }
        }

        String adresse = getStringInput("adresse");

        String nmeroTel = getStringInput("nmeroTel");

        String email = getStringInput("email");

        clients.add(new Client(nom, prenom, adresse, nmeroTel, email));
        System.out.println("client cree.");

    }

    //TODO add diagramme
    private static String getStringInput(String s){
        System.out.print(s.equals("")?
                "-> ":
                s+" -> ");
        return sc.nextLine();
    }

    //TODO add diagramme
    private static int getIntInput(String s){
        System.out.print(s.equals("")?
                "-> ":
                s+" -> ");
        return sc.nextInt();
    }
}
