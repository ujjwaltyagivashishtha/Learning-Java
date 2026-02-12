import java.util.Scanner;
public class BreakAndContinue {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int num = input.nextInt();
  
  for(int i = 1; i <= num; i++){
    if(i == 5){
      break;
    }
    System.out.println("Break : " + i);
  }

  for(int i = 1; i <= num; i++){
    if(i == 5){
      continue;
     }
    System.out.println("Continue : " + i);
  }       
  }  
}
