package fr.nicoPaul.save;

import fr.nicoPaul.Application;
import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;

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
    private static String clientSave = "clients.save";
    private static String stocksSave = "stocks.yml";

    static {
        File fileCourant = new File(urlCourante);
        urlCourante=fileCourant.getParent();

        folder=urlCourante+File.separator+folder;
        File fileSave = new File(folder);
        if (!fileSave.exists()){
            fileSave.mkdirs();
        }

        clientSave=folder+clientSave;
        File fileClientSave = new File(clientSave);
        if (!fileClientSave.exists()){
            try {
                fileClientSave.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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

    public static boolean sauvegarderLocation(Location ... locations){
        //inutile car save dans client
        return false;
    }

    //TODO change diagramme
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

    //TODO change diagramme
    public static Map<Client, Location> recupDonneeLocation(){
        //inutile car save dans client
        return null;
    }


}
