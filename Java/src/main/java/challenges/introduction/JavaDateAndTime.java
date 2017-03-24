package challenges.introduction;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by nino on 3/18/17.
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt()-1; // Adjust for Calendar class starting its months at 0.
        int day = sc.nextInt();
        int year = sc.nextInt();

        int dayOfWk = new Calendar
                .Builder()
                .setDate(year, month, day)
                .build()
                .get(Calendar.DAY_OF_WEEK);
        System.out.print(getDay(dayOfWk));
    }

    public static String getDay(int day) {
        switch (day) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
                return "SHOULD NEVER HAPPEN!!";
        }
    }
}
