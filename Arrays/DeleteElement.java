
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr1[] = {10,20,30,40,50,60,70,80,90,50,30,10,10,45,10,10,3,1};
    System.out.print("Enter a number you want to delete from an array : ");
    int num = input.nextInt();
    int result[] = Delete(arr1, num);

    System.out.println("Array after deleting "+num+" is : "+Arrays.toString(result));
    
  }

  public static int[] Delete(int []arr, int num){
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(num == arr[i]){
        count++;
      }
    }
    int delete = num;
    if(count == 0){
      return arr;
    }
    int newArr[] = new int[arr.length - count];
    int index = 0;
    for(int i = 0; i < arr.length; i++){
      if(delete != arr[i]){
        newArr[index++] = arr[i];
      }
    }
    return newArr;
  }
}
