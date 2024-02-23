/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare variable and prompting input
        Scanner input = new Scanner(System.in);
        System.out.print(" <*> Diamond with stars <*>\nPlease Enter number: ");
        int num = input.nextInt();

        // Top of Diamond
        // Üst üçgenin her bir satırı için bir dış döngü
        for (int row = 0; row <= num; row++) {

            // Her satırın başında bırakılacak boşluklar için iç döngü
            // Her satırda bir önceki satırdan daha az boşluk eklenir.
            for (int spaces = 0; spaces < (num - row); spaces++) {
                System.out.print(" ");
            }

            // Her satırda oluşturulacak yıldızlar için iç döngü
            // Yıldız sayısı (2*row+1) ile hesaplanır, bu sayede
            // her satırda yıldız sayısı tek sayıda artar.
            for (int stars = 1; stars <= (2 * row + 1); stars++) {
                System.out.print("*");
            }

            //Bir alt satıra geçmek için kod
            System.out.println(" ");
        }

        // Bottom of Diamond
        // Alt üçgenin her satırı için bir dış döngü
        // Bu sefer girilen sayıdan başlayıp 1'e kadar azalacak.
        for (int row = num; row >= 1; row--) {

            // Her satırın başında bırakılacak boşluklar için iç döngü
            // Her satırda bir önceki satırdan daha fazla boşluk eklenir.
            for (int spaces = 1; spaces <= (num - row + 1); spaces++) {
                System.out.print(" ");
            }

            // Her satırda oluşturulacak yıldızlar için iç döngü
            // Yıldız sayısı (2*i-1) ile hesaplanır, bu sayede
            // her satırda yıldız sayısı tek sayıda azalır.
            for (int stars = 1; stars <= (2 * row - 1); stars++) {
                System.out.print("*");
            }

            // Bir alt satıra geçmek için kod
            System.out.println(" ");
        }
    }
}
