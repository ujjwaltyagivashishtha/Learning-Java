
import java.util.Scanner;

public class SumOfDiagonals {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of row and column: ");
    int size = input.nextInt();

    int [][]arr = new int[size][size];

    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        System.out.print("Enter the element of index arr["+i+"]["+j+"] : ");
        arr[i][j] = input.nextInt();
      }
    }

    int lToR = 0;
    int rToL = 0;

    for(int i = 0; i < size; i++){
      lToR += arr[i][i];
      rToL += arr[i][size - 1 - i];
    }

    System.out.println("Sum : "+lToR);
    System.out.println("Sum : "+rToL);
  }
}
