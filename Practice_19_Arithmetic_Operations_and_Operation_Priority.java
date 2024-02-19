import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Calculate given operation
        //Pay attention for priority of operators
        
        System.out.println("Please enter first number: ");
        int num1 = s.nextInt();
        
        System.out.println("Please enter second number: ");
        int num2 = s.nextInt();
        
        System.out.println("Please enter third number: ");
        int num3 = s.nextInt();
        
        int operation = num1 + (num2 * num3) - num2;
        System.out.println("Result is: " + operation);
    }
}
