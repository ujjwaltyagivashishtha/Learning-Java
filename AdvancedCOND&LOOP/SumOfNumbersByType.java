
import java.util.Scanner;

public class SumOfNumbersByType {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the count of numbers: ");
    int n = input.nextInt();
    int evenSum = 0;
    int oddSum = 0;
    for(int i = 1; i <= n; i++){
      System.out.print("Enter number " + i + ": "); 
      int number = input.nextInt();
      if(number % 2 == 0){
        evenSum += number;
      } else {
        oddSum += number;
      }
    }
    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);
  }
}
