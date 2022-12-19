package day30collection;

import java.util.HashSet;

public class HashSet01 {

    /*"set" tekrarı olmayan coklu dataları depolamak(coklu tekrarsız data) için kullanılır.(ögrenci numaraları gibi)
      "Hash" bir tekniktir. Birbirine benzemeyen kodlar olusturur. Bu kodlar datayı unic yapar.
       Java her dataya ozel bir kod verir.
      "Hashset" ler eklenen elemanların sıralaması ile ugrasmaz.Sıralama ile alakalı zaman harcamaz bu yuzden cok hızlı calısır.
      ==>Ne zaman Hashset kullanırız?
      1)tekrarsız elemanlarda kullanılır
      2)sıralama sizin için onemli degilse
      3)hız cok onemli ise kullanılır.

      "Hashsetler"indeks kullnmazlar cunku sıralamayı rastgele (random) yapar.

    */
    public static void main(String[] args) {

        HashSet<String>emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add("Mango");
        System.out.println(emails);
        //"set" lere aynı elemanı eklersek hata vermez. Son ekleneni var olan datanın üstüne yazar.Buna "Overwrite" denir.Yani set te bir degişiklik olmaz.

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]






    }
}
