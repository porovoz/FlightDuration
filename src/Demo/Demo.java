package Demo;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Demo {


    public static void main(String[] args) {
      //  ZonedDateTime nowInRiga = ZonedDateTime.now(ZoneId.of("Europe/Riga"));
      //  System.out.println(nowInRiga);
      //  ZonedDateTime nowInSydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
      //  System.out.println(nowInSydney);
        ZonedDateTime departureTime = ZonedDateTime.parse("2021-03-08T06:40:00Z[Europe/Riga]");
        ZonedDateTime arrivalTime = ZonedDateTime.parse("2021-03-09T20:15:00Z[Australia/Sydney]");
        System.out.println(departureTime);
        System.out.println(arrivalTime);
        var flightDuration = Duration.between(departureTime, arrivalTime);
        System.out.println(flightDuration);
        long seconds = flightDuration.getSeconds();
        long days = seconds / 86400;
        long hours = seconds / 3600 % 33;
        long minutes = (seconds / 60) % 60;
        var strDuration = String.format("%d day %d hours and %d minutes", days, hours, minutes);
        System.out.println(strDuration);
    }
}