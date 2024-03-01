/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Tek boyutlu dizi tanımlama
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println("Dizi: " + Arrays.toString(list));

        // Sayı girişi
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();

        // Diziyi sort() metoduyla sıralı hale getirme
        Arrays.sort(list);
        //System.out.println("Sıralı dizi: " + Arrays.toString(list));

        // Kullanıcının girdiği sayıdan küçük elemanları başka bir diziye ekleme
        int kucukSayac = 0;
        for (int kucuk : list) {
            if (kucuk < n) {
                kucukSayac++;
            }
        }
        // Kullanıcının girdiği sayıdan büyük elemanları başka bir diziye ekleme
        int buyukSayac = 0;
        for (int buyuk : list) {
            if (buyuk > n) {
                buyukSayac++;
            }
        }

        // Bu dizilerin eleman sayıları sayac kadar olmalı ayrıca
        // copyOf() metoduyla sıralı listenin bir kopyası olmalılar
        int[] kucuklerList = Arrays.copyOf(list, kucukSayac);
        //System.out.println(Arrays.toString(kucuklerList));

        // Büyük olanların listeden kopyalanması için doğru aralık seçilmeli
        // copyOfRange kullanılmalı
        int[] buyuklerList = Arrays.copyOfRange(list, kucukSayac,list.length);
        //System.out.println(Arrays.toString(buyuklerList));

        // Kopya dizinin ilk elemanını max olarak atama
        int max = kucuklerList[0];
        int min = buyuklerList[buyuklerList.length - 1];


        // For each yapısı ile Listenin tüm elemanlarını gezme
        // En büyük ve en küçük sayıları belirleme
        for (int i : kucuklerList) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : buyuklerList) {
            if (i < min) {
                min = i;
            }
        }

        // Sonucu yazdırma
        System.out.println("Girdiğiniz sayıdan küçük olan en yakın sayı: " + max);
        System.out.println("Girdiğiniz sayıdan büyük olan en yakın sayı: " + min);


    }
}
