import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculator of Area and Perimeter of a Circle

        //Create variables
        int r;
        double pi = 3.14;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Enter the radius of the circle: ");
        r = inp.nextInt();

        //Calculate the area and perimeter of a circle
        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        //Result
        System.out.println("Area: " + area + " Perimeter: " + perimeter);
    }
}
