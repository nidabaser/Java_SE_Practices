import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int lcm = 1, max;

        System.out.print("First number: ");
        int num1 = scan.nextInt();
        System.out.print("Second number: ");
        int num2 = scan.nextInt();
        
        max = num1 * num2;
        
        // Eğer iki sayı aralarında asal ise ekok bu iki sayının çarpımlarıdır.

        for (int i = 1; i <= max; i++){
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        
        System.out.println("LCM = " + lcm);
        
    }
}
