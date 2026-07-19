package com.Google;

/*
* To generate constructor
* code - generate
* ctrl + N
* select necessary variable
* */

/*
* To remove parameter
* Ctrl + t
* change signature
* select unwanted parameters
* */

/*
* Find usages of class
* Alt + F7
* right click on class
*
*
* */
public class MortgageCalculator {

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principle;
    private float annualInterest;
    private byte years;

    // Alt + insert (Generate) - To create Constructor and assign value for the variables
    public MortgageCalculator(int principle, float annualInterest, byte years) { // get the arguments from Main class
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float numberOfPayments = getNumberOfPayments(); // 15 years * 12 Months = 180 months
        float monthlyInterest = getMonthlyInterest(); // 4.5% annual interest / 12 months = monthly interest

        double mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }


    public double calculateLoanBalance(short numberOfPaymentsMade) {
        float numberOfPayments = getNumberOfPayments(); // 180
        float monthlyInterest = getMonthlyInterest();

        double loanBalance = principle
                * (Math.pow((1 + monthlyInterest), numberOfPayments) - Math.pow((1 + monthlyInterest), numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return loanBalance;
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()]; // 15*12=180
        for(short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateLoanBalance(month); // 0 - 179 index
        }
        return balances;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR; // years - input, Month - given
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}