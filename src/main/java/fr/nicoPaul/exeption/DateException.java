package fr.nicoPaul.exeption;

/**
 *
 */
public class DateException extends Exception {

    public DateException(String message) {
        super(message);
    }

    public DateException() {
        this("date exception");
    }
}
