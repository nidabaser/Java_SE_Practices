public class Main {
    static int function(int number){

        if(number == 1){
            return 1;
        }

        int result = function(number-1) + number;
        System.out.println("Result : " + result);
        return result;
    }

    public static void main(String[] args){
        System.out.println(function(3));
    }

    // f(4) = f(3) + 4
    // f(3) = f(2) + 3
    // f(2) = f(1) + 2
    // f(1) = 1

    // f(n) = f(n-1) + n

}
