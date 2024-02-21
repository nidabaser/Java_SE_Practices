//Basic Flight Ticket Price Calculation
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Create Variables
        int age;
        double distance, perKm = 0.10, normalAmount, discountedAmount,totalAmount;
        boolean isOneWay;

        //Define Scanner class
        Scanner s = new Scanner(System.in);
        System.out.println("|Welcome to basic flight ticket price calculator!|");
        System.out.println("Please enter necessary data about your flight.");

        //Take inputs from user
        System.out.println("- Enter the distance (KM): ");
        distance = s.nextInt();
        System.out.println("- Enter your age: ");
        age = s.nextInt();
        System.out.println("- One Way Ticket? [1] \n- Round-Trip Ticket? [2]");

        //Biletin tipini kontrol ederken ekstra if-else kullanmamak için boolean olarak tanımladım
        int ticketType = s.nextInt();
        isOneWay = ticketType == 1;

        //Check inputs
        if (distance < 0 || age < 0) {

            System.out.println("Invalid Data");

        } else {

            //Calculate normal ticket price
            normalAmount = distance * perKm;

            if (age < 12) {

                discountedAmount = (normalAmount - (normalAmount*0.5));

                // Bilet tipi yukarıda boolean tanımlandığı için artık ternary operatorle kontrol edilebilir.
                totalAmount = isOneWay ? discountedAmount : ((discountedAmount - (discountedAmount*0.2))*2);
                System.out.println("Total Amount: " + totalAmount);

            } else if (age < 24) {
                discountedAmount = (normalAmount - (normalAmount*0.1));
                totalAmount = isOneWay ? discountedAmount : ((discountedAmount - (discountedAmount*0.2))*2);
                System.out.println("Total Amount: " + totalAmount);

            } else if (age > 65) {
                discountedAmount = (normalAmount - (normalAmount*0.3));
                totalAmount = isOneWay ? discountedAmount : ((discountedAmount - (discountedAmount*0.2))*2);
                System.out.println("Total Amount: " + totalAmount);

            } else {
                totalAmount = isOneWay ? normalAmount : ((normalAmount - (normalAmount*0.2))*2);
                System.out.println("Total Amount: " + totalAmount);
            }
        }
    }
}
