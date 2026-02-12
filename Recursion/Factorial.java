import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    
    System.out.println("Factorial of " + num + " is " + factorial(num));
  }

  public static long factorial(int n){
    if(n == 0 || n == 1){
      return 1;
    }
    return n * factorial(n-1);
  }
}