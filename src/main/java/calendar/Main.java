package calendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.MAY, 9);
        System.out.println(date + " выходной? " + ProductionCalendar.isWeekend(date));
        date = LocalDate.of(2024, Month.MAY, 10);
        System.out.println(date + " выходной? " + ProductionCalendar.isWeekend(date));
        date = LocalDate.of(2024, Month.MAY, 13);
        System.out.println(date + " выходной? " + ProductionCalendar.isWeekend(date));
        date = LocalDate.of(2024, Month.MAY, 16);
        System.out.println(date + " выходной? " + ProductionCalendar.isWeekend(date));
        ZonedDateTime dateTime = ZonedDateTime.of(2024, 5, 9, 12, 0, 0, 0, ZoneId.of("UTC"));
        System.out.println(dateTime + "  не рабочее время? " + WorkingTimeChek.isNotWorkingTime(dateTime, "Europe/Moscow"));
        ZonedDateTime dateTime2 = ZonedDateTime.of(2024, 5, 13, 10, 0, 0, 0, ZoneId.of("UTC"));
        System.out.println(dateTime2 + "  не рабочее время? " + WorkingTimeChek.isNotWorkingTime(dateTime2, "Europe/Moscow"));
        ZonedDateTime dateTime3 = ZonedDateTime.of(2024, 5, 10, 11, 20, 0, 0, ZoneId.of("UTC"));
        System.out.println(dateTime3 + "  не рабочее время? " + WorkingTimeChek.isNotWorkingTime(dateTime3, "Europe/Moscow"));
        ZonedDateTime dateTime4 = ZonedDateTime.of(2024, 5, 20, 18, 20, 0, 0, ZoneId.of("UTC"));
        System.out.println(dateTime4 + "  не рабочее время? " + WorkingTimeChek.isNotWorkingTime(dateTime4, "Europe/Moscow"));
    }
}
