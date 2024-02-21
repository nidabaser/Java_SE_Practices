/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Factorial Formula
        // n! = 1 * 2 * 3 * 4 * 5 *...* n

        // Scanner Class and Define Variables
        Scanner s = new Scanner(System.in);
        System.out.print("Enter factorial number: ");
        int n = s.nextInt();
        int factorial = 1;

        // Check for positive number
        while ( n <= 0) {
            System.out.print("Invalid number !\nEnter positive number: ");
            n = s.nextInt();
        }

        // Calculate Factorial with for loop
        for (int i=1; i<=n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
