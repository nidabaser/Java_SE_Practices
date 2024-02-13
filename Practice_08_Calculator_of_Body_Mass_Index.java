import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Body Mass Index Calculation

        //Create variables
        double h, w;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Enter height (m): ");
        h = inp.nextDouble();
        System.out.print("Enter weight (kg): ");
        w = inp.nextDouble();

        //Calculate the BMI
        double bmi = w/(h*h);

        //Result
        System.out.println("Body Mass Index: " + bmi);
    }
}