package Train_Ticket_Booking_System;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Main {
    Scanner scan = new Scanner(System.in);

    private List<Book> l =new ArrayList<>(3);
    private List<Book> rac =new ArrayList<>(1);

    public static String Text() {
        StringBuilder sb = new StringBuilder();
        sb.append("RailWay Booking System:\n" +
                "1. Book Ticket\n" +
                "2. Cancel Ticket\n" +
                "3. View Confirmed Tickets\n" +
                "4. View Available Tickets\n" +
                "5. View RC Tickets\n" +
                "6. View Waiting List Tickets\n" +
                "7. Exit\n");
        return sb.toString();
    }

    public String bookTicket() {
        if(l.size()==3) {
            return bookRac();
        }
        System.out.print("Enter Name: "); String n = scan.next();
        System.out.print("Enter Age: "); int a = scan.nextInt();
        System.out.print("Enter Gender(Male/Female): "); String g = scan.next();
        System.out.print("Enter Berth Preference (L/M/U): "); char b = scan.next().charAt(0);
        Book user = new Book(n,a,g,b);
        l.add(user);
        return "Ticket Confirmed " + user.TicketId;
    }

    public String bookRac() {

        return "";
    }

    public static void main(String[] args) {
        boolean exit = false;
        Main m = new Main();
        while(!exit) {
            System.out.println(Text());
            System.out.print("Enter your choice: "); int n = m.scan.nextInt();
            switch(n) {
                case 1:
                    System.out.println(m.bookTicket());
                    break;
                case 7:
                    exit = true;
            }
        }
    }
}
