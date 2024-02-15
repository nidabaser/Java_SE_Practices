import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, choice;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        n1 = s.nextInt();
        System.out.println("Enter the second number: ");
        n2 = s.nextInt();

        System.out.println("Your numbers are " + n1 + " and " + n2);

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.print("What is your choice: ");
        choice = s.nextInt();

        switch (choice){
            case 1:
                System.out.println("Addition is: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction is: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication is: " + (n1 * n2));
                break;
            case 4:
                if(n1!=0 && n2!=0){
                    System.out.println("Division is: " + (n1 / n2));
                }else{
                    System.out.println(" Number cannot be divided by zero ");
                }
                break;
            default:
                System.out.println("Wrong Choice, Please try again");
                break;
        }
    }
}
