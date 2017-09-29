package fr.nicoPaul.location;

import org.junit.*;
import org.powermock.api.easymock.PowerMock;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Paul on 29/09/17.
 */
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
    public void getNom() throws Exception {
        assertEquals("test getNom()", client.getNom(), nom);
    }

    @Test
    public void setNom() throws Exception {
        client.setNom("nom2");
        assertEquals("test setNom()", client.getNom(), "nom2");
    }

    @Test
    public void getPrenom() throws Exception {
        assertEquals("test getPrenom()", client.getPrenom(), prenom);
    }

    @Test
    public void setPrenom() throws Exception {
        client.setPrenom("prenom2");
        assertEquals("test setPrenom()", client.getPrenom(), "prenom2");
    }

    @Test
    public void getAdresse() throws Exception {
        assertEquals("test getAdresse()", client.getAdresse(), addr);
    }

    @Test
    public void setAdresse() throws Exception {
        client.setAdresse("addr2");
        assertEquals("test setAdresse()", client.getAdresse(), "addr2");
    }

    @Test
    public void getNmeroTel() throws Exception {
        assertEquals("test getNmeroTel()", client.getNmeroTel(), tel);
    }

    @Test
    public void setNmeroTel() throws Exception {
        client.setNmeroTel("num2");
        assertEquals("test setNmeroTel()", client.getNmeroTel(), "num2");
    }

    @Test
    public void getEmail() throws Exception {
        assertEquals("test getEmail()", client.getEmail(), email);
    }

    @Test
    public void setEmail() throws Exception {
        client.setEmail("email2");
        assertEquals("test setEmail()", client.getEmail(), "email2");
    }

    @Test
    public void getLocations() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        assertEquals("test getLocations() void", client.getLocations(), arrayLock);

        Location location = PowerMock.createMock(Location.class);
        client.addLocation(location);
        arrayLock.add(location);
        assertEquals("test getLocations() noVoid", client.getLocations(), arrayLock);
    }

    @Test
    public void setLocations() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMock.createMock(Location.class);
        arrayLock.add(location);

        client.setLocations(arrayLock);

        assertEquals("test setLocations() ", client.getLocations(), arrayLock);
    }

    @Test
    public void addLocation() throws Exception {
        Location location = PowerMock.createMock(Location.class);
        assertEquals("test addLocation()", client.addLocation(location), true);
    }


    @Test
    public void delLocation() throws Exception {
        ArrayList<Location> arrayLock = new ArrayList<>();
        Location location = PowerMock.createMock(Location.class);
        arrayLock.add(location);
        client.setLocations(arrayLock);

        assertEquals("test delLocation() ", client.delLocation(location), true);
    }

}