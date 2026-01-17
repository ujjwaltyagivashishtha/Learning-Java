
import java.util.Scanner;

public class VowelOrConsonant {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char letter = input.next().toLowerCase().charAt(0);
    if (letter >= 'a' && letter <= 'z') {
      if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        System.out.println(letter + " is a vowel.");
      } else {
        System.out.println(letter + " is a consonant.");  
      }
    } else {
      System.out.println("Invalid input. Please enter a letter.");
    }
    input.close();
  }
}
