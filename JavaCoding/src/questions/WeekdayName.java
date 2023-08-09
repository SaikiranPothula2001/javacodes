package questions;

import java.util.Scanner;

public class WeekdayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int userNumber = scanner.nextInt();
        
        String weekday = getWeekdayName(userNumber);
        System.out.println("Weekday: " + weekday);

        scanner.close();
    }

    // Function to get the name of the weekday based on the given number
    public static String getWeekdayName(int number) {
        switch (number) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid input. Enter a number between 1 and 7.";
        }
    }
}
