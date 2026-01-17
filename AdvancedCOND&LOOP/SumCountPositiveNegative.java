
import java.util.Scanner;

public class SumCountPositiveNegative {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sumPositive = 0;
    int sumNegative = 0;
    int countPositive = 0;
    int countNegative = 0;
    System.out.println("Enter integers (0 to stop):");
    while (true) {
      int number = input.nextInt();
      if (number == 0) {
        break;
      } else if (number > 0) {
        sumPositive += number;
        countPositive++;
      } else {
        sumNegative += number;
        countNegative++;
      }
    }
    System.out.println("Sum of positive numbers: " + sumPositive);
    System.out.println("Count of positive numbers: " + countPositive);
    System.out.println("Sum of negative numbers: " + sumNegative);
    System.out.println("Count of negative numbers: " + countNegative);
    input.close();
  }
}
