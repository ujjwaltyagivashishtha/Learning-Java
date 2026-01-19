import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
    int day = input.nextInt();
    String dayName;
    switch (day) {
        case 1 -> dayName = "Monday";
        case 2 -> dayName = "Tuesday";
        case 3 -> dayName = "Wednesday";
        case 4 -> dayName = "Thursday";
        case 5 -> dayName = "Friday";
        case 6 -> dayName = "Saturday";
        case 7 -> dayName = "Sunday";
        default -> dayName = "Invalid day number";
    }
    System.out.println("The day is: " + dayName);
    input.close();

  }
}
