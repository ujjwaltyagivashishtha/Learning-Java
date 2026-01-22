
import java.util.Scanner;

public class BitwiseComplement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    int result = ~num;
    System.out.println("The result of bitwise complement operation is : " + result);
    input.close();
  }
}
