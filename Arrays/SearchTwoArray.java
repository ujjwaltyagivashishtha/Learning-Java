
import java.util.Scanner;

public class SearchTwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the size of columns : ");
        int cols = input.nextInt();
        int arr[][] = new int[rows][cols];
        int i = 0;
        while(i < rows){
            int j = 0;
            while (j < cols) {
                System.out.print("Enter the value of index arr["+i+"]["+j+"] : ");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        System.out.print("Enter the number you want to search : ");
        int num = input.nextInt();

        SearchElement(arr, rows, cols, num);


    }

    public static void SearchElement(int arr[][], int rows, int cols, int num){
        int i = 0;
        while( i < rows){
            int j = 0;
            while( j < cols){
                if(num == arr[i][j]){
                    System.out.println("Your number is at index of an arr["+i+"]["+j+"]");
                    return;
                }
                j++;
            }
            i++;
        }
        System.out.println("Number not found in the array");
    }
}
