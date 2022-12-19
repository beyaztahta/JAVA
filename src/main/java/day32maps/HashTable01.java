package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1) HashTable bir maptir.
    2) HashTable entryset leri herhangi bir sıralamaya tabi tutmaz.
    3) HashTable HashMap lerden daha yavastir.çunku  HashTable lar thread-safe(aynı anda birden fazla iş yapabilmek) ve synchronize
    (coklu işlerin zaman kazandıracak sekilde mantık sıralanması yapmak)'dir.(1.fark hashmaplerden)
    4) HashTable larda key null olamaz,"NullPointerException" atar.(2.fark)
    5) HashTable larda value lar null olamaz,"NullPointerException" atar.(2.fark)
    Note: to String()methodu objeleri konsolda detayları ile gorebilmek için classların ıcınde olusturulur.to String()methodu nu olusturmdan
    objayi konsola yazdırırsanız o objenin adresini yazdırır.


     */

    public static void main(String[] args) {
        Hashtable<String,Integer>countryPopulations=new Hashtable<>();
        countryPopulations.put("USA",40000000);
        countryPopulations.put("GERMANY",83000000);
        countryPopulations.put("TURKEY",80000000);

        System.out.println(countryPopulations);//{GERMANY=83000000, USA=40000000, TURKEY=80000000}

        //countryPopulations.put(null,9000000); //Key null olamaz-NullPointerException

        //countryPopulations.put("FRANSA",null);//NullPointerException

        Hashtable<String,Students>myStudents=new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents);

//        Students name= myStudents.get("name"); //get() key ile calısır. Bu bize null verir.
//        System.out.println(name);


        String name= myStudents.get("Math").name;
        System.out.println(name);

        int age=myStudents.get("Math").age;
        System.out.println(age);

    }
}
