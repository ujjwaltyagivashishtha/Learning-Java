import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

      System.out.println("This is Simple Interest Calculator");

        Scanner input = new Scanner(System.in);

        // Input principal, rate and time
        System.out.print("Enter Principal: ");
        double P = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double R = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        System.out.print("Is time in Years or Months? (Y/M): ");
        char unit = input.next().charAt(0);

        double T;

        // Convert time to years if given in months
        if (unit == 'M' || unit == 'm') {
            T = time / 12;   // months to years
        } else {
            T = time;       // already in years
        }

        // Simple Interest formula
        double SI = (P * R * T) / 100;
        double amount = P + SI;

        // Output
        System.out.println("Simple Interest = " + SI);
        System.out.println("Total Amount = " + amount);

        input.close();
    }
}
