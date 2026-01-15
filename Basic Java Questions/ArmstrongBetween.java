
import java.util.Scanner;

public class ArmstrongBetween {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter starting number : ");

    int startNum = input.nextInt();

    System.out.print("Enter ending number : ");

    int endNum = input.nextInt();

    System.out.println("Armstrong numbers between "+startNum+" and "+endNum+" : ");

    for(int num = startNum; num <= endNum; num++){
      int temp = num;
      int sum = 0;
      int digits = String.valueOf(num).length();

      while(temp > 0){
        int digit = temp % 10;
        sum = sum + (digit*digit*digit);
        temp = temp / 10;
      }

      if(sum==num){
        System.out.println(num);
      }
    }
    input.close();
  }
}
