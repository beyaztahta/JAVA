package day29abstractioncollection;

public class Civic implements Engine,Ac{

         /*
           "absrtract methodlar" sadece ne yapılacagını soyler(what to do),
           "concrete methodlar" ne yapılacagı(what to do) ile birlikte nasıl yapılacagını(how to do) soyler.
           "inretface" ler bir yapılacak işler listesidir.(To do list)
          " multiple parent interface " kullandıgınızda aynı method ismi ile birden fazla method olusturursanız bu methodların return type ları
          aynı olmalıdor. aksi takdirde hata verir.

           "interface" lerden obje olusturamayız. cunku interface lerde "constructor" yoktur.
           "abstract "classlarda , class olukları için constructor vardır.ama constructorlar abstract classlarda obje olusturamazlar.

             İNTERVİEW SORUSU

        SORU: "Abstract clas" ile "interface" farkları nelerdir?

        1)Method farkı
        Abstract class hem absract hem de concrete method içerebilir.
        interface ler ise sadce abstract methodlar içerir.
        Ama istersek interface ler içinde de default ve static keywordler kuyllanarak concrete methodlar oluşturabiliriz

        2) Variable farkı
        Absract classlarda normal classlardaki gibi her turlu variable olusturulabilir.
        interface lerde ise variable lar public static ve final olmak zorundadır.

        3)inheritance
        Abstract classlar class oldukları için multiple inheritance musade etmezler.
        interface ler ise multiple ineritance destekler.

        4)Object creation
        Abstract classlarda constructor vardır ama object olusturmada kullanılmazlar.
        interfacelerde constructor olmadıgından obje olusturamazlar.

       SORU:OBject Oriented Programming Language prensipleri nelerdir?

       1- inheritance
       2-polymorphism
       3-encapsulation
       4-abstraction

       bunları bilmek ve acıklamanız gerekmektedir.


         */
    @Override
    public void run() {
        System.out.println("Civic runs well...");
    }


}
