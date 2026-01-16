
import java.util.Scanner;

public class SubtractProductAndSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    int sum = 0;
    int product = 1;

    while(num > 0){
      int digit = num % 10;
      sum += digit;
      product *= digit;
      num /= 10;
    }
    System.out.println(product - sum);
  }
}
