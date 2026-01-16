
import java.util.Scanner;

public class AreaCircle {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter the radius : ");
    double radius = inp.nextDouble();

    double pi = 3.14;

    double area = pi * radius *radius;

    System.out.println("Area of Circle : "+area);
  }
}
