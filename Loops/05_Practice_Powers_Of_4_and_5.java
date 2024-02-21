/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Define variable
        int n;
        
        // Scanner class
        Scanner scan = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Enter the limit for powers of 4 and 5: ");
        n = scan.nextInt();

        // Checking for the limit is positive
        while (n <= 0) {
            System.out.print("Please enter positive number: ");
            n = scan.nextInt();
        }

        // Calculate powers of four with for loop
        System.out.println("Powers of 4: ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }

        // Calculate powers of five with for loop
        System.out.println("\nPowers of 5: ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
