package com.Google;

public class Fundamentals {
    static void main(String[] args) {
        // type identifier assign operator value;
        // initialize a value
        /*
        int myAge = 20, temperature = 30;
        myAge = 50;
        int herAge = myAge;
        System.out.println(myAge);
        System.out.println("Hello World");
        System.out.println(temperature);
        */

        // primitive - for storing simple values
        // reserved key words
        // byte ,bytes-1,range(-128,127)
        // short ,2, range(-32k,32k)
        // int ,4,[-2B,2B]
        // long, 8,[]
        // float ,4,[]
        // double ,8,[]
        // char, 2, A,B,C...
        // boolean, 1, true / false
        /*
        byte age = 20;
        int viewsCount = 2_123_456_789; // 123,456,789
        long v1 = 3_123_456_789L; // l or L
        float price = 10.99f; // f or F
        double p1 = 10.999999;
        char letter = 'A'; // use single quotes for single character
        boolean isEligible = false;
        */
        /*
        // value will be store in memory location
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // y doesn't affected
        */
        // Reference - for storing complex objects
        // awt class
        // variable hold the address of the object in reference
        // Point point1 = new Point(1,1);
        // point1 will be store on different memory location.
        // point1 will hold Point(1,1) memory address.
        // Point(1,1) object will store on different memory address.
        // point1.x = 2;
        // point2 store the address of object
        // Point point2 = point1;
        // System.out.println(point2);
        // reference type copied by reference
        // primitive type copied by value and the values are completely independent to each other

        /*
        // string - no need for import
        // String redundant
        String message01 = new String("Hello world");
        // best way to initialize
        String message = " Hello Bombi" + "!! ";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        // search for letter,word,sentence
        System.out.println(message.indexOf('H')); // return index
        System.out.println(message.replace("!","*"));
        // anything that modify a string will return the new String object
        System.out.println(message); // string are immutable
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // remove the unnecessary white space in front or back of a string
        // user enter a word
        */

        /*
        // backslash used as a escape sequence
        String message = "Hello \"Mukesh\"";
        String message01 = "mortgage:\\Windows\\..";
        String message02 = "mortgage:\nWindows\\..";
        String message03 = "mortgage:\tWindows\\..";
        System.out.println(message);
        */

        // Array
        /*
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // using array class to print the array
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers); // It will print the numbers variable
        // that variable store the address of the starting address
        int[] nums = {2,5,4,5,6,4};
        System.out.println(nums.length);
        Arrays.sort(nums); // to sort a array
        System.out.println(Arrays.toString(nums));
        */

        /*
        // Multi-dimensional array
        // 2D - Matrix
        // 3D - Cube
        int[][] numbers = new int[2][3]; // 2 rows and 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // print the address of the 2d array
        System.out.println(Arrays.deepToString(numbers));

        int[][] Matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(Arrays.deepToString(Matrix));
        // 3D Array
        int[][][] Cube = new int[2][3][5];
        */

        // Constant
        // final float pi = 3.14f; // we can't change the value
        // can't be changed
        // pi = 1; // error

        // arithmetic expression
        /*
        int result = 10/3;
        System.out.println(result);
        double result01 = (double)10/ (double)3;
        System.out.println(result01);
        int x=1;
        // incremental
        ++x; // 2
        x++; // 3
        System.out.println(x);
        int y = x++;
        int y01 = ++x;
        int q = x+1;
        // compound assignment operator / augmented assignment operator
        q += 1;
        q-=1;
        System.out.println(x);
        System.out.println(y);
        */

        // Order of Operations
        // Bodmas
        // (),*/,+-

        /*
        // Implicit casting - no data loss
        // byte > short > int > long > float > double
        short x = 1; // short byte - 2, int byte - 4
        int y = x+2; // auto casting
        System.out.println(y);

        // Explicit casting - only been use by compatible type
        double q = 1.1;
        int w = (int)q + 2;
        System.out.println(w);

        // used most interface like web or mobile app
        String a = "1";
        String b = "1.1"; // error for parseInt()
        // int w1 = (int)a + 2; //  we can't do this
        int w2 = Integer.parseInt(a) + 2;
        // Short.parseShort();
        // Float.parseFloat();
        System.out.println(w2);
        */

        // Math class
        /*
        int result01 = Math.round(1.5F); // 1.4 - 1, 1.5 - 2
        System.out.println(result01);
        System.out.println(Math.ceil(1.1F));
        int result02 = (int)Math.ceil(1.1F); // ceil will return float value so need to be casted
        System.out.println(Math.floor(1.1F));
        int result03 = (int)Math.floor(1.1F);
        int result04 = Math.max(1,2);
        System.out.println(result04);
        System.out.println(Math.min(1,2));
        // random() return the double
        double result05 = Math.random(); // between 0 to 1
        System.out.println(result05);
        double result06 = Math.random()*100;
        System.out.println(result06);
        double result07 = Math.round(Math.random()*100);
        System.out.println(result07);
        // round method return long so don't store it in less byte value like int / low byte datatypes
        int result08 = (int) Math.round(Math.random()*100);

        int result08 = (int) Math.random() * 100; // 0 * 100
        System.out.println(result08);
        int result09 = (int) (Math.random() * 100);
        System.out.println(result09);
        */

        // format numbers
        // Number Format is abstract class we can't create a new instance like object
        /*
        NumberFormat Currency = NumberFormat.getCurrencyInstance();
        String result01   = Currency.format(1234567.891);
        System.out.println(result01);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result02 = percent.format(0.1);
        System.out.println(result02);
        System.out.println(NumberFormat.getPercentInstance().format(0.1));
        */

        /*
        // Input
        // IN is a variable in class System
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are "+ age +" years old.");
        System.out.print("Name: ");
        String name = scanner.next(); // read the single token
        System.out.println("Your name is " + name);
        System.out.print("Name: ");
        String name1 = scanner.nextLine().trim(); // it also considers the space also
        System.out.println("Your name is " + name1); // name1.trim() also this thing can be used here
        // trim can be used in-order remove unwanted space in front and back of the string
        */

        // Mortgage calculator
        /*
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scan = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scan.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scan.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years = scan.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR; // ex: 30 * 12

        double a = monthlyInterest * Math.pow((1+monthlyInterest),numberOfPayments);
        double b = Math.pow((1+monthlyInterest),numberOfPayments) - 1;
        double mortgage = principal * (a/b);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
        */

        /*
        int x = 1;
        int y = 1;
        // boolean expression - produce a value
        System.out.println(x == y);
        System.out.println( x!=y);
        System.out.println(x<y);
        System.out.println(x<y);
        */

        // logical expression - combine multiple boolean expression
        /*
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
        */

        // if statement
        /*
        int temp = 25;
        if(temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20) { // emp > 20 && temp <= 30
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }
        */

        // simplified if statement
        /*
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); // parenthesis will make the expression clear
        */
        /*
        boolean hasHighIncome = false;
        if (income > 100_000) {
            hasHighIncome = true;
        }
        */
        /*
        else {
            hasHighIncome = false;  // if it doesn't initialize mean you use else statement
        }
        System.out.println(hasHighIncome);
        */

        // ternary operator
        // int income = 120_000;
        /*
        String className = "Economy";
        if(income > 100_000){
            className = "First";
        }
         */
        // String className = (income > 100_000)? "Firs" : "Economy";

        // switch statement
        // it also be implemented by if-else
        /*
        String role = "admin";
        // int role = 1
        switch (role){
            case "admin":
                System.out.println("you're a admin");
                break;
            case "moderator":
                System.out.println("you're a moderator");
                break;
            default:
                System.out.println("you're a guest");
        }
        */

        /*
        // exercise
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        if ((num % 3) == 0 && (num %5) == 0) {
            System.out.println("FizzBuzz");
        } else if(num%5 == 0){
            System.out.println("Fizz");
        } else if(num%3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

        // non reputation
        if(num%5 == 0){
            if (num%3==0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (num % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
        */

        /*
        // for loop - if you know how many number of times to execute a statements
        for(int i=0;i<5;i++){ // 1,<=
            System.out.println("Hello World " + i);
        }
        */

        // while loop - if you don't know how many time you going to execute code you can use it
        /*
        int i=0;
        while(i<5){
            System.out.println("Hello world "+ i);
            i++;
        }
        */
        /*
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){ // != it will compare the address only work on primitive datatype
            System.out.println("Input: ");
            input = scan.next().toLowerCase();
            System.out.println(input);
        }
        */

        // do while loop - It will always execute one's other thing will be same as while
        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do{
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));
        */

