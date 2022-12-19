package day29abstractioncollection;

import java.util.LinkedList;

public class LinkedList01 {

    /*
    1)LinkedList deki her eleman iki bolumden olusur.
    i-data bolumu
    ii- pointer bolumu

    2)LinkedList herbir eleman "Node "olarak adlandırılır.
    3)LinkedList Eleman ekleme ve eleman silme islemlerinde cok basarılıdırlar.
    4 LinkedList Eleman arama islemlerinde basarısızdırlar.
    5)3. ve 4. maddelerinden dolayı eleman ekleme ve eleman silme işlemlerinin cok yapılacagı durumlarda kullanılmalıdır
    6)Arraylistler indeks kullanır, LinkedListler indeks kullanmaz.
    7)İndeks kullanmak eleman bulma işlemlerinde cok basarılıdır.Bu yuzden eleman bulma işlemlerini çok yapacaksınız Arraylist kullanmalısınız
     */
    public static void main(String[] args) {

        LinkedList<String>visitors=new LinkedList<>();
         visitors.add("Tom");
         visitors.add("Hanks");
         visitors.add("Tom Hanks");
         visitors.add("Brad");
         visitors.add("Pitt");
         visitors.add("Brad Pitt");
         visitors.add(2,"Angelina Julie");//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        System.out.println(visitors);//[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        //LinkedListler ekleme ve silme islemlerinde cok basarılı olduklarından ekleme ve silme ile ilgili cok fazla method içerir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkın");
        System.out.println(visitors);

        visitors.removeLast();
        System.out.println(visitors);

        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);

        String firstEl= visitors.pop();// cut+paste==>ctrl+x
        System.out.println(firstEl);//tom
        System.out.println(visitors);//[Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]
        LinkedList<String>myList=new LinkedList<>();
        myList.pop();
        System.out.println(myList);//NoSuchElementException attı cunku list bos.


    }
}
