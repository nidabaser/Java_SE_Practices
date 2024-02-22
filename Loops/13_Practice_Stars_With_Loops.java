/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) { // Satır sayısıyla ilgili döngü

            for (int j = 1; j <= (n - i); j++) { // Başındaki boşluk sayısıyla ilgili döngü
                System.out.print(" ");
            }

            for (int k = 1; k <= ((2 * i) - 1); k++) { //Yıldızlarla ilgili döngü
                System.out.print("*");
            }

            System.out.println(); // Bir satır bittiğinde alta geçmek için

        }
    }
}

/* RESULT:

     * 
    *** 
   ***** 
  ******* 
 ********* 
***********

*/
