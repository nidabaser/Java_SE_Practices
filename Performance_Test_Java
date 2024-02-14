public class Main {
    public static void main(String[] args){
        int n = 1000000;
        long startTime1 = System.currentTimeMillis();
//BİRİNCİ YÖNTEM
        String result1 = "";
        for (int i=0; i<n; i++){
            result1 += "a";
// Birinci döngüde her seferinde string ifade yeniden yaratılmaktadır
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
//İKİNCİ YÖNTEM
        StringBuilder result2 = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            result2.append("a");
// İkinci döngüde ise mevcut nesne her adımda yeniden yaratılmaz, sadece değiştirilmektedir.
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
//StringBuilder ise nesne üzerinde değişiklik yapar, bu da bellek ve performans açısından daha etkili bir yöntemdir.
    }
}
