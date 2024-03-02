import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısı n: ");
        int n = s.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i+1 + ". Eleman: ");
            int eleman = s.nextInt();
            dizi[i] += eleman;
        }

        Arrays.sort(dizi);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(dizi));

    }
}
