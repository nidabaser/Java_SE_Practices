import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ekok = 0;
        int max;

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        max = sayi1 * sayi2;

        int i = max;
        while (i > 0) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
                break; // EKOK bulunduğunda döngüden çık
            }
            i--;
        }

        System.out.println("Ekok = " + ekok);
    }
}
