import java.util.Scanner;

public class VowelConsonantSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a single alphabet character:");
    char ch = input.next().charAt(0);
    switch (ch) {
        case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(ch + " is a vowel.");
        default -> {
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                System.out.println(ch + " is a consonant.");
            } else {
                System.out.println(ch + " is not an alphabet character.");
            }
          }  
            }
    input.close();
  }
}
