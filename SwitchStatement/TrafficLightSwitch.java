import java.util.Scanner;

public class TrafficLightSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the traffic light color (red, yellow, green): ");
    String color = input.nextLine().toLowerCase();
    String action = null;
    switch (color){
      case "red" -> action = "Stop";
      case "yellow" -> action = "Ready";
      case "green" -> action = "Go";
      default -> System.out.println("Invalid color!");
    }
    System.out.println("Current signal detected. Please " + action + ".");
    input.close();
  }
}
