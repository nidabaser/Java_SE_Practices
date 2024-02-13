import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        //Hypotenuse Calculator

        //Create variable
        int a, b;
        double hypotenuse;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("First perpendicular side of triangle: ");
        a = inp.nextInt();
        System.out.print("Second perpendicular side of triangle: ");
        b = inp.nextInt();

        //Calculate Hypotenuse
        hypotenuse = sqrt(a*a + b*b);

        //Results
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}