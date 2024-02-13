import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create variables
        int maths, physics, turkish, history, music, sum;
        double gpa;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("1. Math grade: ");
        maths = inp.nextInt();
        System.out.print("2. Physics grade: ");
        physics = inp.nextInt();
        System.out.print("3. Turkish grade: ");
        turkish = inp.nextInt();
        System.out.print("4. History grade: ");
        history = inp.nextInt();
        System.out.print("5. Music grade: ");
        music = inp.nextInt();

        //Calculate GPA
        sum = (maths + physics + turkish + history + music);
        gpa = sum/5.0; //GPA is double

        //Checking the result
        String result = (gpa >= 60 ) ? "Passed" : "Couldn't Passed";
        System.out.print("Your GPA: " + gpa + "   Final Result: " + result);
    }
}