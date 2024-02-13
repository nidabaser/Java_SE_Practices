import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Taximeter Calculator

        //Create variables
        int km;
        double perKm = 2.20, totalAmount = 10; //Opening Fee is 10

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Enter the distance in kilometers: ");
        km = inp.nextInt();

        //Calculate
        totalAmount += (km * perKm);
        totalAmount = (totalAmount < 20) ? 20 : totalAmount; //minimum payable amount is 20

        //Result
        System.out.println("Taximeter total amount: " + totalAmount);
    }
}
