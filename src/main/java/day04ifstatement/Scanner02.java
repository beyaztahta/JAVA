package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    /*
       Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
            Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
       Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
             Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir,
              o da olmazsa hata verir.
    */
    public static void main(String[] args) {

       //Example 1: Kullanıcıdan ilk ve sıy ismini alınız,ilk ve soy isminin ilk harflerini ekrana yazdırınz.
        //   Ali Can==> AC
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");//A
        char ilk = input.next().charAt(0);
        System.out.println("soy isminizi giriniz");//C
        char son = input.next().charAt(0);
        System.out.println(""+ilk + son);

        //2.yol
        System.out.println("Tam isminizi giriniz.");//AliCan
        String tamIsım = input.nextLine();
        char ilkHarf = tamIsım.charAt(0);
        System.out.print(ilkHarf);
        char soyIsmınIlkHarfı = tamIsım.split( "")[1].charAt(0);
        System.out.println(soyIsmınIlkHarfı);


    }
}
