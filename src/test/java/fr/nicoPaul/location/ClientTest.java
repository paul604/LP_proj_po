package fr.nicoPaul.location;

import org.junit.*;
import org.powermock.api.easymock.PowerMock;

import java.util.ArrayList;

import static org.junit.Assert.*;


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
        Location location = PowerMock.createMock(Location.class);
        assertEquals("test addLocation()", client.addLocationEnCours(location), true);
    }

    @Test
    public void delLocationEnCours() throws Exception {
        Location location = PowerMock.createMock(Location.class);
        client.addLocationEnCours(location);

        assertEquals("test delLocation() ", client.delLocationEnCours(location), true);
        assertEquals("test delLocation() ", client.delLocationEnCours(location), false);
    }

    @Test
    public void addLocationFini() throws Exception {
        Location location = PowerMock.createMock(Location.class);
        assertEquals("test addLocation()", client.addLocationFini(location), true);
    }

    @Test
    public void delLocationFini() throws Exception {
        Location location = PowerMock.createMock(Location.class);
        client.addLocationFini(location);

        assertEquals("test delLocation() ", client.delLocationFini(location), true);
        assertEquals("test delLocation() ", client.delLocationFini(location), false);
    }

    @Test
    public void getLocationEnCours() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        assertEquals("test getLocations() void", client.getLocationEnCours(), arrayLock);

        Location location = PowerMock.createMock(Location.class);
        client.addLocationEnCours(location);
        arrayLock.add(location);
        assertEquals("test getLocations() noVoid", client.getLocationEnCours(), arrayLock);
    }

    @Test
    public void setLocationEnCours() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMock.createMock(Location.class);
        arrayLock.add(location);

        client.setLocationEnCours(arrayLock);

        assertEquals("test setLocations() ", client.getLocationEnCours(), arrayLock);
    }

    @Test
    public void getLocationFini() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        assertEquals("test getLocations() void", client.getLocationFini(), arrayLock);

        Location location = PowerMock.createMock(Location.class);
        client.addLocationFini(location);
        arrayLock.add(location);
        assertEquals("test getLocations() noVoid", client.getLocationFini(), arrayLock);
    }

    @Test
    public void setLocationFini() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMock.createMock(Location.class);
        arrayLock.add(location);

        client.setLocationFini(arrayLock);

        assertEquals("test setLocations() ", client.getLocationFini(), arrayLock);
    }

}