
import java.util.Scanner;

public class SumUntilZero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    while (true) {
      System.out.print("Enter a number (0 to stop): ");
      int num = input.nextInt();
      if (num == 0) {
        System.out.println("Sum of all numbers entered is: " + sum);
        break;
      }
      sum += num;
    }
  }
}
