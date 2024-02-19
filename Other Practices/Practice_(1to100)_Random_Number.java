import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int number;
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(100);
            System.out.println(number);
        }
    }
}
