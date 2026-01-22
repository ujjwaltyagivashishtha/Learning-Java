
import java.util.Scanner;

public class BitwiseOR {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number : ");
    int num2 = input.nextInt();
    int result = num1 | num2;
    System.out.println("The result of bitwise OR operation is : " + result);
    input.close();
  }
}
