import java.util.Scanner;
public class ExitOnExit{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String message;

    do{
      System.out.print("Enter the command : ");
      message = input.nextLine();
    } while(!message.equalsIgnoreCase("exit"));

    System.out.println("Exiting...");
  }
}