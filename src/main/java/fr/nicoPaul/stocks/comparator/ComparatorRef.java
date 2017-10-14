/*
 * La class ComparatorRef de paul est mis à disposition selon les termes de la
 * licence Creative Commons Attribution - Pas d’Utilisation Commerciale - Partage dans les Mêmes Conditions 4.0 International.
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.Article;

import java.util.Comparator;

/**
 * <a href="http://creativecommons.org/licenses/by-nc-sa/4.0/">
 * <img alt="Licence Creative Commons" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png">
 * </a>
 * <br>La class ComparatorRef de paul est mis à disposition selon les termes de la <a href="http://creativecommons.org/licenses/by-nc-sa/4.0/">
 * licence Creative Commons Attribution - Pas d’Utilisation Commerciale - Partage dans les Mêmes Conditions 4.0 International</a>.
 * <br>
 *
 * @author PAUL
 */
public class ComparatorRef implements Comparator<Article> {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     *
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     *
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     */
    @Override
    public int compare(Article o1, Article o2) {
        return o1.getReference().compareTo(o2.getReference());
    }
}
