/*
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Define Variables
        int n, sum = 0;

        // Create loop
        do {
            System.out.print("Enter an even number: ");
            n = s.nextInt();

            // Conditions
            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 == 0);
        
        // Print results
        System.out.println("You entered an odd number. Loop is stopped.");
        System.out.println("Sum of multiples of four: " + sum);
    }
}
