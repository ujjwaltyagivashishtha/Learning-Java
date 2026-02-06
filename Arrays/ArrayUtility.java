import java.util.Scanner;

public class ArrayUtility {
  public static int[] arrInp(){
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter the size of an array : ");

    int size = inp.nextInt();

    int nums[] = new int[size];

    for(int i = 0; i < nums.length; i++){
      System.out.print("Enter the elements : ");
      nums[i] = inp.nextInt();
    }
    return nums;
  }
  
}
