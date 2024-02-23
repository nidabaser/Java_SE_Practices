import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int gcd = 1;

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        for (int j = num1; j >= 1; j--) {
            if (num1 % j == 0 && num2 % j == 0) {
                gcd = j;
                break;
            }
        }
        
        System.out.println("GCD = " + gcd);

    }
}
