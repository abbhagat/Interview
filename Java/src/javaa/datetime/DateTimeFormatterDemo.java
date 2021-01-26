package javaa.datetime;

import java.time.*;
import java.time.format.*;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        String goodFriday = "Apr 18 2014";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu");
            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
            System.out.println(holiday);
            //System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s is not parsable!%n", goodFriday);
        }
    }
}
