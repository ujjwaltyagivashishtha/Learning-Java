
import java.util.Scanner;

public class LargestUntilZero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int largest = Integer.MIN_VALUE;
    while (true) {
      System.out.print("Enter a number (0 to stop): ");
      num = input.nextInt();
      if (num == 0) {
        System.out.println("Largest number entered is: " + largest);
        break;
      }
      if (num > largest) {
        largest = num;
      }
    }
  }
}
