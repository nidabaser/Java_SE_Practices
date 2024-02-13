import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VAT:Value-added Tax Calculator Program

        //Create variable
        double amount_without_VAT, amount_with_VAT, VAT_Amount, VAT_rate_1 = 0.18, VAT_rate_2 = 0.8;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Money amount: ");
        amount_without_VAT = inp.nextDouble();

        //Calculate VAT
        if(amount_without_VAT > 0 && amount_without_VAT < 1000) {
            VAT_Amount = (amount_without_VAT * VAT_rate_1);
            amount_with_VAT = amount_without_VAT + VAT_Amount;
            System.out.println("Amount without VAT: " + amount_without_VAT);
            System.out.println("VAT Rate: " + VAT_rate_1);
        }else{
            VAT_Amount = (amount_without_VAT * VAT_rate_2);
            amount_with_VAT = amount_without_VAT + VAT_Amount;
            System.out.println("Amount without VAT: " + amount_without_VAT);
            System.out.println("VAT Rate: " + VAT_rate_2);
        }
        //Results
        System.out.println("VAT Amount: " + VAT_Amount);
        System.out.println("Amount with VAT: " + amount_with_VAT);
    }
}