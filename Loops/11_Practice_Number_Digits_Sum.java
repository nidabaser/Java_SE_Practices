/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Negatif sayı girildiğinde de çalışması için eksi ile çarpıp pozitife çevirdim.
        if (number<0) {
            number = (-1) * number;
        }

        //Basamak sayısı toplamı için değişken
        int digitSum = 0;

        //Sayı sıfırdan olduğu sürece
        while (number > 0) {
            // Sayının birler basamağı alınır ve toplama eklenir
            digitSum += number % 10;
            // Sayının birler basamağından kurtulmak için 10'a bölünür
            number /= 10;
            //Bu döngü şart sağlanana kadar çalışır
        }

        System.out.println("Basamak sayılarının toplamı: " + digitSum);
    }
}
