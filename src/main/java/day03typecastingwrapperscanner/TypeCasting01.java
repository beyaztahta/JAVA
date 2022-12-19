package day03typecastingwrapperscanner;

public class TypeCasting01 {
    //Type Casting:Bir numerıc data type ını dıger numeric data type ına cevırmektır.
    //      byte<short<ınt<long<float<double

    //Note:Kucuk data teype ını buyuk data type ına cevırmeye "Auto Widening"denir.
    //Note:Buyuk data teype ını kucuk data type ına cevırmeye "Explicit Narrowing"denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age ;

        long population =1234;
        int newPopulation =(int)population;

        //Example 1:short u dauble a ceviren kodu yazınız.//"Auto Widening"
        short numOfStudents =235;
        double newNumOfStudents = numOfStudents;

        //Example 2:float ı byte yapan kodu yazınız.//"Explicit Narrowing"
        float price = 12.99F;
        byte newPrice = (byte)price;

        System.out.println(newPrice); //12 //Java ondalık sayıyı, tam sayıya cevirirken yuvarlama yapmaz.
                                           //Java ondalık sayıyı, tam sayıya cevirirken ondalık kısmını siler.
        int number =515;
        byte newNumber =(byte)number;
        System.out.println(newNumber);//3

        int num =510;
        byte newNum =(byte)num;
        System.out.println(newNum);//-2

    }
}
