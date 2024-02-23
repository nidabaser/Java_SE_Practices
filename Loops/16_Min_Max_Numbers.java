import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            return;
        }

        int sayi;
        System.out.print("1. Sayıyı giriniz: ");
        sayi = scanner.nextInt();

        int min = sayi;
        int max = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < min) {
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
