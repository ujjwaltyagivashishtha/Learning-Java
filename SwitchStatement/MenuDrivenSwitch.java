import java.util.Scanner;

public class MenuDrivenSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Menu:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.print("Choose an operation (1-4): ");
    int choice = input.nextInt();
    System.out.print("Enter first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = input.nextDouble();
    double result = 0;
    switch (choice) {
      case 1 -> result = num1 + num2;
      case 2 -> result = num1 - num2;
      case 3 -> result = num1 * num2;
      case 4 -> result = num1 / num2;
      default -> System.out.println("Invalid choice!");
    }
    System.out.println("The result is: " + result);
    input.close();
  }
}
