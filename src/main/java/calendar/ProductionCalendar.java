package calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class ProductionCalendar {
    private static final Set<LocalDate> May2024 = new HashSet<>();
    static {
        May2024.add(LocalDate.of(2024, Month.MAY,1));
        May2024.add(LocalDate.of(2024,Month.MAY,9));
        May2024.add(LocalDate.of(2024,Month.MAY,10));
    }
    public static  boolean isWeekend(LocalDate date){
        DayOfWeek dayOfWeek =date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY){
            return true;
        }
        return May2024.contains(date);
    }

}
