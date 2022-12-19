package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1)TreeMap ler entryset leri key lere gore "natural order "da sıralar.
    2)TreeMap en yavas maplerdir.
    3)TreeMap ler thread-safe ve syncronized degildir.
    4

     */
    public static void main(String[] args) {
        TreeMap<String,Double> salaries=new TreeMap<>();
        salaries.put("Tom Hanks",30000.0);
        salaries.put("Marry Star",10000.0);
        salaries.put("Jimmy Jones",5000.0);
        salaries.put("Kevin Brıdgeman",6000.0);

        System.out.println(salaries);//{Jimmy Jones=5000.0, Kevin Brıdgeman=6000.0, Marry Star=10000.0, Tom Hanks=30000.0}

        //tailMap() , Sadece treemap lerde calısan bir kodtur,
        //verilen key den baslayarak tum entry leri size verir.
        SortedMap<String,Double>map1= salaries.tailMap("Kevin Brıdgeman");

        //tailMap() 2. kullanışi(String,Boolean);verilen key den baslayarak tum entry leri size verir ama sizin verdiginiz key i hariç tutar.
        // false yazarsan hariç tutar,true yazarsan dahil eder.
        NavigableMap<String,Double>map2= salaries.tailMap("Kevin Brıdgeman",false);
        System.out.println(map2);


        NavigableMap<String, Double> map3=salaries.subMap("Kevin Brıdgeman",true,"Tom Hanks",false);
        System.out.println(map3);

        //Marry Star dan bir onceki elemanı verir.
        Map.Entry<String,Double>map4=salaries.lowerEntry("Marry Star");
        System.out.println(map4);

        //LowerEntry (Paris Hilton) dan bir oncesini verir, parıs hilton olmasada sanki varmıs gibi davranır.
        Map.Entry<String,Double>map5=salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Marry Star=1000.0

        //higherEntry Marry Star dan bir osonraki elemanı verir.
        Map.Entry<String,Double>map6= salaries.higherEntry("Marry Star");
        System.out.println(map6);

        Map.Entry<String, Double>  map7 = salaries.higherEntry("Tom Hanks");
        System.out.println(map7);// null ==> Cunku Tom Hanks den sonra eleman yok

        //ceilingEntry(); var olan key ile kullanilirsa o key'i verir. Var olmayan bir key ile kullanilirsa bir sonrakini verir
        Map.Entry<String, Double>  map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8);// Mary Star=1000.0

        Map.Entry<String, Double>  map9 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map9);// Tom Hanks=3000.0

        Map.Entry<String, Double>  map10 = salaries.floorEntry("Mary Star");
        System.out.println(map10);// Mary Star=1000.0

        Map.Entry<String, Double>  map11 = salaries.floorEntry("Paris Hilton");
        System.out.println(map11);// Mary Star=1000.0
    }
}
