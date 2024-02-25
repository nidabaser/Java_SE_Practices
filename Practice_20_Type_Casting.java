public class Main {
    public static void main(String[] args)     {

        // Declare variables
        int intSayi = 321;
        double doubleSayi = 12.75;
        String stringSayi = "125";

        // Tam sayıyı ondalıklı sayıya dönüştürme
        double intToDoubleSayi = intSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int doubleToIntSayi = (int) doubleSayi;

        // String den tam sayıya parseInt metodu ile dönüştürme
        int stringToIntSayi = Integer.parseInt(stringSayi);

        // Tam sayıdan String e toString metodu ile dönüştürme
        String intToString = Integer.toString(intSayi);

        // Print Results
        System.out.println("Tam sayıyı ondalıklıya dönüştürme sonucu: " + intToDoubleSayi);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme sonucu: " + doubleToIntSayi);
        System.out.println("String den tam sayıya dönüştürme sonucu: " + stringToIntSayi);
        System.out.println("Tam sayıdan String e dönüştürme sonucu: " + intToString);
        
    }
}
