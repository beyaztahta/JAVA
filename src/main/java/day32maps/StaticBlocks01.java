package day32maps;

public class StaticBlocks01 {

    public static double pi;

    static{
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

    //static blocklar ihtiyacımız olan variable ların class olusturma safhasında elimizde olmasını saglar.
    //static bocklar class içindeki herseyden once calıstırılır.main method tan ve diger tum methodlardan once calıstırılır.
    //static bocklar içinde sadece static variable lara deger atanabilir.
    //birden fazla static block varsa ustteki once calıstırılır.


    static{
        pi=3.14;
        System.out.println("Static block 1");
    }

}
