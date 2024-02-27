public class Main {
    public static void main(String[] args) {
      
        sequence(16);
    }
  
    public static void sequence(int num){
        
        if(num <= 0){
            System.out.print(num + " ");
            return;
        }
      
        System.out.print(num + " ");
      
        sequence(num - 5); // Metodu yeniden çağırdığımız için
        // alt satıra geçmeyecek metoda dönecek ve
        // metodun şartı sağlanınca alt satırı yazdırıp sonlanacak
      
        System.out.print(num + " ");
    }
}
