
import java.util.Scanner;

public class AreaOfRectangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length : ");
    double height = input.nextDouble();
    System.out.print("Enter the breadth : ");
    double breadth = input.nextDouble();

    double area = height*breadth;

    System.out.println("Area of rectangle : "+area);
    input.close();


  }
}
