import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (isPrime(sayi, sayi / 2)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }

    static boolean isPrime(int sayi, int bolen) {
        if (bolen < 2) {
            return true;  // 2'den küçük bölünen yoksa sayı asaldır.
        }

        if (sayi % bolen == 0) {
            return false;  // Bolen, sayıyı tam bölebiliyorsa sayı asal değildir.
        }

        return isPrime(sayi, bolen - 1);  // Recursive olarak devam et.
    }
}
