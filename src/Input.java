import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Input {
    public static final String TIME_FORMAT = "HH:mm";
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);

    private static Scanner scanner = new Scanner(System.in);







    public static String askString(String message) {
        System.out.print(message + ": ");
        return scanner.next();
    }
}
