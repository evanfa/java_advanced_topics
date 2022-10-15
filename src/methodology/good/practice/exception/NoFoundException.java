package methodology.good.practice.exception;

public class NoFoundException extends Exception{
    public NoFoundException(){
    }

    public NoFoundException(String message) {
        super(message);
    }

    public NoFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFoundException(Throwable cause) {
        super(cause);
    }

}
