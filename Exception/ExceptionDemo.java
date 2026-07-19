package Exception;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {

    public static void normalCatchException() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) { // ex is object of filenotfoundexception
            // System.out.println("File not exist");
            System.out.println(ex.getMessage()); // print prebuild expression
        }
    }

    public static void catchingMultipleException() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse(""); // date format object
        } // one of the catch block will be executed
        catch (FileNotFoundException ex) {
            System.out.println("File doesn't exist."); // generic error message
            ex.printStackTrace(); // reverse
        }
        catch (IOException ex) {
            System.out.println("Could not read data");
            ex.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void catchingMultipleExceptionUsingOR() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse(""); // date format object
        }
        catch (IOException | ParseException ex) {
            System.out.println("Could not read data");
            ex.printStackTrace();
        }
    }

    public static void finallyException() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();

        } catch (IOException ex) { // ex is object of filenotfoundexception
            // System.out.println("File not exist");
            System.out.println(ex.getMessage());
        } // finally block always execute
        finally { // In this block we can release external resources like fileHandles, DBConnection, Network Connection
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void try_With_Resources() {
        // try have one or more resources
        // no need to explicitly close this resource
        // add final block & it will automatically close the resource
        try (   var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ) {
            System.out.println("File opened");
        } catch (IOException e) { // e is object of filenotfoundexception
            System.out.println(e.getMessage());
        }
    }

    // throw exception - defencive programming
    // use these validation while get input from system / user
    // use in the necessary place
    public static void deposit(float value) throws IOException{
//        if(value <= 0)
//            throw new IllegalArgumentException(); // runtime exception
        if(value <= 0)
            throw new IOException(); // checked exception
        // it will show error so add deposit(float value) throws IOException
        // in this method - this throw IOException also
    }

    private static float balance;
    public static void withdraw(float value) throws AccountException{
        if(value > balance) {
            // Creating an exception
            // var accountException = new AccountException();
            // Setting the cause of the exception
            // accountException.initCause(new InsufficientFundsException());
            // throw accountException;

            // wrap the object inside a general exception
            throw new AccountException(new InsufficientFundsException());
            // AccountException - general exception , InsufficientFundsException - root cause
        }
    }

    public static void show() throws IOException{
        try {
            deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            // e.printStackTrace();
            throw e; // add this throws IOException in this method
        }
    }



    static void main(String args[]) throws IOException { // wrapping
        // exception is an object contain info of error

        // object instance of exception class
        // show the error in reverse order - stack trace
        // check for exceptional handler

        // type of exception
        // checked - give a good text for particular error - check at compile time
        // unchecked - Runtime exception - NullPointer, Arithmetic
        // error - stack overflow

        //                  Throwable
        // Exception - checked          Error
        // unchecked - runtimeException

        // deposit(-1);

        /*
        try {
            show();
        } catch (Throwable e) { // Throwwable is parent of all exception
            System.out.println("An unexcepted error"); // genric error message
        }
        */

        // custom exception
        /*
        try {
            withdraw(10);
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        */

        // Channing exception - Wrapping exception
        try {
            withdraw(10);
        } catch(AccountException e) {
            // System.out.println(e.getMessage()); // print message
            // e.printStackTrace();
            System.out.println(e.getCause());
        }

    }
}
