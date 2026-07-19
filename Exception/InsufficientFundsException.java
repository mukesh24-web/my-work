package Exception;

// Checked -> Exception (extends)
// Unchecked (runtime) -> RuntimeException

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
        super("Insufficient funds in your account."); // call constructor base class
    }

    public InsufficientFundsException(String message) {
        super(message); // Give parameter to Exception class constructor
    }
}
