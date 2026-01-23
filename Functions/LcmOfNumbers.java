
import java.util.Scanner;

public class LcmOfNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

    int lcm = findLcm(num1, num2);
    System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
  }
  public static int findLcm(int a, int b){
    int max = Math.max(a, b);
    int lcm = max;

    while(true){
      if(lcm % a == 0 && lcm % b == 0){
        return lcm;
      } else {
        lcm += max;
      }
    }
  }
}
  