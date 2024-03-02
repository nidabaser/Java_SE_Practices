import java.util.Arrays;
/**
 * @author Nida Başer
 * March 2024
 */
public class Main {

    static boolean isFind(int [] arr, int value) {
        for (int i:arr) {
            if (i==value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        // Çift sayıları tespit için listeye ekleme yaptım
        int[] list = {3, 7, 2, 3, 2, 9, 10, 21, 1, 33, 9, 1, 4, 5, 6, 4, 6, 11, 8};
        int[] copyList = new int[list.length];

        int beginIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j] && (list[i] % 2 == 0) )) { // Çift sayılar için şart eklendi

                    if (!isFind(copyList, list[i])) { // Tekrar eden elemanları copy diziye her seferinde eklemesin diye
                        // Eğer bir eleman tekrar ettiği için daha önce eklendiyse diye kontrol

                        copyList[beginIndex++] = list[i]; // Hem indeks artırma,
                        // hem o indekse eleman atama işlemi, aynı anda bu satırda
                    }
                    break;
                }
            }
        }

        // copyList'in uzunluğu list.length old. için içindeki boş yerler 0 olarak gözüküyor
        // Sıfırları yazmamak için eleman sıfıra eşit değilse değeri yazdırıyoruz
        System.out.println("Dizinin içinde tekrar eden çift sayılar şunlardır: ");
        for (int value : copyList) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}
