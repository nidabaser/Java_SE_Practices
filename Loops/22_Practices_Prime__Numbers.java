public class Main {

    public static void main(String[] args) {
        
        System.out.println("1 ile 100 arasındaki asal sayılar:");
        
        // Dış döngü 2'den 100'e kadar (2 en küçük asal sayı)
        for (int i = 2; i <= 100; i++) {
            
            // Asallık kontrolü için değişken tanımlayalım
            boolean asal = true;
            
            // İç döngü 2'den i'nin yarısına kadar dönmesi yeterli
            for (int j = 2; j <= i / 2; j++) {
                
                // Sayıya tam bölünüp bölünmediğini kontrol edelim
                if (i % j == 0) {
                    
                    // Bölünüyorsa asal false
                    asal = false;
                    break;
                }
            }
            
            // Dıştaki for döngüsünün içindeyiz burada asal sayıları yazdıralım
            // asal = true ise yazacak asal = false ise yazmayacak
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
