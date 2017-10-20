package fr.nicoPaul.exeption;

/**
 *
 * @author Paul Nicolas
 * @since 1.0.0
 * @version 1.0.0
 */
public class DateException extends Exception {

    public DateException(String message) {
        super(message);
    }

    public DateException() {
        this("date exception");
    }
}
