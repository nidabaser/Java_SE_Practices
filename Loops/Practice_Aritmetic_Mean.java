import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Değişkenleri tanımla
        int counter = 0;
        double total = 0, mean;

        // Kullanıcıdan sayı al
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();

        // Döngüyü başlat
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                total += i;
                counter++;
            }
        }

        // Ortalamayı hesapla
        if (counter != 0) {
            mean = total / counter;
            System.out.println("Arithmetic Mean is: " + mean);
        } else {
            System.out.println("No eligible numbers to calculate the mean.");
        }

        /*
        NOT: Ödev sayfasında döngü yapısı için 0'dan girilen sayıya kadar denilmiş.
        Bu durumda girilen sayı dahil edilmemiş oluyordu, ben 1'den başlattım.
        Eğer 0'dan başlatacaksak, n değil, (n+1)'e kadar arttırılırsa
        girilen sayı dahil edilmiş olur: for (int i=0; i<=(n+1); i++)
        */
    }
}
