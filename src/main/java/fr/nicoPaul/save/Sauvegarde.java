package fr.nicoPaul.save;

import fr.nicoPaul.Application;
import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;
import fr.nicoPaul.stocks.Article;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Classe Sauvegarde
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class Sauvegarde {

    private static String folder = "save"+ File.separator;
    private static String urlCourante = Application.class.getProtectionDomain().getCodeSource().getLocation().getFile();
    private static String defaultClientSave = "clients.save";
    private static String defaultStocksSave = "stocks.save";
    private static String clientSave = "";
    private static String stocksSave = "";

    static {
        File fileCourant = new File(urlCourante);
        urlCourante=fileCourant.getParent();

        upAll();
    }

    public static boolean archiveLoc(Location location){
        return false;
    }

    public static boolean sauvegarderClient(Client... clients){
        ObjectOutputStream output=null;
        boolean ok = true;
        try {
            output = new ObjectOutputStream(new FileOutputStream(clientSave));
            for (Client client : clients) {
                output.writeObject(client);
                //Vide le tempon
                output.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            ok = false;
        }finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return ok;
    }


    public static List<Client> recupDonneeClient(){
        List<Client> clients = new ArrayList<>();
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream(clientSave));
            while (true) {
                clients.add((Client) input.readObject());
            }
        } catch (EOFException e){
            //end of file => no pb
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return clients;
    }

    public static Map<Client, Location> recupDonneeLocation(){
        //inutile car save dans client
        return null;
    }
    // TODO add
    public static boolean sauvegarderStocks(Article... articles){
        ObjectOutputStream output=null;
        boolean ok = true;
        try {
            output = new ObjectOutputStream(new FileOutputStream(stocksSave));
            for (Article article : articles) {
                output.writeObject(article);
                //Vide le tempon
                output.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            ok = false;
        }finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return ok;
    }
    // TODO add
    public static List<Article> recupDonneeStocks(){
        List<Article> articles = new ArrayList<>();
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream(stocksSave));
            while (true) {
                articles.add((Article) input.readObject());
            }
        } catch (EOFException e){
            //end of file => no pb
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return articles;
    }
    // TODO add
    public static void upAll(){
        folder=urlCourante+File.separator+folder;
        File fileSave = new File(folder);
        if (!fileSave.exists()){
            fileSave.mkdirs();
        }


        clientSave=folder+defaultClientSave;
        File fileClientSave = new File(clientSave);
        if (!fileClientSave.exists()){
            try {
                fileClientSave.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        stocksSave=folder+defaultStocksSave;
        File fileStocksSave = new File(stocksSave);
        if (!fileStocksSave.exists()){
            try {
                fileStocksSave.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
