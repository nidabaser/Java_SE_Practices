import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ebob = 0;

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
      
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        if (sayi1<sayi2) {
          for(int i = 1; i < sayi1; i++)
        {
            if(sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);
        } else {
          System.out.println("1.Sayı, 2.Sayıdan küçük girilmeli.");
        }
    }
}
