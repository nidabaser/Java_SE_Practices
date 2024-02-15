/*
Basic Grade Average Calculator without loops
Lessons: Mathematics, Physics, Turkish, Chemistry, Music
Passing Score: 55
If the course grades entered are not between 0 or 100, do not add them to the average.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create variables and a counter
        float math, physics, turkish, chemistry, music, result;
        int counter = 5;

        //Define Scanner class
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Math Grade: ");
        math = s.nextFloat();
        if(math<=0 || math>100){
            System.out.println("Invalid!");
            counter -= 1;
            math = 0;
        }

        System.out.print("Enter Physics Grade: ");
        physics = s.nextFloat();
        if(physics<=0 || physics>100){
            System.out.println("Invalid!");
            counter-=1;
            physics = 0;
        }
        System.out.print("Enter Turkish Grade: ");
        turkish = s.nextFloat();
        if(turkish<=0 || turkish>100){
            System.out.println("Invalid!");
            counter-=1;
            turkish = 0;
        }
        System.out.print("Enter Chemistry Grade: ");
        chemistry = s.nextFloat();
        if(chemistry<=0 || chemistry>100){
            System.out.println("Invalid!");
            counter-=1;
            chemistry = 0;
        }
        System.out.print("Enter Music Grade: ");
        music = s.nextFloat();
        if(music<=0 || music>100){
            System.out.println("Invalid!");
            counter-=1;
            music = 0;
        }

        // Calculate average grade
        if(counter<=0) {
            result = 0;
        }else{
            result = ((math + physics + turkish + chemistry + music) / counter) ;
        }

        // Print result
        if(result >= 55){
            System.out.println("Congratulations! Passed the Class");
        }else{
            System.out.println("You failed! Your average grade is lower than 55");
        }
        System.out.println("Your average grade: "+ result);
    }
}
