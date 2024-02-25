import java.util.Scanner;

public class Main {
    public static void main(String[] args)     {

        Scanner s = new Scanner(System.in);

        // Kullanıcıdan veri girişi
        System.out.println("Bir tamsayı giriniz: ");
        int intSayi = s.nextInt();
        System.out.println("Bir ondalıklı sayı giriniz: ");
        double doubleSayi = s.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme
        double intToDoubleSayi = (double) intSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int doubleToIntSayi = (int) doubleSayi;

        // Sonuçları ekrana yazdırma
        System.out.println("Tam sayıyı ondalıklıya dönüştürme sonucu: " + intToDoubleSayi);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme sonucu: " + doubleToIntSayi);

    }
}
