import java.util.Scanner;

public class GradeSystemSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your score (0-100): ");
    int score = input.nextInt();
    String grade = null ;
    switch (score / 10){
      case 10, 9 -> grade = "A";
      case 8,7 -> grade = "B";
      case 5,6 -> grade = "C";
      case 4 -> grade = "D";
      case 3, 2, 1, 0 -> grade = "F";
      default -> System.out.println("Invalid score!");
    }
    System.out.println("Your grade is: " + grade);
    input.close();
  }
}
