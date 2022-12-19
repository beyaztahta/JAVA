package day30collection;

import java.util.PriorityQueue;

public class PriorityOueue01 {
    /*
      "PriorityOueue" oncelikli sıralama yapmaktır.Java arkada bir kural olusturur ve her defasında o onceligi uygular.Bunun
      iyi tarafı biz istersek kendi sıramızı(sıralama mantıgı) da  olusturabiliriz.
      "PriorityOueue"

     */
    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue);//[A, C, B, G, E]

    }
}
