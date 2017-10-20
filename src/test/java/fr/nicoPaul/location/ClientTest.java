package fr.nicoPaul.location;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ClientTest {

    private final String nom = "nom1";
    private final String prenom = "prenom1";
    private final String addr = "addr1";
    private final String tel="0123456789";
    private final String email = "email1";
    private Client client;

    public ClientTest() {
        client= new Client(nom, prenom, addr, tel, email);
    }

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("===== test Client =====");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("===== FIN test Client =====");
    }

    @Test
    public void addLocationEnCours() throws Exception {
        Location location = PowerMockito.mock(Location.class);
        assertTrue("test addLocation()", client.addLocationEnCours(location));
    }

    @Test
    public void delLocationEnCoursReturnTrue() throws Exception {
        Location location = PowerMockito.mock(Location.class);
        client.addLocationEnCours(location);

        assertTrue("test delLocation() ", client.delLocationEnCours(location));
    }

    @Test
    public void delLocationEnCoursReturnFalse() throws Exception {
        Location location = PowerMockito.mock(Location.class);
        assertFalse("test delLocation() ", client.delLocationEnCours(location));
    }

    @Test
    public void addLocationFini() throws Exception {
        Location location = PowerMockito.mock(Location.class);
        assertTrue("test addLocation()", client.addLocationFini(location));
    }

    @Test
    public void delLocationFiniReturnTrue() throws Exception {
        Location location = PowerMockito.mock(Location.class);
        client.addLocationFini(location);

        assertTrue("test delLocation() ", client.delLocationFini(location));
    }

    @Test
    public void delLocationFiniReturnFalse() throws Exception {
        Location location = PowerMockito.mock(Location.class);
        assertFalse("test delLocation() ", client.delLocationFini(location));
    }

    @Test
    public void getLocationEnCoursVoid() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        assertEquals("test getLocations() void", arrayLock, client.getLocationEnCours());
    }

    @Test
    public void getLocationEnCoursNoVoid() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMockito.mock(Location.class);
        client.addLocationEnCours(location);
        arrayLock.add(location);
        assertEquals("test getLocations() noVoid", arrayLock, client.getLocationEnCours());
    }

    @Test
    public void setLocationEnCours() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMockito.mock(Location.class);
        arrayLock.add(location);

        client.setLocationEnCours(arrayLock);

        assertEquals("test setLocations() ", arrayLock, client.getLocationEnCours());
    }

    @Test
    public void getLocationFiniVoid() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        assertEquals("test getLocations() void", arrayLock, client.getLocationFini());
    }

    @Test
    public void getLocationFiniNoVoid() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMockito.mock(Location.class);
        client.addLocationFini(location);
        arrayLock.add(location);
        assertEquals("test getLocations() noVoid", arrayLock, client.getLocationFini());
    }

    @Test
    public void setLocationFini() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMockito.mock(Location.class);
        arrayLock.add(location);

        client.setLocationFini(arrayLock);

        assertEquals("test setLocations() ", arrayLock, client.getLocationFini());
    }

}