package employee.exception;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVerisonUID=1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