        // break and continue
        /*
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(true) { // !input.equals("quit")
            System.out.print("Input: ");
            input = scan.next().toLowerCase();
            /*
            // one way
            if(!input.equals("quit"))
                System.out.println(input);
            */
        /*
            if (input.equals("pass"))
                continue; // goto starting of the loop
            if (input.equals("quit"))
                break; // break out of the loop // terminate loop
            System.out.println(input);
        }
        */

        // for each loop
        /*
        String[] fruits = {"Apple","Mango","Orange"};
        for(String a:fruits){
            System.out.print(a);
        }

        for(int i=0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }
        */
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Principal ($1K - $1M): ");
        int principle = scan.nextInt();
        while(true){
            if(!(principle >= 1000 && principle <= 1000000)) {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                System.out.print("Principal ($1K - $1M): ");
                principle = scan.nextInt();
                continue;
            }
            break;
        }

        System.out.print("Annual Interest Rate: ");
        float Annual_Interest_Rate = scan.nextFloat();
        while (true){
            if(!(Annual_Interest_Rate > 0 && Annual_Interest_Rate <= 30)){
                System.out.println("Enter a value greater than 0 and less than or equal 30");
                System.out.print("Annual Interest Rate: ");
                Annual_Interest_Rate = scan.nextFloat();
                continue;
            }
            break;
        }

