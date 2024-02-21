//VAT:Value-added Tax Calculator Program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Create variable
        double amount, taxAmount, taxRate1 = 0.18, taxRate2 = 0.8;

        //Define Scanner class
        Scanner inp = new Scanner(System.in);

        //Take inputs from user
        System.out.print("Money amount: ");
        amount = inp.nextDouble();

        //Calculate VAT
        if(amount > 0 && amount < 1000) {
            taxAmount = (amount * taxRate1);
            amount = amount + taxAmount;
            System.out.println("Amount without VAT: " + amount);
            System.out.println("VAT Rate: " + taxRate1);
        }else{
            taxAmount = (amount * taxRate2);
            amount = amount + taxAmount;
            System.out.println("Amount without VAT: " + amount);
            System.out.println("VAT Rate: " + taxRate2);
        }
        //Results
        System.out.println("VAT Amount: " + taxAmount);
        System.out.println("Amount with VAT: " + amount);
    }
}
