/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Declare variable and prompting input
        System.out.print("Please enter number of rows: ");
        int num = scan.nextInt();

        // Satır sayısı için azalan bir dış döngü
        for(int row = num; row >= 1; row--){

            // Her satırdaki yıldız sayısı, satır sayısının 2 katından 1 eksik olacak şekilde iç döngü
            for(int stars = 1; stars <= (2*row-1); stars++) {
                System.out.print("*");
            }

            // Bir alt satıra geçmek için boşluk yazdırma
            System.out.println(" ");
        }
    }
}
