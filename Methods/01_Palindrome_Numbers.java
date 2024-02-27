public class Main {
    static boolean isPalindrome (int num) {

        int temp = num, reverseNum = 0, lastNumber;

        while(temp != 0){
            System.out.println("**********************");
            System.out.println("Number : " + temp);

            lastNumber = temp % 10;
            System.out.println("Last digit: " + lastNumber);

            reverseNum = (reverseNum * 10) + lastNumber;
            System.out.println("New number: " + reverseNum);

            temp /= 10;
        }
      
        if (num == reverseNum)
           return true;
        else 
          return false;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(1221));
    }
}
