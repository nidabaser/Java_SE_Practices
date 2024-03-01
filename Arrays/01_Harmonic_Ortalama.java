/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void main(String[] args) {

        // Diziyi tanımlayalım
        int[] numbers = {1, 2, 3, 4, 5};

        // harmonik seri ve harmonik ortalama için değişken tanımlayalım
        double harmonic = 0.0, ortalama = 0.0;

        // for döngüsü yardımıyla harmonic seriyi ve ortalamasını hesaplayalım
        for (int i = 0; i < numbers.length; i++) {
            harmonic += ((double) 1 / numbers[i]);
            ortalama = numbers.length / harmonic;  //FORMUL: n(eleman sayısı) / elemanların harmonik serisi
        }

        // Sonucu yazdıralım
        System.out.println("Harmonik Ortalama: " + ortalama);
    }
}
