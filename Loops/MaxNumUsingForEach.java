import java.util.Scanner;
public class MaxNumUsingForEach{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int n = input.nextInt();
    int []arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("Enter the value : ");
      arr[i] = input.nextInt();
    }

    int max = arr[0];
    for(int val : arr){
      if(val > max){
        max = val;
      }
    }
    System.out.println("Maximum value is : " + max);
  }
}
