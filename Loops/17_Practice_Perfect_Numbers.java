import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı isteyelim
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Pozitif sayı olup olmadığını kontrol edelim
        while (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin: ");
            sayi = scanner.nextInt();
        }

        //Bir sayının kendisi haricindeki pozitif tam sayı çarpanlarının (kalansız bölen sayıların)
        //toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        int toplam = 0;

        // Döngüyü sayi/2'ye kadar yapmak yeterli
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Sonuçları yazdıralım
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
