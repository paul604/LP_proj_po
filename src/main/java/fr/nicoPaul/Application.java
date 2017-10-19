package fr.nicoPaul;

import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;
import fr.nicoPaul.save.Sauvegarde;
import fr.nicoPaul.stocks.*;
import fr.nicoPaul.stocks.comparator.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static List<Client> clients;
    private static List<Article> articles;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String ... arg){
        clients = new ArrayList<>();
        articles = new ArrayList<>();
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
//
//        FauteuilRoulant fauteuilRoulant = new FauteuilRoulant("ref", "m", "modele", 1, 2, 20);
////        articles.add(fauteuilRoulant);
//        FauteuilRoulant fauteuilRoulant2 = new FauteuilRoulant("ref2", "m2", "modele2", 12, 2, 20);
//        articles.add(fauteuilRoulant2);
//        LitMedicalise litMedicalise = new LitMedicalise("ref", "m", "modele", 1, 20, new Dimension(2,1,20));
////        articles.add(litMedicalise);
//
//        Calendar instance = Calendar.getInstance();
//        instance.set(Calendar.MONTH, Calendar.DECEMBER);
//        ArrayList<Article> articles = new ArrayList<>();
//        articles.add(fauteuilRoulant);
//        ArrayList<Article> articles2 = new ArrayList<>();
//        articles2.add(litMedicalise);
//
//        Location location = new Location(articles, Calendar.getInstance(), instance);
//        client.addLocationEnCours(location);
//        Location.addLocationEnCour(location);
//
//        Location location2 = new Location(articles2, Calendar.getInstance(), instance);
//        client.addLocationEnCours(location2);
//        Location.addLocationEnCour(location2);
//
//        clients.add(client);
        System.out.println(clients);
        System.out.println(clients.get(0).getLocationEnCours());
        System.out.println(Application.articles);
        System.out.println(FauteuilRoulant.getNbMax());
        System.out.println(FauteuilRoulant.getNbDispo());

        boolean run = true;
        while (run){
            System.out.println(
                    "---------- choix ----------\n"+
                    "   0 => end\n"+
                    "   1 => Liste des articles\n"+
                    "   2 => Status stocks\n"+
                    "   3 => Liste des locations pour un client\n"+
                    "   4 => Ajouter un client\n"+
                    "   5 => Ajouter Location\n"+
                    "   6 => save");
            int choix = getIntInput("");
            switch (choix){
                case 0:
                    run=false;
                    break;
                case 1:
                    listArticle();
                    break;
                case 2:
                    stocks();
                    break;
                case 3:
                    listLocationClient();
                    break;
                case 4:
                    addClient();
                    break;
                case 5:
                    addLocation();
                    break;
                case 6:
                    Sauvegarde.sauvegarderClient(clients.toArray(new Client[0]));
                    break;
                default:
                    System.out.println(choix+": commande not found");
            }
        }
        end();
    }

    private static void start(){
        articles.addAll(Sauvegarde.recupDonneeStocks());
        articles.forEach(article -> {
            article.addNbDispo();
            article.addNbMax();
        });

        clients.addAll(Sauvegarde.recupDonneeClient());
        clients.forEach(
                client -> {

                    //évite doublon
                    client.getLocationEnCours().forEach(location -> {
                        ArrayList<Article> articleStream = location.getListeArticleLoue().stream().map(article -> {
                            if (articles.contains(article)) {
                                article.supNbDispo();
                                return articles.get(articles.indexOf(article));
                            }
                            return article;
                        }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

                        location.setListeArticleLoue(articleStream);
                    });

                    Location.getLocationEnCours().addAll(client.getLocationEnCours());
                    Location.getLocationFini().addAll(client.getLocationEnCours());
                }
        );
    }

    private static void end(){
        Sauvegarde.sauvegarderStocks(articles.toArray(new Article[0]));
        Sauvegarde.sauvegarderClient(clients.toArray(new Client[0]));
    }

    private static void listLocationClient() {
        System.out.println("---------- Liste des locations pour un client ----------");


        System.out.println("Client =>");
        for ( int i = 0; i < clients.size(); i++) {
            Client clientLocal = clients.get(i);
            System.out.println(i + " => " + clientLocal.getNom()+" "+clientLocal.getPrenom());
        }

        int intInput = getIntInput("");
        if(intInput>=0 && intInput < clients.size()) {
            System.out.println( clients.get(intInput).getLocationEnCours());
        }

    }

    private static void stocks() {
        List<Class<? extends Article>> classes = new ArrayList<>();
        classes.add(FauteuilRoulant.class);
        classes.add(LitMedicalise.class);
        classes.add(MatelasAAir.class);
        classes.add(SouleveMalade.class);
        classes.add(TableAlite.class);

        StringBuilder stringBuilder = new StringBuilder();

        classes.forEach(aClass -> {
            stringBuilder.append(aClass.getSimpleName())
                    .append(": (");
            try {
                Method getNbDispo = aClass.getMethod("getNbDispo");
                int nbDispo = (int) getNbDispo.invoke(aClass);

                Method getNbMax = aClass.getMethod("getNbMax");
                int nbMax = (int) getNbMax.invoke(aClass);

                stringBuilder.append(nbDispo)
                        .append("/")
                        .append(nbMax)
                        .append(" [");

                float nbDispoPourDix =0;
                if(nbMax>0){
                    //use (float) for return float
                    nbDispoPourDix=((float)nbDispo/nbMax)*10;
                }
                for (int i=1; i<=(int)nbDispoPourDix; i++){
                    stringBuilder.append("+");
                }
                for (int j=(int)nbDispoPourDix; j<10; j++){
                    stringBuilder.append("-");
                }
                stringBuilder.append("]");
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }finally {
                stringBuilder.append(")\n");
            }
        });
        System.out.println(stringBuilder);
    }

    private static void addLocation(){
        System.out.println("---------- Ajouter Location ----------\n * == obligatoire");


        System.out.println("Client");
        int i;
        for ( i = 0; i < clients.size(); i++) {
            Client clientLocal = clients.get(i);
            System.out.println(i + " => " + clientLocal.getNom()+" "+clientLocal.getPrenom());
        }
        System.out.println(i + " => new");

        Client client;

        int intInput = getIntInput("");
        if(intInput<0 || intInput >= clients.size()){
            client = addClient();
        }else{
            client = clients.get(intInput);
        }


        System.out.println("Article");
        int j;
        for ( j = 0; j < articles.size(); j++) {
            Article articlesLocal = articles.get(j);
            System.out.println(j + " => " + articlesLocal);
        }

    }

    private static Client addClient(){
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
                        return null;
                    default:
                        break;
                }
            }
        }

        String adresse = getStringInput("adresse");

        String nmeroTel = getStringInput("nmeroTel");

        String email = getStringInput("email");

        Client client = new Client(nom, prenom, adresse, nmeroTel, email);
        clients.add(client);
        System.out.println("client cree.");
        return client;
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
        String s1 = sc.nextLine();
        try {
            return Integer.parseInt(s1);
        }catch (NumberFormatException e){
            return -1;
        }
    }

    //TODO add
    private static void listArticle(){
        boolean run = true;
        while (run){
            System.out.println("--------- listArticle ---------\n"+
                    "   0  => out\n"+
                    "   1  => Type croissant\n"+
                    "   2  => Type decroissant\n"+
                    "   3  => Referance croissant\n"+
                    "   4  => Referance decroissant\n"+
                    "   5  => Marque croissant\n"+
                    "   6  => Marque decroissant\n"+
                    "   7  => Modele croissant\n"+
                    "   8  => Modele decroissant\n"+
                    "   9  => Prix croissant\n"+
                    "   10 => Prix decroissant");
            int choix = getIntInput("");
            switch (choix){
                case 0:
                    run=false;
                    break;
                case 1://TYPE-+
                    articles.sort(new ComparatorType());
                    articles.forEach(System.out::println);
                    break;
                case 2://TYPE+-
                    articles.sort(new ComparatorType().reversed());
                    articles.forEach(System.out::println);
                    break;
                case 3://Referance -+
                    articles.sort(new ComparatorRef());
                    articles.forEach(System.out::println);
                    break;
                case 4://Referance +-
                    articles.sort(new ComparatorRef().reversed());
                    articles.forEach(System.out::println);
                    break;
                case 5://Marque -+
                    articles.sort(new ComparatorMarque());
                    articles.forEach(System.out::println);
                    break;
                case 6://Marque +-
                    articles.sort(new ComparatorMarque().reversed());
                    articles.forEach(System.out::println);
                    break;
                case 7://Modele -+
                    articles.sort(new ComparatorModele());
                    articles.forEach(System.out::println);
                    break;
                case 8://Modele +-
                    articles.sort(new ComparatorModele().reversed());
                    articles.forEach(System.out::println);
                    break;
                case 9://Prix -+
                    articles.sort(new ComparatorPrix());
                    articles.forEach(System.out::println);
                    break;
                case 10://Prix +-
                    articles.sort(new ComparatorPrix().reversed());
                    articles.forEach(System.out::println);
                    break;
                default:
                    System.out.println(choix+": commande not found");
            }
        }

    }
}
