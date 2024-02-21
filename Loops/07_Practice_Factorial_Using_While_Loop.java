/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Faktöriyel Formula
        // n! = 1 * 2 * 3 * 4 * 5 *...* n

        //Scanner Class
        Scanner s = new Scanner(System.in);

        // Define Variables
        int inputNumber, factorial = 1;

        // Take input from user
        System.out.print("Enter factorial number: ");
        inputNumber = s.nextInt();

        // Check for positive number
        while (inputNumber <= 0) {
            System.out.print("Invalid number !\nEnter positive number: ");
            inputNumber = s.nextInt();
        }

        // Calculate Factorial using while loop
        int i=1;
        while (i <= inputNumber) {
            factorial *= i;
            i++;
        }
        System.out.println(inputNumber + "! = " + factorial);
    }
}
