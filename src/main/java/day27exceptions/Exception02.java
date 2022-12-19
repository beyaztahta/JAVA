package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
    /*
    1)     FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt") "new" den sonraki "FileInputStream" kısım hata
    verir.Cunku; biz Java'ya verilen adresteki dosyaya git dedik, Java iki endiseye kapildi
            i)Ya adres yanlissa
            ii)Ya verilen adreste dosya yoksa
       Biz "method isminde" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
       olusursa "Exception at" dedik.

     2) while ((k = fis.read()) !=-1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosyadaki karakterleri oku dedik.
     Java bir endiseye kapildi  i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
     Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Excepiton at" dedik.

     3)Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException" ı siler. Çünkü;
       "IOException", "FileNotFoundException" ı kapsar. "IOException", "FileNotFoundException" ın parent'ıdır, onun yaptığı
       her şeyi yapabilir, o yüzden "IOException" varken "FileNotFoundException" a gerek yoktur.

     4) "IOException" ,"Input Output Exception" demektir.
     5)Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
       Bu tarz Excepiton'lara "Compile Time Exception" denir, diger adlari "Checked Excepiton"Dir.

       "Compile Time Exception" kesinlikle halledilmelidir(expection handling),halletmeden kod yazmaya devam etmeyiniz.
     */
    public static void main(String[] args) throws IOException {
        readTheTextFromFile();

        readTheText();

    }//Bir text file daki text i okuyan kodu yazınız.

    //1.yol
    public static void readTheTextFromFile() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

        int k = 0;

        while ((k = fis.read()) != -1) {

            System.out.print((char) k);

        }

    }
    //2.yol

    public static void readTheText() {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }

    }
}