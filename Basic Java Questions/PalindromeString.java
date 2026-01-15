
import java.util.Scanner;

public class PalindromeString {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string : ");

    String str = input.next();

    int i = 0;
    int j = str.length() - 1;

    boolean isPalindrome = true;

    while(i < j){
      if(str.charAt(i) != str.charAt(j)){
        isPalindrome = false;
        break;
      }
      i++;
      j--;
    }

    if(isPalindrome){
      System.out.println(str+" is Palinfrome.");
    } else{
      System.out.println(str+" is not Palindrome.");
    }

    input.close();
  }
}
