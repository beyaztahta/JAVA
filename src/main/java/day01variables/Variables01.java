package day01variables;

public class Variables01 {

                //Variables nasıl oluşturulur?

   // 1)Access Modifier   2)Data Type   3)Variables ismi  4)=    5)Deger   6);

    // Javadaki ";" Ingilizcedeki "." gibidir.
    //Ingilizcede "cumle" deriz, Java'da "statement" deriz.

    //"=" sembolü "Assignment(Atama) Operator" olarak adlandırılır.
    //"Assignment(Atama) Operator" sağdaki değeri alır,soldaki variable'in içine koyar.

    public int age = 13;
    public int height = 183;

                      // Java'da Data Type'ları
                /*
                    Primitive Data Types
    1)int: İntegerin kısaltması. Integer tamsayı demektir.32 bit(4 byte) kullanır.
           Matematikte tamsayıların başı ve sonu yoktur fakat Java da tamsayıların başı ve sonu vardır.
           En küçük int = -2,147,483,648
           En büyük int =  2,147,483,647

     2)byte: Tam sayılar için kullanılır.8 bit kullanır.
             En küçük byte =-128
             En büyük byte = 127

     3)short: Tam sayılar için.16 bit kullanır.
              En küçük short = -32768
              En büyük short = 32767

     4)long: Tam sayılar içindir.Integerlerın yetmediği yerde kullanılır.64 bit kullanır.

     5)float: Ondalıklı sayılar içindir. Virgülden sonra 7 basamak içerebilir.
               Float değerlerinde sonuna "f"veya"F" kullanılır.32 bit kullanır.

     6)double: Ondalıklı sayılar içindir. Virgülden sonra 16 basamak içerebilir.
               64 bit kullanır.

     7)boolean:"true" veya "false" değerleri için kullanılır.1 bit kullanır.

     8)char: Tek karakterler için kullanılır.16 bit kullanır.
              A,c,2,?,_,=

     Note: "char"lara deger verirken tek tırnak arasına koyunuz yoksa hata verir.
     Note: Java buyuk ve kuçuk harflere duyarlıdır.
           Java için TRUE ile true tamamen farklıdır.

     Note: Numeric Data Types: byte < short < int < Long < float < double
           Numeric Olmayan Dta Types: boolean - char

                         Non-Primitive Data Types
       String: İsim,adres,kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
              String değerleri mutlaka çift tırnak arasına konulmalıdır.
              String non-primitive dir. Yani bir string oluşturduğumuzda Java size bir suru method verir.

                    Primitive ile Non-Primitive lerin farkı nedir?
                1)Non-Primitive data type larında degerın yanında methodlar vardır.
                  Primitive data type larında ıse sadece deger vardır,method yoktur.
                2)Primitive data type ları Java tarafından oluşturulmuştur,toplam 8 tanedir,biz primitive data
                olusturmayız.Non-Primitive data type ları Java tarafından olusturulmustur,bız de olusturbiliriz.
                3)Primitive data type ları isimlendirilirken kucuk harflerle baslar.
                  Non-Primitive data type ısımlerı buyuk harfle baslar.
                4)Primitive data type ları memory de farklı buyuklukte yer kullanır.
                  Non-Primitivelerın hepsı memory de aynı buyuklukte yer kullanırlar.
         */
      public byte price = 12;
      public short populationOfVillage = 23000;

      public float priceOfShirt = 13.99F;
      public double weightOfCell = 0.000012045;

      //Siz "Long" demenize rağmen Java onları "int" kabul eder.
      //Bu yüzden, Long bir variable'a "int"aralığının dışında bir sayı verirseniz mutlaka sonuna"L"-"l" koyunuz
      public Long populationOfWorld = 7000000000L;

      //Burada "L" koymadığımız halde problem yok cunku "1234" int aralıgına uyar.

      public long x = 1234;

      public boolean isOld = true;
      public boolean isRich = false;

      public char initial = 'S';

      public String name = "Tom Hanks";

      //Note:"main method"arabanın motoru gıbıdır.
     //Note:"main method"calısmadan hıcbırsey calısmaz.

    public static void main(String[] args) {

    }




}
