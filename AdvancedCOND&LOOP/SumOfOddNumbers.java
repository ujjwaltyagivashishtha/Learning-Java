
import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N : ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the number : ");

            int oddNum = input.nextInt();

            if (oddNum % 2 != 0) {
                sum += oddNum;
            }
          }
        System.out.println("Sum of odd numbers : " + sum);
    }
}
