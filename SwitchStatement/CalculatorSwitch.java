import java.util.Scanner;

public class CalculatorSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = input.nextDouble();
    System.out.print("Enter an operator ( + , - , * , / ) :");
    char operator = input.next().charAt(0);
    double result;
    switch (operator){
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        throw new AssertionError("Invalid operator");
    }
    System.out.println("The result is: " + result);
    input.close();
  }
}
