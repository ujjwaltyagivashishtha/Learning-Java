import java.util.Scanner;


public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int inputNum = input.nextInt();

    long fact = factorial(inputNum);
    System.out.println("The factorial of "+inputNum+" is "+fact+" using recursion");

    long fact1 = factorialUsingLoops(inputNum);
    System.out.println("The factorial of "+inputNum+" is "+fact1+" using loops");
    input.close();

  }

  public static long factorial( int n ){
    if(n ==0 || n == 1){
      return 1;
    } else{
      return n*factorial(n - 1);
    }
  }

  public static long factorialUsingLoops(int n){
    int result = 1;
    for(int i = 1; i <= n; i++){
      result = result * i;
    }
    return result;
  }
}
