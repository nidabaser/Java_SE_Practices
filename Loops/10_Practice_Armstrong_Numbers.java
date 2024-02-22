/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Armstrong Numbers

        //Scanner Class
        Scanner s = new Scanner(System.in);

        System.out.println("*-* Welcome to Armstrong number calculator *-*");
        System.out.print("Enter positive number: ");

        // Define Variables
        int number = s.nextInt();
        int numberOfDigits = 0, currentDigit, digitExponent, result = 0;

        // Assigning the value of the number to a temporary variable
        // This way we don't lose the original number
        int temporaryNumber = number;

        // Find number of digits
        while ( temporaryNumber != 0 ) {
            temporaryNumber /= 10;
            numberOfDigits++;
        }

        // Assigning the value to a temporary variable again
        temporaryNumber = number;

        //Finding the last digit of number
        while (temporaryNumber != 0) {
            currentDigit = temporaryNumber % 10;
            digitExponent = 1;

            // Calculate the exponentiation of each digit
            for (int i = 1; i <= numberOfDigits; i++ ) {
                digitExponent *= currentDigit;
            }

            // Add the result of each digit's exponentiation
            result += digitExponent;
            temporaryNumber /= 10;
        }

        // Print the result
        if (result == number) {
            System.out.println("Result is: " + result + ", its an Armstrong number");
        } else {
            System.out.println("Result is: " + result + ", its not an Armstrong number");
        }
    }
}
