package com.Google;

/*
 * keep your methods short (5 - 10 lines)
 * Extract repetitive patterns
 * Extract highly related statements
 */

/*
* Refactoring shortcuts
* select a method
* right click on method go to refactor
* Move to new class
* select necessary method to move to new class
* */

public class Main {
    static void main(String args[]) {
        int principle = (int) Console.readNumber("Principle: ",1000,1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte) Console.readNumber("Period (Year): ",1,30);

        // calculator object has all access to methods,variables in MortgageCalculator Class
        var calculator = new MortgageCalculator(principle, annualInterest, years);
        var report = new MortgageReport(calculator); // then I give the object to MortgageReport class
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
