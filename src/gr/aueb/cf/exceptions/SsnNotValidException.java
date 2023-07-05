package gr.aueb.cf.exceptions;

public class SsnNotValidException extends Exception {

    final static long serialVersionUID = 1L;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + " is not valid");
    }
}
