package exceptions;

public class LoginPageNoSuchElementException extends Exception{
    public String id;
    public LoginPageNoSuchElementException(String message) {
//        super(message);
        this.id= message;

    }
}
