
import java.util.Scanner;

public class Avg2DArray{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of row : ");
    int rows = input.nextInt();
    System.out.print("Enter the size of column : ");
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
    int avg = sum / (rows * cols);

    System.out.println("Average : "+ avg);
  }
}