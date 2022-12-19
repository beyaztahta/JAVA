package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    /*
       Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
       Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
           i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
           ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.
   */
    public static void main(String[] args) {
        //Example 1:Kullanıcıdan gun ismini alınız, o gunun hafta sonu mu hafta ıçı mi oldugunu soyleyınız.
        Scanner input=new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz.");
        String gun=input.next();

       //1.YOL
        if(gun.equalsIgnoreCase("pazar")){
            System.out.println("haftasonu");
        }else if(gun.equalsIgnoreCase("pazartesi")){
            System.out.println("haftaici");
        }else if(gun.equalsIgnoreCase("salı")){
            System.out.println("haftaici");
        }else if(gun.equalsIgnoreCase("carsamba")){
            System.out.println("haftaici");
        }else if(gun.equalsIgnoreCase("persembe")) {
            System.out.println("haftaici");
        }else if(gun.equalsIgnoreCase("cuma")) {
            System.out.println("haftaici");
        }else if(gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("haftasonu");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz.");
        }

       //2.YOL
        System.out.println("Bır gun ısmı gırınız");
        String gun01 =input.next();
        if(gun01.equalsIgnoreCase("pazar")||gun01.equalsIgnoreCase("cumartesi")){
            System.out.println("haftasonu");
        }else if(gun01.equalsIgnoreCase("pzartesi") ||
                gun01.equalsIgnoreCase("salı") ||
                gun01.equalsIgnoreCase("carsamba") ||
                gun01.equalsIgnoreCase("persembe") ||
                gun01.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ıcı");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz.");
        }

      //3.yol
        boolean haftaSonu=gun.equalsIgnoreCase("pazar")||gun.equalsIgnoreCase("cumartesi");
        boolean haftaIci=gun.equalsIgnoreCase("pazartesi")||
                         gun.equalsIgnoreCase("salı")||
                         gun.equalsIgnoreCase("carsamba")||
                         gun.equalsIgnoreCase("persembe")||
                         gun.equalsIgnoreCase("cuma");
        if(haftaSonu){
            System.out.println("hafta sonu");
        }else if(haftaIci){
            System.out.println("hafta ici");
        }else{
            System.out.println("gecerli bir gun ısmı gırınız.");
        }



    }
}
