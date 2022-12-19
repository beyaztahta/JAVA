package day30collection;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        /*
        "LinkedHashSet" elemanları ekleme sırasına gore yertlestirirler.(Insertion order)

        "LinkedHashSet" elemanları sıralamada zqman harcadıgı için hashset lere gore yavas calısır.
         */

        LinkedHashSet<String>emails=new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");

        System.out.println(emails);//[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]



    }
}
