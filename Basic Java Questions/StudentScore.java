
import java.util.Scanner;

public class StudentScore {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the your score (0 - 100): ");
    int score = input.nextInt();

    String result = score > 80 && score <= 100 ? "High" : score >= 50 && score < 80 ? "Moderate" : "Low";

    System.out.println("Your got "+result);
  }
}
