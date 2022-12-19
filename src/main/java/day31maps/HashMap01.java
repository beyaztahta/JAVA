package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
    1)Map ler key-value structure kullanır.
    2)Key ler unique dir.
    3)Value lar tekrarlı data icerebilir.
    4)Mao lerde eleman degil EntrySet kullanırız.
    5)Key ler null tekrarsız olarak kullanılır.
    6)Value ler null kabul eder.
    7)HashMap ler EntrySet leri herhangibir sıralamaya tabi tutmaz,rastgele sıralar.
    8)Sıralama ile vakit kaybetmedigi için HashMap ler cok hızlı calısırlar.

    "HashMap"ler sıralama ile ugrasmazlar.Bu sebepten cok hızlı calısırlar.
     */
    public static void main(String[] args) {
        HashMap<String,Integer>studentAges=new HashMap<>();

        studentAges.put("Ali",13);
        studentAges.put("Tom",21);
        studentAges.put("Brad",12);
        studentAges.put("Ajda",76);
        studentAges.put("Cuneyt",75);
        studentAges.put(null,55);
        studentAges.put(null,66);
        studentAges.put("Ayhan Isık",null);
        studentAges.put("Sadri Alısık",null);

        studentAges.put("Ali",88);// Ali yı tekrar eklediginde overwrite yapar(aynı key i kullandıgınde yani uzerine yazar.)

        System.out.println(studentAges);//{Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //Map ten sadece key ler nasıl alınır?

        studentAges.keySet();//key leri set in içine koyarak verecek.
       Set<String> keys=studentAges.keySet();
        System.out.println(keys);//[null, Tom, Ayhan Isık, Ajda, Brad, Cuneyt, Sadri Alısık, Ali]

        //Map lerde sadece value lar nasıl alınır?

        Collection<Integer>values=studentAges.values();
        System.out.println(values); //[66, 21, null, 76, 12, 75, null, 88]

        //Belli bir key e ait value nasıl alınır?

        Integer age=studentAges.get("Cuneyt");
        System.out.println(age); //75

        //Example 1: Tum ınteger yasların ortalamasını hesaplayan kodu yazınız.

        Collection<Integer>ages=studentAges.values();
        int sum=0;
        double counter=0;
        for(Integer w:ages){
            if(w!=null){
                sum+=w;
                counter++;
            }
        }
        System.out.println("Ortalama yas = "+ (sum/counter));//Ortalama yas = 56.333333333333336

        //Example 2:A ile baslamayan isimlerin içerdigi toplam karakter sayısını bulan kodu yzınız.

        Set<String>a=studentAges.keySet();
        int t=0;
        for(String w:a) {
            if (w!=null && !w.startsWith("A")  ) {
               t=t+w.length();

            }
        }
        System.out.println(t);

        //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet'i siler ve size boolean return eder.
        boolean result=studentAges.remove("Ajda",76);
        System.out.println(studentAges);


        Integer result1=studentAges.remove(null);
        System.out.println(result1);

        //Key varsa value u ver ,key yoksa sizin istedigigniz degeri verir.

        Integer result2=studentAges.getOrDefault("Brad",0);
        System.out.println(result2);//12

        Integer result3=studentAges.getOrDefault("Braddden",0);
        System.out.println(result3);//0

        //Value null ise Map e ekle, value null degilse ekleme yapmaz.

        Integer result4=studentAges.putIfAbsent("Brad",100);
        System.out.println(result4);//12

        Integer result5=studentAges.putIfAbsent("Ayhan Isık",100);
        System.out.println(result5);//null

        //Key yoksa ekleme yapar.
        Integer result6=studentAges.putIfAbsent("Acun Ilıcalı",100);
        System.out.println(result6);

        //replace methodu value ları key e bakarak degistirdi.
        studentAges.replace("Acun Ilıcalı",49);
        System.out.println(studentAges);//{Tom=21, Ayhan Isık=100, Acun Ilıcalı=49, Brad=12, Cuneyt=75, Sadri Alısık=null, Ali=88}

        //replace methodu value ları key ve value u kontrol ettikten sonra degistirdi.
        studentAges.replace("Acun Ilıcalı",47,53);
        System.out.println(studentAges);//{Tom=21, Ayhan Isık=100, Acun Ilıcalı=53, Brad=12, Cuneyt=75, Sadri Alısık=null, Ali=88}

        //Example 3: Map teki herbir entry i ekrana farklı bir satırda olacak sekılde yazdırınız.

        //entryset() methodu Map teki her elemanları bir set in içine koyarak size verir.
        Set<Map.Entry<String,Integer>> entries=studentAges.entrySet();
        for(Map.Entry<String,Integer> w :entries){
            System.out.println(w);

        }




    }
  }
