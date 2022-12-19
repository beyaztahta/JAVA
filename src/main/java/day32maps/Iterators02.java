package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        List<String> myList=new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1: Iterators kullanarak list elemanlarını tersten yazdırınız.

        ListIterator<String>itr= myList.listIterator();// listteki elemanları iteratora cevirdik.

        while(itr.hasNext()){

            itr.next();
            //buraya kadar poınteri en saga ittik.Sebebi tersten yazdırmak:
        }
        while(itr.hasPrevious()){//burada hasprevious pointer en sagda oldugu için senden once eleman var mı varsa true olur ve
            // diger kod calısır previosa gecmiş olur poınteri alır bir oncekı elemanın onune koyar ve atladıgı elemanı verir.

           String el= itr.previous();

           System.out.print(el+" ");
        }
        System.out.println(myList);

        //hashNext() methodu pointer dan sonra eleman varsa true yoksa false dondürür
       //next()methodu ise pointeri bir sonraki elemanin onune koyar ve ustunden tladigi elemani return eder

        //hasPrevious() methodu senden once eleman var mı diye sorar true alinca kod calisir, yoksa false return eder
        // previous ()methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.

        //Example 2: Listteki tum elemanları siliniz.

        while(itr.hasNext()){

            itr.next();

            itr.remove();
        }
        System.out.println(myList);

   /*
   List iterator da 1-hasNext
                    2-next
                    3-set
                    4-hasPrevious
                    5-previous
                    6-remove

                     2) Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.

Iterator,

1) Sadece soldan sağa hareket edebilir.
2) Update özellikleri yoktur.

    */

        List<String> yourList=new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String>iterator= yourList.iterator();

        while(iterator.hasNext()){

          String el=  iterator.next();

          System.out.print(el+" ");
        }





















    }
}
