package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year=2001;
        String leap=year%100==0 ?( year%400==0  ? "Leap Year" : "Leap Year Degil"):(year%4==0 ? "Leap year":"Leap year degil");
        System.out.println(leap);

         /*
            Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
        */
        String pwd="i2a3ed54";
        char ilkHarf=pwd.charAt(0);
        String gecerli=pwd.length()<8 ? (pwd.charAt(0)=='K'  ? "gecerli":"gecersiz"):(pwd.charAt(0)=='i'?"gecerli":"gecersiz");
        System.out.println(gecerli);

        //.2yol
        String pwd1 = "K2a3";
        char ilkHarf1 = pwd.charAt(0);
        String gecer = pwd.length()<8 ? (ilkHarf1=='K' ? "Gecerli" : "Gecersiz") : (ilkHarf1=='i' ? "Gecerli" : "Gecersiz");

        System.out.println(gecer);



















    }
}
