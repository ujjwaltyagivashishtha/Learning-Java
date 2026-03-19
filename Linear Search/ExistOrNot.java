import java.util.Scanner;

public class ExistOrNot {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int[] arr = {18, 12, 9, 14, 77, 50};

    System.out.print("Enter the number to check: ");
    int num = inp.nextInt();

    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        System.out.printf("%d exists at index %d.", num, i);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.printf("%d does not exist.", num);
    }
  }
}