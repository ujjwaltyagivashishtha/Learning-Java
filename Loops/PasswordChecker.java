import java.util.Scanner;
public class PasswordChecker{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   String password;
  
    do{
      System.out.print("Enter your password : ");
      password = input.nextLine();
    
    } while(password.length() < 8);
   
    System.out.println("Password is valid");
    
  }
}