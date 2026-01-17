import java.util.Scanner;

public class ReverseAndPalindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    int original = num;
    int reverse = 0;
    while (num != 0) {
      reverse = reverse * 10 + num % 10;
      num /= 10;
    }
    if (original == reverse) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
    input.close();
  }
}