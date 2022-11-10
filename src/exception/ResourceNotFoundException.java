package exception;

public class ResourceNotFoundException extends GeneralException{
    @Override
    public String getCode() { return "0001"; }

    @Override
    public String getTitle() {
        return "Error en encontrar un cliente";
    }

    @Override
    public String getContent() {
        return "Error en encontrar un cliente";
    }
}
