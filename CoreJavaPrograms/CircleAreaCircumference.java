// Calculate the area and circumference of a circle for a given radius using Math.PI

public class CircleAreaCircumference {
  public static void main(String[] args) {
    double radius = 5.0;

    double area = Math.PI * Math.pow(radius, 2);
    double circumference = 2 * Math.PI * radius;

    System.out.println("Area of the circle: " + area);
    System.out.println("Circumference of the circle: " + circumference);
  }
}
