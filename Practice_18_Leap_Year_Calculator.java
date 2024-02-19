//Leap Year Calculator
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter year = ");
        year = s.nextInt();

        //Checking if the year is divisible by 4 and not divisible by 100, or if the year is divisible by 400.
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
