
import java.util.Scanner;

public class SumOfNNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements to sum: ");
    int n = input.nextInt();
    int sum = 0;
    for(int i = 1; i <= n; i++){
      System.out.print("Enter number " + i + ": ");
      int number = input.nextInt();
      sum += number;
    }
    System.out.println("The sum of the entered numbers is: " + sum);
    input.close();
  }
}
