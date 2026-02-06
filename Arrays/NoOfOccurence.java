
import java.util.Scanner;

public class NoOfOccurence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr[] = {10,20,30,40,50,60,70,80,90,50,30,10,10,45,10,10};
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    int result = Occurence(arr, num);

    if(result > 0 ){
      System.out.println("The number of occurnce : "+result);
    } else{
      System.out.println("Number is not present in array...");

    }
  }

  public static int Occurence(int []arr, int num) {
    int target = num;
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      if (arr[i] == num) {
          count++;
      }
    }
    return count;
      
  }
}
