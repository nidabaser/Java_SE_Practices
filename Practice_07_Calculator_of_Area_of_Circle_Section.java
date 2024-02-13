import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calculator of the area of a circle section
        //whose radius is r and central angle is 𝛼.

        //Create variables
        int r;
        double pi = 3.14, 𝛼;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Enter the radius of the circle: ");
        r = inp.nextInt();
        System.out.print("Enter the measure of the center angle of the circle: ");
        𝛼 = inp.nextDouble();

        //Calculate the area of a circle section
        double circleSection = ((pi * (r*r) * 𝛼) / 360);

        //Result
        System.out.println("Area of a circle segment: " + circleSection);
    }
}