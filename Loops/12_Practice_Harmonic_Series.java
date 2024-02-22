/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        
        //Result ve i değişkenlerini double tanımladık.
        
        double result = 0.0;
        
        for (double i = 1; i <= number; i++) {
            result += (1/i);
        }
        
        System.out.println("Harmonic series of entered number = " + result);
    }
}
