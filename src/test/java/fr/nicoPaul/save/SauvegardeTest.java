package fr.nicoPaul.save;

import fr.nicoPaul.location.Client;
import fr.nicoPaul.location.Location;
import fr.nicoPaul.stocks.Article;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

/**
 *
 */
public class SauvegardeTest {

    @BeforeClass
    public static void setUp() throws Exception {
        Field folder = Sauvegarde.class.getDeclaredField("folder");
        folder.setAccessible(true);

        folder.set(null, "saveTest"+ File.separator);

        Sauvegarde.upAll();

    }

    @Test
    public void sauvegarderClient() throws Exception {
        Client client = PowerMockito.mock(Client.class);
        assertEquals("sauvegarder 1 client", true,
                Sauvegarde.sauvegarderClient(client));

        assertEquals("sauvegarder 2 client", true,
                Sauvegarde.sauvegarderClient(client, client));
    }

    @Test
    public void sauvegarderLocation() throws Exception {
    }

    @Test
    public void recupDonneeClient() throws Exception {
    }

    @Test
    public void recupDonneeLocation() throws Exception {
    }

    @Test
    public void sauvegarderStocks() throws Exception {
    }

    @Test
    public void recupDonneeStocks() throws Exception {
    }

}