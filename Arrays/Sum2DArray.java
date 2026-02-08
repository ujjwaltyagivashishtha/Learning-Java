
import java.util.Scanner;

public class Sum2DArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of row of an array : ");
    int rows = input.nextInt();
    System.out.print("Enter the size of columns of an array : ");
    int cols = input.nextInt();
    int arr[][] = new int[rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        System.out.print("Enter the element of index arr["+i+"]["+j+"] : ");
        arr[i][j] = input.nextInt();
      }
    }

    int sum = 0;

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        sum += arr[i][j];
      }
    }

    System.out.println("Sum of elements of 2-D Array is : "+sum);
  }
}
