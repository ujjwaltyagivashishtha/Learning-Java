
import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    System.out.print("Enter number of terms : ");

    Scanner input = new Scanner(System.in);

    int num = input.nextInt();

    System.out.print("Fibonacci Series : ");

    int a = 0,b = 1;


    for(int i = 1; i <= num; i++){
     System.out.print(a+" ");
     int next = a + b;
     a = b;
     b = next;
    }

    input.close();
  }
}
