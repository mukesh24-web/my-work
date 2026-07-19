package com.Google;

import java.util.Scanner;

public class Console {

    private static Scanner scan = new Scanner(System.in);

    public static double readNumber(String prompt) { // just to get a number without min and max
        return scan.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt); // print the prompt
            value = scan.nextDouble(); // get the value
            if (value >= min && value <= max) // if value is accepted then break the loop otherwise continue the loop
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

}
