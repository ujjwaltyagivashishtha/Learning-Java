import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        // Conversion rate
        double rate = 90.34;   // 1 USD = 90.34 INR

        double dollars = rupees / rate;

        System.out.println("Amount in USD = " + dollars);

        sc.close();
    }
}
