/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gcd = 1;

        System.out.println("Calculating GCD(Greatest Common Divisor) and LCM(Least Common Multiple)\n");

        System.out.print("Enter number one: ");
        int num1 = scan.nextInt();

        System.out.print("Enter number two: ");
        int num2 = scan.nextInt();

        //EBOB için while döngüsü
        int j = num1;
        while (j >= 1) {
            if (num1 % j == 0 && num2 % j == 0) {
                gcd = j;
                break;
            }
            j--;
        }

        //EKOK için formül ile hesaplama ve sonuçları yazdırma
        System.out.println("LCM = " + ((num1*num2)/gcd));
        System.out.println("GCD = " + gcd);

    }
}
