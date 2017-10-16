package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.Article;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

/**
 *
 */
public class ComparatorPrixTest {
    @Test
    public void compare() throws Exception {

        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getPrix()).thenReturn(1.0);

        Article article2 = PowerMockito.mock(Article.class);
        PowerMockito.when(article2.getPrix()).thenReturn(2.0);

        ComparatorPrix comparatorPrix = new ComparatorPrix();

        assertEquals("compare marque",-1, comparatorPrix.compare(article, article2));
        assertEquals("compare marque",1, comparatorPrix.compare(article2, article));
        assertEquals("compare marque",0, comparatorPrix.compare(article, article));
    }

}