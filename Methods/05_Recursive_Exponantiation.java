import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        int sonuc = usAlma(taban, us); // Fonksiyonun çağrılması

        System.out.println("Sonuç: " + sonuc);
    }

    static int usAlma(int taban, int us) {
        
        if (us == 0) {
            return 1;  // Durdurma şartı Üs değeri 0 ise sonuç 1'dir.
            
        } else {
            return taban * usAlma ( taban, (us - 1) );// Özyinelemeli üs alma
        }
    }
}
