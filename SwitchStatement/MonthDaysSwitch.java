import java.util.Scanner;

public class MonthDaysSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the month number (1-12): ");
    int month = input.nextInt();
    int days = 0;
    switch(month){
      case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
      case 4, 6, 9, 11 -> days = 30;
      case 2 -> days = 28;
      default -> System.out.println("Invalid month number!");
    }
    System.out.println("Number of days: " + days);
    input.close();
  }
}
