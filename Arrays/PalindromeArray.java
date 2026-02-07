public class PalindromeArray {
  public static void main(String[] args) {
    int arr[] = ArrayUtility.arrInp();

    boolean palindrome = palindrome(arr);

    if(palindrome){
      System.out.println("Array is palindrome...");
    } else{
      System.out.println("Array is not palindrome...");

    }

  }

  public static boolean palindrome(int arr[]){
    int i = 0;

    while(i < arr.length/2){
      if(!(arr[i] == arr[(arr.length - 1)-i])){
        return false;
      }
      i++;
    }

    return true;
  }
}
