package fr.nicoPaul.location;

import fr.nicoPaul.stocks.Article;
import org.junit.*;
import org.powermock.api.mockito.PowerMockito;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.*;

/**
 *
 */
public class LocationTest {

    private Location location = null;
    private Location location1 = null;

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("===== test Location =====");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("===== FIN test Location =====");
    }

    @Before
    public void before(){
        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getPrix()).thenReturn(1.0);
        Article article2 = PowerMockito.mock(Article.class);
        PowerMockito.when(article2.getPrix()).thenReturn(1.0);

        List<Article> articles = new ArrayList<>();
        articles.add(article);
        articles.add(article2);

        location= new Location(articles, Calendar.getInstance(), Calendar.getInstance());

        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.DAY_OF_MONTH, instance.get(Calendar.DAY_OF_MONTH)+1);
        location1= new Location(articles, Calendar.getInstance(), instance);

        Location.addLocationEnCour(location);
        Location.addLocationEnCour(location1);
    }

    @After
    public void after(){
        Location.delLocationEnCours(location);
        Location.delLocationEnCours(location1);
    }

    @Test
    public void montantForLocation(){
        assertEquals("montant 1 jour", 2.0, location.getMontantFacture(), 0);
    }

    @Test
    public void montantForLocation1(){
        assertEquals("montant 2 jour", 4.0, location1.getMontantFacture(), 0);
    }

    @Test
    public void recette() throws Exception {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.DAY_OF_MONTH, instance.get(Calendar.DAY_OF_MONTH)+1);
        assertEquals("recette", 6.0, Location.recette(Calendar.getInstance(), instance), 0);
    }

    @Test
    public void addArticle() throws Exception {
        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getPrix()).thenReturn(1.0);
        Boolean aBoolean = location.addArticle(article);
        assertEquals("addArticle bool", true, aBoolean);

    }

    @Test
    public void addArticleTestMontant() throws Exception {
        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getPrix()).thenReturn(1.0);
        location.addArticle(article);
        assertEquals("addArticle test montant", 3.0, location.getMontantFacture(), 0);

    }

}