import java.util.Scanner;
public class GuessingNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number = (int)(Math.random()*100);
    int guess;
    
    do{
      System.out.print("Enter your guess : ");
      guess = input.nextInt();
      
      if(guess > number ){
        System.out.println("Higher");
      }
      else if(guess < number){
        System.out.println("Lower");
      }
    }while(guess != number);
    
    System.out.println("Correct");
    
  }
}