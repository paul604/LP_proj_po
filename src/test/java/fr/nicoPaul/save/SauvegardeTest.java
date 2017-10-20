package fr.nicoPaul.save;

import fr.nicoPaul.location.Client;
import fr.nicoPaul.stocks.Article;
import fr.nicoPaul.stocks.FauteuilRoulant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class SauvegardeTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("===== test Sauvegarde =====");

        Field folder = Sauvegarde.class.getDeclaredField("folder");
        folder.setAccessible(true);

        folder.set(null, "saveTest"+ File.separator);

        Sauvegarde.updateFileSave();

    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("===== FIN test Sauvegarde =====");
    }

    @After
    public void after() throws Exception {
        Field clientSave = Sauvegarde.class.getDeclaredField("clientSave");
        clientSave.setAccessible(true);
        Field stocksSave = Sauvegarde.class.getDeclaredField("stocksSave");
        stocksSave.setAccessible(true);

        String stringClientSave = (String) clientSave.get(null);
        String stringStocksSave = (String) stocksSave.get(null);

        File fileClient = new File(stringClientSave);
        fileClient.delete();
        fileClient.createNewFile();

        File fileStocks = new File(stringStocksSave);
        fileStocks.delete();
        fileStocks.createNewFile();

    }

    @Test
    public void archiveLoc() throws Exception {
        //TODO
    }

    @Test
    public void sauvegarderClient1() throws Exception {
        Client client = PowerMockito.mock(Client.class);
        assertTrue("sauvegarder 1 client", Sauvegarde.sauvegarderClient(client));
    }

    @Test
    public void sauvegarderClient2() throws Exception {
        Client client = PowerMockito.mock(Client.class);
        assertTrue("sauvegarder 2 client", Sauvegarde.sauvegarderClient(client, client));
    }

    @Test
    public void sauvegarderClientVoid() throws Exception {
        assertTrue("sauvegarder 0 client", Sauvegarde.sauvegarderClient());
    }

    @Test
    public void recupDonneeClientVoid() throws Exception {
        assertEquals("recup donnee client void", new ArrayList(),
                Sauvegarde.recupDonneeClient());
    }

    @Test
    public void recupDonneeClientNoVoid() throws Exception {
        Client client = new Client("1", "1", "1", "1", "1");

        Client client2 = new Client("2", "2", "2", "2", "2");

        ArrayList<Client> arrayListClient = new ArrayList<>();
        arrayListClient.add(client);
        arrayListClient.add(client2);

        Sauvegarde.sauvegarderClient(client, client2);

        assertEquals("recup donnee client no void", arrayListClient.toString(),
                Sauvegarde.recupDonneeClient().toString());
    }

    @Test
    public void sauvegarderStocks1() throws Exception {
        Article article = PowerMockito.mock(Article.class);
        assertTrue("sauvegarder 1 article", Sauvegarde.sauvegarderStocks(article));
    }

    @Test
    public void sauvegarderStocks2() throws Exception {
        Article article = PowerMockito.mock(Article.class);
        assertTrue("sauvegarder 2 article", Sauvegarde.sauvegarderStocks(article, article));
    }

    @Test
    public void sauvegarderStocksVoid() throws Exception {
        assertTrue("sauvegarder 0 article", Sauvegarde.sauvegarderStocks());
    }

    @Test
    public void recupDonneeStocksVoid() throws Exception {
        assertEquals("recup donnee article void", new ArrayList(),
                Sauvegarde.recupDonneeStocks());
    }

    @Test
    public void recupDonneeStocksNoVoid() throws Exception {
        FauteuilRoulant fauteuilRoulant = new FauteuilRoulant("1", "1", "1", 0,0,0);

        FauteuilRoulant fauteuilRoulant2 = new FauteuilRoulant("2", "2", "2", 0,0,0);

        ArrayList<Article> arrayListArticle = new ArrayList<>();
        arrayListArticle.add(fauteuilRoulant);
        arrayListArticle.add(fauteuilRoulant2);

        Sauvegarde.sauvegarderStocks(fauteuilRoulant, fauteuilRoulant2);

        assertEquals("recup donnee article no void", arrayListArticle,
                Sauvegarde.recupDonneeStocks());
    }

}