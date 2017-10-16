package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.Article;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

/**
 *
 */
public class ComparatorModeleTest {
    @Test
    public void compare() throws Exception {

        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getModele()).thenReturn("a");

        Article article2 = PowerMockito.mock(Article.class);
        PowerMockito.when(article2.getModele()).thenReturn("b");

        ComparatorModele comparatorModele = new ComparatorModele();

        assertEquals("compare modele a<b",-1, comparatorModele.compare(article, article2));
        assertEquals("compare modele a>b",1, comparatorModele.compare(article2, article));
        assertEquals("compare modele a=b",0, comparatorModele.compare(article, article));
    }

}