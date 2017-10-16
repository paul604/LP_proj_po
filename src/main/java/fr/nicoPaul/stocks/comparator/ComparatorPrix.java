package fr.nicoPaul.stocks.comparator;

import fr.nicoPaul.stocks.Article;

import java.util.Comparator;

/**
 *
 */
public class ComparatorPrix implements Comparator<Article> {
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
        Double prix1 = o1.getPrix();
        Double prix2 = o2.getPrix();
        return prix1.compareTo(prix2);
    }
}
