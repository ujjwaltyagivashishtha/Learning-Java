
import java.util.Scanner;

public class OddOrEvenTernary {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int num = input.nextInt();
      
      String result = num % 2 == 0 ? "Number is Even" : "Number is Odd";
      System.out.println(result);
  }
}
