package Train_Ticket_Booking_System;

public class Book {
    public int TicketId = 0;
    private String Name;
    private int age;
    private String Gender;
    private char Berth;

    public Book(String n,int a,String g,char b) {
        TicketId = ++TicketId;
        Name = n;
        age = a;
        Gender = g;
        Berth = b;
    }
}
