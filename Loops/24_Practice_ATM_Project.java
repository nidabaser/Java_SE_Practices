/**
 * @author Nida Başer
 * February 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare Variables
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        // Giriş hakkı sıfır olana dek while döngüsü kullanıcı adı ve şifre isteyecek
        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            // Kullanıcı adı ve şifre doğruluk kontrolü
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                // Çıkış yap seçeneği seçilmediği sürece çalışacak menü için do-while döngüsü
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    // ATM işlemleri SWITCH-CASE yapısı içinde yer almaktadır
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
                            break;
                    }

                    // Çıkış yapmak için 4 seçilince break komutu ile döngü durur
                } while (select != 4);
                break;

                // Kullanıcı adı veya şifrenin hatalı olması durumunda giriş hakkı 1 azalacak
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                // Eğer giriş hakkı sıfır olursa hesap bloke bilgilendirmesi
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");

                    // Henüz sıfır olmadıysa kalan hak sayısı yazdırılır
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
