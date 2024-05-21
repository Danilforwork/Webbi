package calendar;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WorkingTimeChek {
    private static final LocalTime workStart = LocalTime.of(9, 0);
    private static final LocalTime workEnd = LocalTime.of(18, 0);

    public static boolean isNotWorkingTime(ZonedDateTime dateTime, String timeZone) {
        ZoneId zoneId = ZoneId.of(timeZone);
        ZonedDateTime localDateTime = dateTime.withZoneSameInstant(zoneId);
        if (ProductionCalendar.isWeekend(localDateTime.toLocalDate())){
            return true;
        }
        LocalTime time = localDateTime.toLocalTime();
        return time.isBefore(workStart) || time.isAfter(workEnd);
    }

}
