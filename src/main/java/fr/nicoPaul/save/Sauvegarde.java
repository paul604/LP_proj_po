package fr.nicoPaul.save;

import fr.nicoPaul.Application;
import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;
import fr.nicoPaul.stocks.Article;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
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
    private static String archives = "archives"+ File.separator;
    private static String urlCourante = Application.class.getProtectionDomain().getCodeSource().getLocation().getFile();
    private static String defaultClientSave = "clients.save";
    private static String defaultStocksSave = "stocks.save";
    private static String clientSave = "";
    private static String stocksSave = "";

    static {
        File fileCourant = new File(urlCourante);
        urlCourante=fileCourant.getParent();

        updateFileSave();
    }

    /**
     * archive une location
     * @param location
     * @return true si l'archivage s'est bien passé
     */
    public static boolean archiveLoc(Location location){
        int y = location.getDateFin().get(Calendar.YEAR);
        int m = location.getDateFin().get(Calendar.MONTH)+1;//+1 car Month débute à 0

        File file = new File(archives+y+m+".loc");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.append(location.toString());
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * sauvegarde les clients
     * @param clients
     * @return true si la sauvegarde s'est bien passé
     */
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

    /**
     * récupère les clients
     * @return la liste des clients
     */
    public static List<Client> recupDonneeClient(){
        List<Client> clients = new ArrayList<>();
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream(clientSave));
            while (true) {
                Object o = input.readObject();
                clients.add((Client) o);
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

    /**
     * sauvegarde les articles
     * @param articles
     * @return true si la sauvegarde s'est bien passé
     */
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

    /**
     * récupère les articles
     * @return la liste des articles
     */
    public static List<Article> recupDonneeStocks(){
        List<Article> articles = new ArrayList<>();
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream(stocksSave));
            while (true) {
                Object o = input.readObject();
                articles.add((Article) o);
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

    /**
     * update les fichiers
     */
    public static void updateFileSave(){
        folder=urlCourante+File.separator+folder;
        File fileSave = new File(folder);
        if (!fileSave.exists()){
            fileSave.mkdirs();
        }

        archives=urlCourante+File.separator+archives;
        File fileArchives = new File(archives);
        if (!fileArchives.exists()){
            fileArchives.mkdirs();
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
