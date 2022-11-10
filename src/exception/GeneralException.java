package exception;

public abstract class GeneralException extends RuntimeException {

    public abstract String getCode();

    public abstract String getTitle();

    public abstract String getContent();
}