import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        // A program that calculates the area of triangle
        // whose three sides are entered by user.

        //Create variables
        double a, b, c, u, area;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("First side of triangle: ");
        a = inp.nextInt();
        System.out.print("Second side of triangle: ");
        b = inp.nextInt();
        System.out.print("Third side of triangle: ");
        c = inp.nextInt();

        //Calculate Area
        //Perimeter of a Triangle = 2*u
        u = (a + b + c) / 2;
        area = sqrt( u * (u-a) * (u-b) * (u-c) );

        //Results
        System.out.println("Area of Triangle: " + area);
    }
}
