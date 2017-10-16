package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.FauteuilRoulant;
import fr.nicoPaul.stocks.SouleveMalade;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ComparatorTypeTest {
    @Test
    public void compare() throws Exception {

        FauteuilRoulant fauteuilRoulant = new FauteuilRoulant("", "", "",1.0, 1,1);

        SouleveMalade souleveMalade = new SouleveMalade("", "", "", 1.0,1, 1);

        ComparatorType comparatorType = new ComparatorType();

        System.out.println(souleveMalade.getClass().getSimpleName());

        assertTrue("compare type a<b", comparatorType.compare(fauteuilRoulant, souleveMalade) < 0);
        assertTrue("compare type a>b", comparatorType.compare(souleveMalade, fauteuilRoulant) > 0);
        assertTrue("compare type a=b", comparatorType.compare(fauteuilRoulant, fauteuilRoulant) == 0);
    }

}