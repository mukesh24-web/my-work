package Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // UTS time - military time
        Instant ltime = Instant.now();
        System.out.println(ltime);

        // custom format for date & time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // american pattern MM-dd-yyyy
        String newDateTime = dateTime.format(formatter); // variable.format(pattern)
        System.out.println(newDateTime);

        // custom date & time
        LocalDate date0 = LocalDate.of(2025, 12, 28);
        System.out.println(date0);

        LocalDateTime date1 = LocalDateTime.of(2025, 12, 31, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 12, 31, 12, 0, 0);
        System.out.println(date1);

        if(date1.isBefore(date2)){
            System.out.println(date1.format(formatter) + " is earlier than " + date2.format(formatter));
        }
        else if(date1.isAfter(date2)) {
            System.out.println(date1.format(formatter) + " is later than " + date2.format(formatter));
        }
        else if(date1.isEqual(date2)) {
            System.out.println(date1.format(formatter) + " is equal than " + date2.format(formatter));
        }
        else {
            System.out.println(false);
        }

    }
}
