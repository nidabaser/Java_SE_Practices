/**
 * @author Nida Başer
 * March 2024
 */
public class Main {
    int x;
    public static void main(String[] args) {
        int a=5;
        System.out.println("ilk deger: "+ a);
        degistir(a);
        System.out.println("son deger: "+ a);
        
        Main m1 = new Main();
        m1.x=10;
        System.out.println("ilk deger: " + m1.x);
        m1.degistir2(m1);
        System.out.println("son deger: " + m1.x);
        
        int[] dizi = {1,2,3,4,5};
        System.out.println("ilk: " + dizi[0]);
        degistir3(dizi);
        System.out.println("son: " + dizi[0]);
        
    }

    private static void degistir3(int[] dizi) {
        dizi[0] += 10;
    }

    private void degistir2(Main m1) {
        m1.x = m1.x + 10;
    }
    
    private static void degistir(int a) {
        a+=10;
    }
}
