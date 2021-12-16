package lab4.doing;

public class ChildCheckingException extends Exception {

    public ChildCheckingException() {
        super();
    }

    public ChildCheckingException(String message) {
        super(message);
    }

    public ChildCheckingException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public ChildCheckingException(Throwable cause) {
        super(cause);
    }
}
