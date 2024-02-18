import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ekok = 0;
        int max;

        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        max = sayi1 * sayi2;

/* Eğer iki sayı aralarında asal ise ekoku çarpımlarıdır. Yani iki sayının ekoku maximum çarpımlarıdır.*/

        for(int i = max; i > 0; i--)
        {
            if(i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
    }
}
