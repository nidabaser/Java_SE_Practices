/*
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        int n, sum = 0;
        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            n = s.nextInt();
            if (n % 2 != 0) {
                sum += n;
            }
        } while (n>0);
      
        System.out.println("Sum of odd numbers: " + sum);
    }
}
