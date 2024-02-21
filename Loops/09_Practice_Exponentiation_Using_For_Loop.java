/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Exponentiation using for loop

        //Scanner Class
        Scanner s = new Scanner(System.in);

        // Define Variables
        int n, k, power=1;

        // Take inputs from user
        System.out.println("Calculating n to the power of k");
        System.out.print("Enter base n: ");
        n = s.nextInt();
        System.out.print("Enter exponent k: ");
        k = s.nextInt();

        // Check inputs
        while ( n==0 || k<=0 ) {
            System.out.println("Invalid value. Try again: ");
            System.out.print("Enter base n: ");
            n = s.nextInt();
            System.out.print("Enter exponent k: ");
            k = s.nextInt();
        }

        // Calculate Combination using for loops
        for (int i=1; i<=k; i++) {
            power*=n;
        }

        // Print results
        System.out.println( n + " ^ " + k + " = " + power);
    }
}
