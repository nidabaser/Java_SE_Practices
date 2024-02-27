// RECURSIVE FIBONACCI
// 1 1 2 3 5 8 13 21

// f(1) = 1
// f(2) = 1
// f(n) = f(n-1) + f(n-2)
// f(4) = f(3) + f(2)

public class Main {
    static int fibonacci (int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){

        System.out.println(fibonacci(5));

    }
}
