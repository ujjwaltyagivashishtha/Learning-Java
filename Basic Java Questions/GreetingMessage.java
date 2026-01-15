

import java.util.Scanner;

public class GreetingMessage {
  public static void main(String[] args) {
    System.out.print("Enter your name : ");
    Scanner inp = new Scanner(System.in);
    String name = inp.next();

    System.out.println("Good Morning "+name);

    inp.close();
  }
}
