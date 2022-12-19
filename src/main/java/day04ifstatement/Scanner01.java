package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
        Kullacıdan ılk ,orta,ve soy ısmını,kımlık numarasını alınız ve asagıdakı formatta ekrana yazdırınız.
            Ali Mert Can
            123456789
         */
        //1.yol
        Scanner input = new Scanner(System.in);

        System.out.println("ılk isminizi giriniz.");
        String ılkIsım= input.next();//next() methodu kullanıcıdan String datası almakiçin kullanılır.

        System.out.println("orta isminizi giriniz.");
        String ortaIsım = input.next();

        System.out.println("soy isminizi giriniz.");
        String soyIsım = input.next();

        System.out.println("kimlik numarasını giriniz.");
        String kimlikNo = input.next();
        System.out.println(ılkIsım +" "+ ortaIsım +" "+soyIsım);
        System.out.println(kimlikNo);

        //2.yol
        System.out.println("İlk,orta ve soy isminizi ve kimlik numaranızı giriniz.");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();
        System.out.println(ilk+" "+orta+" "+soy);
        System.out.println(kimlik);
        /*
        next() ile nextLine() ın farkı nedir?
        next () methodu kullanıcıdan gelen stringin sadece ilk kelimesini alır,nextLine() methodukullanıcıdan
        gelen stringin tamamını alır.
         */
        //3.yol
        System.out.println("ilk,orta ve soy isminizi giriniz.");
        String tamIsım = input.nextLine();
        System.out.println("tamIsım");

        System.out.println("kimlik numaranızı giriniz.");
        String kimlikNumarası = input.next();
        System.out.println("kimlikNumarası");




    }
}
