import java.util.Scanner;

public class Main {

// Define static boolean method
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get value from user
        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();

        // Call method
        System.out.println("is Palindrome? ==>>  " + isPalindrome(input));

    }
}
