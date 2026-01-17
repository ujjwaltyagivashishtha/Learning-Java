
import java.util.Scanner;

public class AverageOfNNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = input.nextInt();
    double sum = 0;
    for(int i = 1; i <= n; i++){
      System.out.print("Enter number " + i + ": ");
      double number = input.nextDouble();
      sum += number;
    }
    double average = sum / n;
    System.out.println("The average of the entered numbers is: " + average);
    input.close();
  }
}