        System.out.print("Period (Years): ");
        short period = scan.nextShort();
        while(true){
            if(!(period > 0 && period <= 30)){
                System.out.println("Enter a value between 1 and 30");
                System.out.print("Period (Years): ");
                period = scan.nextShort();
                continue;
            }
            break;
        }
        int Month_In_Year = 12;
        int Percentage = 100;
        float monthly_Interest_rate = Annual_Interest_Rate/Percentage/Month_In_Year;
        int no_Of_Month = period*Month_In_Year;
        double a = monthly_Interest_rate * Math.pow((1+monthly_Interest_rate),no_Of_Month);
        double b = Math.pow((1+monthly_Interest_rate),no_Of_Month) - 1;
        double c = principle * (a/b);

        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(c));
        */
        // conditional statement - if or switch
        // loop - while,for,do-while,for-each

        /*
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principle = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Principle: ");
            principle = scan.nextInt();
            if(principle >= 1000 && principle <= 1_000_000){
                break; // accepted
            }
            System.out.println("Enter a correct value");
        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scan.nextFloat();
            if (annualInterest>=1 && annualInterest<=30){
                monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true){
            System.out.print("Period (Year): ");
            short years = scan.nextShort();
            if (years >=1 && years <= 30){
                numberOfPayments = years*MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a correct value");
        }

        double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))
                                   / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        */
        /*
        /*
        //        arguments
        greetUser("Mukesh","S");
        System.out.println(greetUser01("Mukesh","S"));
        // refactoring: changing the structure of the code without changing its behavior
         */

    }
    // define once run many times in main method
    /*
    /*
    public static void greetUser(String firstName,String lastName){ // String name is local variable fir this method
        System.out.println("Hello " + firstName + " " + lastName);
    }
    */
    /*
    /*
    public static String greetUser01(String firstName,String lastName){ // String name is local variable fir this method
        return "Hello " + firstName + " " + lastName;
    }
    */
    // refactoring: changing the structure of the code without changing its behavior
    // Compile time error - syntax error
    // runtime error - debugger help to find this type of error
}