/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        // Eğer kullanıcı sayı adetini yanlış girmemişse hata mesajı yazdırıp,
        // While döngüsü ile geçerli bir sayı adeti girene kadar tekrar sayı girmesini istiyoruz
        while (n <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            n = scanner.nextInt();
        }

        // İlk sayıyı kullanıcıdan alıyoruz.
        System.out.print("1. Sayıyı giriniz: ");
        int number = scanner.nextInt();

        // İlk sayıyı hem minimum hem de maximum olarak atıyoruz.
        int min = number;
        int max = number;

        // Kullanıcıdan gelen diğer sayıları kontrol edip min ve max'ı ona göre güncelliyoruz.
        // Zaten ilk sayıyı aldığımız için döngüyü 2'den başlatıyoruz.
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = scanner.nextInt();

            // Girilen sayı, şu ana kadar görülen en küçük sayıdan küçükse min'i güncelliyoruz.
            if (number < min) {
                min = number;
            }

            // Girilen sayı, şu ana kadar görülen en büyük sayıdan büyükse max'ı güncelliyoruz.
            if (number > max) {
                max = number;
            }
        }

        // En küçük ve en büyük sayıları ekrana yazdırıyoruz.
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
