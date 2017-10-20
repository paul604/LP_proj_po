package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.Article;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

/**
 *
 */
public class ComparatorRefTest {
    @Test
    public void compare() throws Exception {

        Article article = PowerMockito.mock(Article.class);
        PowerMockito.when(article.getReference()).thenReturn("a");

        Article article2 = PowerMockito.mock(Article.class);
        PowerMockito.when(article2.getReference()).thenReturn("b");

        ComparatorReference comparatorRef = new ComparatorReference();

        assertTrue("compare ref a<b", comparatorRef.compare(article, article2) < 0);
        assertTrue("compare ref a>b", comparatorRef.compare(article2, article) > 0);
        assertTrue("compare ref a=b", comparatorRef.compare(article, article) == 0);
    }

}