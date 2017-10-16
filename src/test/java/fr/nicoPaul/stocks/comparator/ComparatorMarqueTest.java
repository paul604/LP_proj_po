package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.Article;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

/**
 *
 */
public class ComparatorMarqueTest {

    @Test
    public void compare() throws Exception {
        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getMarque()).thenReturn("a");

        Article article2 = PowerMockito.mock(Article.class);
        PowerMockito.when(article2.getMarque()).thenReturn("b");

        ComparatorMarque comparatorMarque = new ComparatorMarque();

        assertTrue("compare marque", comparatorMarque.compare(article, article2) < 0);
        assertTrue("compare marque", comparatorMarque.compare(article2, article) > 0);
        assertTrue("compare marque", comparatorMarque.compare(article, article) == 0);
    }

}