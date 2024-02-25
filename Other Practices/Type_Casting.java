/*
Yazılım geliştirmede, veri tiplerini birbirine dönüştürme ihtiyacı sıkça karşımıza çıkar.
Java gibi dillerde bu işlem "casting" (tip dönüştürme) olarak adlandırılır.
İki tip tip dönüştürme vardır: Otomatik Tip Dönüşümü ve Explicit Tip Dönüşümü.
*/

/*
1. Otomatik Tip Dönüşümü (Implicit Casting):
Bir veri tipini, daha geniş bir veri tipine dönüştürmek genellikle güvenlidir
çünkü geniş veri tipi daha dar olanı kapsar. Bu tür dönüşümler otomatik olarak gerçekleşir.
*/

//Örnek
int myInt = 9;
double myDouble = myInt;        // Otomatik dönüşüm int'ten double'a
System.out.println(myInt);      // Çıktı: 9
System.out.println(myDouble);   // Çıktı: 9.0

//Örnek
int sayi = 42;
double ondalikliSayi = sayi;
System.out.println(sayi);          // Çıktı: 42
System.out.println(ondalikliSayi); // Çıktı: 42.0

//Bu örnekte, int veri tipi double veri tipine otomatik olarak dönüştürülmüştür.

/*
2. Explicit Tip Dönüşümü (Explicit Casting):
Daha geniş bir veri tipini daha dar bir veri tipine dönüştürmek, veri kaybına neden olabilir
çünkü daha dar tip geniş olanı kapsayamayabilir. Bu yüzden, bu tür dönüşümler explicit (açıkça) yapılmalıdır.
*/

//Örnek
double myDouble = 9.78;
int myInt = (int) myDouble;     // Explicit dönüşüm double'dan int'e
System.out.println(myDouble);   // Çıktı: 9.78
System.out.println(myInt);      // Çıktı: 9

//Örnek
double ondalikliSayi = 42.7;
int sayi = (int) ondalikliSayi;
System.out.println(ondalikliSayi); // Çıktı: 42.7
System.out.println(sayi);          // Çıktı: 42 (ondalık kısım kaybedilir)

//Örnek
char karakter = 'A';
int asciiDeger = karakter;
System.out.println(karakter);   // Çıktı: A
System.out.println(asciiDeger); // Çıktı: 65

//Örnek
int asciiDeger = 97;
char karakter = (char) asciiDeger;
System.out.println(asciiDeger);     // Çıktı: 97
System.out.println(karakter);       // Çıktı: a

//Örnek
long buyukSayi = 130L;
byte byteDeger = (byte) buyukSayi;
System.out.println(buyukSayi);     // Çıktı: 130
System.out.println(byteDeger);     // Çıktı: -126 (Byte tipinin sınırlarını aştığı için hatalı dönüşüm oluşur)

//Bu kod örnekleri, farklı veri tipleri arasında nasıl tip dönüşümü (casting) yapılacağını göstermektedir.
//Bu işlemler sırasında, veri kaybının önüne geçmek için dikkatli olunması gerektiğini unutmayın.
