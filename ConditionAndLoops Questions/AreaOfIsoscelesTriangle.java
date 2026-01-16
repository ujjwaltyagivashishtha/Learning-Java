import java.util.Scanner;
public class AreaOfIsoscelesTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of equal sides : ");
    double side = input.nextDouble();
    System.out.print("Enter the base : ");
    double base = input.nextDouble();

    double height = Math.sqrt((side*side) - ((base*base)/4));
    double area = 0.5 * base * height;

    System.out.println("Area of isosceles triangle : " + area);
    input.close();
  }
}