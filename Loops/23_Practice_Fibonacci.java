/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını alalım
        System.out.print("Eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        // Fibonacci dizisinin ilk ve ikinci elemanlarını değişkenlere atayalım
        int ilkSayi = 0, ikinciSayi = 1;

        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisini yazdıralım:");

        // 1'den girilen eleman sayısına kadar döngü
        for (int i = 1; i <= elemanSayisi; i++) {

            // Fibonacci kuralı gereği: sayi1+sayi2=sayi3
            int sonrakiSayi = ilkSayi + ikinciSayi;

            // Fibonacci dizisini ekrana yazdıralım
            System.out.print(ilkSayi + " + " + ikinciSayi + " = " + sonrakiSayi + "\n" );

            // Birinci sayıyı artık ikinci sayıya atayalım
            // ve ikinci sayıyı da artık üçüncü sayıya atayalım
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;

            // Döngünün her adımında sayılar güncellenecek
            // Eleman sayısına ulaşıldığında duracak
        }

    }
}
