package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {
        //Obje nasıl oluşturulur?
        //1) class ismini yazın 2)Objeye isim ver 3)=  4) new keywordunu kullan 5)Class ismini parantezle beraber
               Car                myHonda         =    new                           Car();

        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();

         //MethodCreation class ından obje oluşturduk.
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
    }

    public void hareketEt(){
        System.out.println("Honda güzel hareket eder...");
    }

    public void dur(){
        System.out.println("Honda güvenli durur...");
    }



}
