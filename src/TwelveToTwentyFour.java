
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TwelveToTwentyFour {
    public static void timeConversion(String s) {
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }
}
