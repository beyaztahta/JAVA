package day28abstraction;

public interface Engine {

    /*
   1)Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
   bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

   2)"interface" lerde hersey abstract oldugu için ona "tam abstract(fully abstraction)" derler.
    absract classlarda "abstract" ve "concrete" method bir ara da kullanıldıgı için abstract classlara fulyy abstraction denmez.

   */
    //"interface"deki tum methodlar "abstract" olmak zorundadır.
    //"interface"lerde "abstract "method olustururken abstract keywordu kullanmaya gerek yoktur.Cunku java onun abstract oldugunu bilir.
    //"interface" deki methodlar otomatik olarak public kabul edilir. Bu yuzden o methodlar için public yazmaya gerek yokrtur.

    //public abstract void eco();  ile   void eco();   aynıdır.


      void eco();

      void gas();

      void tsi();

       //"default" keyword kullanarak "interface"lerin içinde body olan methodlar uretebilirsiniz.
      //ASAGIDAKI NON STATİC METHOD TUR.
      public default int add(int a,int b){

            return a+b;
      }

      //"static" keyword kullanarak "interface"lerin içinde body olan methodlar uretebilirsiniz.
      //ASAGIDAKİ STATİC METHODTUR.
      public static String update(String str){
           return str+ "!";
      }

}
