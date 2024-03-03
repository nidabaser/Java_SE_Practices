/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Liste: " + Arrays.toString(list));

        // Vakit kazanmak için sort metoduyla listeyi sıralayalım.
        Arrays.sort(list);
        System.out.println("Sıralanmış liste: " + Arrays.toString(list));

        // Kaç kere tekrar edildiğini saklamak için değişken oluşturalım.
        // Listede en az bir defa yer alan sayılar için 1'den başlayalım
        int tekrarSayisi = 1;

        // Döngüleri listenin sıralı bir liste olduğunu dikkate alarak oluşturalım
        for (int i = 1; i < list.length; i++) {

            // Mesela bir önceki eleman bir sonrali elemana eşitse tekrar etmiş demektir.
            if ( list[i-1] == list[i] ) {
                tekrarSayisi++;

            } else { // değilse tekrar etmemiştir çünkü liste zaten sıralıdır

                if (tekrarSayisi > 0) {
                    System.out.println(list[i-1] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
                }
                tekrarSayisi = 1;
            }
        }

        // Listenin son elemanını kontrol edelim:
        if (tekrarSayisi > 0) {
            System.out.println(list[list.length-1] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
        }
    }
}
