import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Grocery Cashier Program

        //Create variables
        double appleKg = 3.67, pearKg = 2.14, tomatoKg = 1.11, bananaKg = 0.95, aubergineKg = 5.0;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("How many kilos of apples: ");
        int apple = inp.nextInt();
        System.out.print("How many kilos of pears: ");
        int pears = inp.nextInt();
        System.out.print("How many kilos of tomatoes: ");
        int tomatoes = inp.nextInt();
        System.out.print("How many kilos of bananas: ");
        int bananas = inp.nextInt();
        System.out.print("How many kilos of aubergine: ");
        int aubergine = inp.nextInt();

        //Calculate the total amount
        double totalAmount = (apple*appleKg) + (pears*pearKg) + (tomatoes*tomatoKg) + (bananas*bananaKg) + (aubergine*aubergineKg);

        //Result
        System.out.println("Total Amount: " + totalAmount);
    }
}