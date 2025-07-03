import java.util.Scanner;
import java.util.Locale; // Import Locale for setting the default locale for Scanner

public class Main {
    public static void main(String[] args) {
        // Set the default locale to US to ensure correct decimal point handling
        // This is important for Beecrowd as it often expects dot as decimal separator
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        // Read data for product 1
        int code1 = sc.nextInt();
        int units1 = sc.nextInt();
        double price1 = sc.nextDouble();

        // Read data for product 2
        int code2 = sc.nextInt();
        int units2 = sc.nextInt();
        double price2 = sc.nextDouble();

        // Calculate the total value
        double totalValue = (units1 * price1) + (units2 * price2);

        // Print the result formatted to two decimal places
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValue);

        sc.close(); // Close the scanner to release resources
    }
}
