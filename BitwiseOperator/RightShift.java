
import java.util.Scanner;

public class RightShift {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    int result = num >> 1;
    System.out.println("The result of right shift operation is : " + result);
    input.close();
  }
}
