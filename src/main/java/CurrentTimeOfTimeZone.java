import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class CurrentTimeOfTimeZone {
    public static void main(String[] args) {
        ZonedDateTime todayWithDefaultTimeZone = ZonedDateTime.now();

        DateTimeFormatter formatTodayWithZoneId = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");
        System.out.format("Formatted date time with default zone ID is %s\n", todayWithDefaultTimeZone.format(formatTodayWithZoneId));
        ZoneId timeZone = ZoneId.of("America/New_York");
        String time = getTimeFromTimeZone(timeZone);
        System.out.format("Formatted date time with zone offset of UTC +12 hours is " + time);

    }

    static String getTimeFromTimeZone(ZoneId timeZone) {
        LocalDateTime today = LocalDateTime.now(ZoneId.of("+1200"));

        ZonedDateTime todayWithTimeZone = ZonedDateTime.of(today, timeZone);
        DateTimeFormatter formatTodayWithZoneOffset = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");
        return todayWithTimeZone.format(formatTodayWithZoneOffset);

    }
}
