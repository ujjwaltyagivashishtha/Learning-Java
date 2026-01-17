import java.util.Scanner;
public class CountSumAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the count of numbers: ");
    int n = input.nextInt();
    int sum = 0;
    for(int i = 1; i <= n; i++){
      System.out.print("Enter number " + i + ": ");
      int number = input.nextInt();
      sum += number;
    }
    double average = (double)sum / n;
    System.out.println("Sum of numbers: " + sum);
    System.out.println("Average of numbers: " + average);
  }
}