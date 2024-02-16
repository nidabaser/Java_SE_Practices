//Chinese Zodiac Calculator
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create Variables
        int birthYear, mod;
        String zodiac="";
        //Define Scanner class
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your birth year: ");
        birthYear = s.nextInt();
        //Calculate chinese zodiac
        if (birthYear>1900){
           mod = birthYear % 12;
           switch(mod){
               case 0:
                   zodiac = "Monkey"; break;
               case 1:
                   zodiac = "Cock"; break;
               case 2:
                   zodiac = "Dog"; break;
               case 3:
                   zodiac = "Pig"; break;
               case 4:
                   zodiac = "Mouse"; break;
               case 5:
                   zodiac = "Ox"; break;
               case 6:
                   zodiac = "Tiger"; break;
               case 7:
                   zodiac = "Rabbit"; break;
               case 8:
                   zodiac = "Dragon"; break;
               case 9:
                   zodiac = "Snake"; break;
               case 10:
                   zodiac = "Horse"; break;
               case 11:
                   zodiac = "Sheep"; break;
           }
            System.out.println("Your chinese zodiac is: " + zodiac);
        } else {
            System.out.println("Invalid Birth Year");
        }
    }
}







