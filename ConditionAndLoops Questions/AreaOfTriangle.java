
import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height : ");
    double height = input.nextDouble();
    System.out.print("Enter base : ");
    double base = input.nextDouble();

    double area = 0.5 * (height*base);

    System.out.println("Area of triangle : "+area);
  }
}
