//Simple Horoscope Finder (without switch-case)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int month, day;
        String zodiac = "";
        Scanner s = new Scanner(System.in);
        
        System.out.print("(1)JAN - (2)FEB - (3)MAR\n(4)APR - (5)MAY - (6)JUN\n(7)JUL - (8)AUG - (9)SEP\n(10)OCT- (11)NOV- (12)DEC\nChoose your Month of Birth: ");
        month = s.nextInt();
        
        if (month >= 1 && month <= 12) {
            
            System.out.print("Enter your Day of birth: ");
            day = s.nextInt();

            if (day >= 1 && day <= 31){

                if ((month == 1 && day >= 22) || (month == 2 && day <= 19) ) {
                    zodiac = "Aquarius";
                }
                else if (( month == 2 && day <= 29) || (month == 3 && day <= 20) ) {
                    zodiac = "Pisces";
                }
                else if ((month == 3) || (month == 4 && day <= 20) ) {
                    zodiac = "Aries";
                }
                else if ((month == 4 && day != 31) || (month == 5 && day <= 21) ) {
                    zodiac = "Taurus";
                }
                else if ((month == 5) || (month == 6 && day <= 22) ) {
                    zodiac = "Gemini";
                }
                else if ((month == 6 && day != 31) || (month == 7 && day <= 22) ) {
                    zodiac = "Cancer";
                }
                else if ((month == 7) || (month == 8 && day <= 22) ) {
                    zodiac = "Leo";
                }
                else if ((month == 8) || (month == 9 && day <= 22) ) {
                    zodiac = "Virgo";
                }
                else if ((month == 9 && day != 31) || (month == 10 && day <= 22) ) {
                    zodiac = "Libra";
                }
                else if ((month == 10) || (month == 11 && day <= 22) ) {
                    zodiac = "Scorpio";
                }
                else if ((month == 11 && day != 31) || (month == 12 && day <= 21) ) {
                    zodiac = "Sagittarius";
                }
                else if ((month == 12) || (month == 1) ) {
                    zodiac = "Capricorn";
                }
                else {
                    System.out.println("Invalid Day");
                }
            } else {
                System.out.println("Invalid Day");
            }
        } else {
            System.out.println("Invalid Month");
        }
        System.out.println("Your zodiac sign is " + zodiac);
    }
}
