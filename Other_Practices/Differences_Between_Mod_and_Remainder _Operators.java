public class Main {
    public static void main(String[] args) {

        //Differences Between Mod and Remainder Operators
        int remainder = 11%3; //Try (-11,3),(-11,-3),(11,-3)
        int mod = Math.floorMod(11,3);//Try (-11,3),(-11,-3),(11,-3)
        //See the difference:
        System.out.println("Remainder: "+remainder);
        System.out.println("Mod: "+mod);
    }
}
