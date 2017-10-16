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

        ComparatorRef comparatorRef = new ComparatorRef();

        assertEquals("compare ref a<b",-1, comparatorRef.compare(article, article2));
        assertEquals("compare ref a>b",1, comparatorRef.compare(article2, article));
        assertEquals("compare ref a=b",0, comparatorRef.compare(article, article));
    }

}