package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
            Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdiriniz
        */

        //Note: toLowerCase() methodu bir String'deki tum character'leri kucuk harfe cevirir.
        //      toUpperCase() methodu bir String'deki tum character'leri buyuk harfe cevirir.

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ay ismi giriniz");
        String ayIsmi=input.next().toLowerCase();
        switch(ayIsmi){
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz");

        }





    }
}
