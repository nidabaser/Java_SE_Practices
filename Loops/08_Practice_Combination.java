/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Combination Formula
        // C(n,r) = n! / (r! * (n-r)!)

        //Scanner Class
        Scanner s = new Scanner(System.in);

        // Define Variables
        int n, r;
        double factorialN = 1, factorialR = 1, factorialNr = 1, combination;

        // Take inputs from user
        System.out.println("Calculating Combination of N choose r\nFormula: C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("Enter N: ");
        n = s.nextInt();
        System.out.print("Enter r: ");
        r = s.nextInt();

        // Check inputs
        while ( r<=0 || r>n ) {
            System.out.println("Invalid value. Try again: ");
            System.out.print("Enter N: ");
            n = s.nextInt();
            System.out.print("Enter r: ");
            r = s.nextInt();
        }

        // Calculate Combination using for loops
        for (int i=1; i<=n; i++) {
            factorialN *= i;
        }
        for (int i=1; i<=r; i++) {
            factorialR *= i;
        }
        for (int i=1; i<=(n-r); i++) {
            factorialNr *= i;
        }
        combination = ( factorialN / (factorialR * factorialNr) );

        // Print results
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
