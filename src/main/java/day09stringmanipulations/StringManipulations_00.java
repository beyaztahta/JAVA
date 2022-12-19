package day09stringmanipulations;

public class StringManipulations_00 {
    public static void main(String[] args) {
        //startsWith kodu ilk karakterden sonraki Stringe bakar ve o String in "va" ile baslayıp baslamadıgını kontrol eder.
        //"va"ile baslıyorsa true,balamıyorsa false return eder.
        String a="Java kolaydır..." ;
        boolean b=a.startsWith("va" ,2);
        System.out.println(a);

        String c=a.replaceFirst("a","*");
        System.out.println(c);
        //replacaFirst() kodu Stringdeki ilk "a"yı "*"e cevirir.
        //Sadece replace() kodu kullansaydık tum "a"ları "*" e cevirirdi.

        String d=a.concat( "Anladın mı?");
        System.out.println(d);
        //concat() iki tane Stringi birbirine yapıstırmaya yarar.
        //Concenation işlemi iki turlu yapılabilir.İ)+     İİ) concat()

        String e="     Tom Hamks     ";
        System.out.println(e);
        String f=e.trim();
        //trim()bir Stringin bas ve sonundaki space karakterlerini siler ve aradaki sapaca karakterlerine dokunmaz.

        String h="Java";
        String i="Kava";
        int k=h.compareTo(i);
        int k1=h.compareToIgnoreCase(i);
        System.out.println(k);
        System.out.println(k1);
       /*
       copmpareTo() kodu iki tane String i alfabetik (lexicograpic) olarak karsilastırır.Buyuk harfe duyarlidir.Buyuk
       kucuk harfe duyarlı olmasını istemezseniz h.comparaToIgnoreCase()kullanılabilir.
        */

       String a1="Java kolaydır..";
       String n=a1.repeat(3);
        System.out.println(n);
        //repeat()kodu a1 Stringini yanyana 3 kere tekrarlar,yapıstırır.reoeat(0),empty return eder.








    }
}
