/**
 * @author Nida Başer
 * February 2024
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();

        System.out.println("Powers of 2: ");

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}
