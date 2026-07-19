package Exception;

// primary exception
public class AccountException extends Exception{

    public AccountException(Exception cause) {
        super(cause); // call exception class constructor
    }

}
