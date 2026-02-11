
import java.util.Scanner;

public class AbsoluteNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of number : ");

    int num = input.nextInt();

    int result = Absolute(num);
    System.out.println("Absolute of "+"num"+" is : "+result);

  }

  public static int Absolute(int num){
    if(num < 0){
      return (-num);
    } else{
      return num;
    }
  }
}
