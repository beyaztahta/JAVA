package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        /*
        Note:Java primitive lere methodlar ekleyerek yeni bir yapı oluşturdu.Bu yapıya "Wrapper Class"denir.
            Primitive             Wrapper
            byte     ==>            Byte
            short    ==>            Short
            int      ==>            Integer
            long     ==>            Long
            float    ==>            Float
            double   ==>            Double
            boolean  ==>            Boolean
            char     ==>           Character
         */

        byte primitiveByte = 12;//"primitiveByte" yazıp nokta koydugumuzda hıc method goremezsınız.
         //Cunku primitive ler method içermez,deger icerir.
        Byte wrapperByte = 12;//"wrapperByte"yazıp nokta koydugumuzda bircok method gorursunuz.
        //Cunku wrapper lar method icerir.

        //Example 1: byte data tipinin en kucuk ve en buyuk dergerlerini ekrana yazdırırnız.
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println( Byte.MAX_VALUE);//127

        //Example 2:short,ınt,long data tıplerinin en buyuk ve en kucuk degerlerını ekrana yazdırınız.
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //Primitive ler nasıl wrapperlere cevrılır?(Autoboxing)
          float f1 =13.99F;
          Float wrapperF1 = f1;
        //Wrapper lar nasıl primitive lere cevrılır?(Unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //Note. Autoboxing ve Unboxing java tarafından otomatik olarak yazılır.



    }
}
