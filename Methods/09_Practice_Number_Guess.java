import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create random object
        Random rand = new Random();
        // Create random number
        int number = rand.nextInt(100);
        // or int number = (int) (Math.random() * 100);
      
        Scanner input = new Scanner(System.in);
      
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Guess the number : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter number between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("Too many incorrect entries. Remaining : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your rights will be decrease with another incorrect entry");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! The guessed number is : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Entered incorrect number !");
                if (selected > number) {
                    System.out.println(selected + " is bigger than secret number.");
                } else {
                    System.out.println(selected + " is smaller than secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Game Over ! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }

    }
}
