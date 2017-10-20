package fr.nicoPaul.exeption;

/**
 * Created by Paul on 20/10/17.
 */
public class DateException extends Exception {

    public DateException(String message) {
        super(message);
    }

    public DateException() {
        this("date exception");
    }
}
