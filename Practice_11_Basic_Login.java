/*
Basic Login with java
If the password is incorrect, ask the user if they want to reset their password.
If the user wants to reset, check that the newly entered password
should not be the same as the "incorrectly entered" or "forgotten password".
If the passwords are the same, "The password could not be created."
If not the same, "Password has been created"
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName = "patika", password = "java123", reset, wrongPassword, newPassword;
        Scanner s = new Scanner(System.in);

        System.out.print("User Name: ");
        String inputUserName = s.nextLine();

        System.out.print("Password: ");
        String inputPassword = s.nextLine();

        if (inputUserName.equals(userName) && inputPassword.equals(password)){
            System.out.println("Login Success !");
        }

        else if (inputUserName.equals(userName)) {
            wrongPassword = inputPassword;
            System.out.println("Invalid Password!");

            System.out.println("Reset your password? (Y)/(N): ");
            reset = s.nextLine();

            if (reset.equals("Y") || (reset.equals("y"))){
                System.out.print("Enter your new password: ");
                newPassword = s.nextLine();

                if ((newPassword.equals(password)) || (newPassword.equals(wrongPassword))){
                    System.out.println("Your password cannot be the same as your previous password");
                }else {
                    System.out.println("New password successfully created");
                }
            }else{
                System.out.println("Goodbye for now!");
            }

        } else if (inputPassword.equals(password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }
}
