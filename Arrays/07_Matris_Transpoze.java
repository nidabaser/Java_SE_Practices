/**
 * @author Nida Başer
 * March 2024
 */
public class Main {

    // Matrisi ekrana yazdırmak için yardımcı metod oluşturalım
    // Bu metodun aldığı parametre 2 boyutlu matrisimiz olsun
    public static void matrisiYazdir(int[][] matris) {

        // Matrisin elemanlarını gezmek için iç içe for döngüsü
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {

                // Matrisin elemanlarını aralarında tab miktarı boşlukla yazdıralım
                System.out.print(matris[i][j] + "\t");
            }

            // Bir alt satıra geçiş
            System.out.println();
        }
        System.out.println();
    }

    // Matrisin transpozunu almak için yardımcı bir metod oluşturalım
    // Bu metodun aldığı parametre de 2 boyutlu matrisimiz olsun
    public static int[][] transpozuAl(int[][] matris) {

        // Satır sayısı ve sütun sayısını değişkenlere atayalım
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Satır ve sütun sayısına göre transpoz için yeni bir matris tanımlayalım
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        // Matrisin satır ve sütun sayılarına kadar dönecek iç içe for döngüleri
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {

                // Matriste [0][1] konumundaki elemanı, transpozda [1][0] konumuna atama işlemi
                transpozMatris[j][i] = matris[i][j];
            }
        }
        // 2 boyutlu transpoz matrisi döndür
        return transpozMatris;
    }

    public static void main(String[] args) {
        // Örnek bir matris oluşturalım
        int[][] matris = { {2, 3, 4}, {5, 6, 4} };

        // Matrisi yazdırmak için "matrisiYazdir" diye bir metod oluşturup çağıralım
        System.out.println("Girilen Matris:");
        matrisiYazdir(matris);

        // Transpozunu saklamak için yeni bir 2 boyutlu dizi oluşturup
        // bu diziyi "transpozuAl" metodunun döndüreceği sonuca atayalım
        int[][] transpozMatris = transpozuAl(matris);

        // Matrisin transpozunu yazdıralım:
        System.out.println("Matrisin Transpozu:");
        matrisiYazdir(transpozMatris);
    }
}
