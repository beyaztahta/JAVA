package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz
        //1.Way: if-else
        int a=12;
        if(a>0){
            System.out.println("POZITIF");
        }else{
            System.out.println("Pozitif degil...");
        }
        //2.Way:Ternary
        //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc=a>0 ? "POZİTİF":"POZİTİF DEGIL";
        System.out.println(sonuc);

        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz
        int b=12;
        int c=23;
        int sn=b<c ? b : c;
        System.out.println(sn);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

       int d=-45;//d=0 da deneyebilirsin.
       int mutlak= d<0 ? d*(-1) : d;
        System.out.println(mutlak);

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapiniz.

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "Islem yapamam" mesaji veriniz

       int x=11;
       int y=10;
       Object islem= (x>0 && y>0) ||(x<0 && y<0) ? x*y : "İslem yapamam...";
        System.out.println(islem);

        //Note: Java'da her class'in en az bir tane "parent" class'i vardir.
        //      Sadece "Object" class'in "parent" class'i yoktur.


    }
}
