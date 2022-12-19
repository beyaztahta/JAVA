package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        List<String> myList=new ArrayList<>();
        myList.add("a");
        myList.add("k");
        myList.add("z");
        myList.add("j");
        myList.add("m");
         //for-each loop kullanarak her elemanın sonuna "!"isareti koyunuz.

       // Note: looplar kendi baslarına collectionları update edemezler.Bu yuzden java ıterator ları olusturdu .
        //Iterator lar collection ları update etmek için kullanılır.
        for (String w:myList) {

            w=w+"!";
        }
        System.out.println(myList);//[a, k, z, j, m]




        ListIterator<String>itr= myList.listIterator();

        while(itr.hasNext()){

            String eleman=itr.next();

            itr.set(eleman+"!");
        }
        System.out.println(myList);//[a!, k!, z!, j!, m!]


       // hasNext() methodu senden sonra eleman var mı der.true alırsa kod calısır ve
        // next() methodu calısır pointeri alır bir sonraki elemanın onune koyar,
        //ikinci iş atladıgı elemanı size verir.


    }
}
