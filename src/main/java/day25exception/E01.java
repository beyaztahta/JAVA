package day25exception;

public class E01 {
    /*
    1-Excaption istisnai hata , java da kodlarımızı calıstırırken meydana gelen beklenmedık durumlardır.
    2-Excaptionlar ile calısmanın iki yolu vardır
        a)try-catch block kullanma ve exception olussa bile calısmayı devam ettırme
        b)throw exception kullanarak calısmyı durdurma.(mesela yazdıgımız kod geregi bir dosya uzerınden okuma yapmamız gerekiyor
        ise bu dosyamız sılınmısse java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
    3-Eger excaption ı handel etmez isek java calısmayı durdurur.
    4-try -catch kullanırken try kodunu bir yada birden fazla catch ile kullanabiliriz.
    5-try catch olmaksızın yanlız kullanılamaz.
    6-Eger yazmıs oldugunuz herhangı bır kod satırında problem olabilecegini dusunuyorsanız try -catch blok icine koymalısınız.
    7-catch blok parantezi icersine olması muhtemel excaption class ismi yazılır.
    8-e.getmessage(),methodunu kullanarak teknik mesajlar elde edebiliriz.
      System.out.println();burada yazmıs oldugum mesajlar benım teknık olmayan acıklamalarımdır.
      e.printStackTrace(); bu method Exception ile ilgili detaylıca teknik mesaj verir,kod calısmaya devam eder.
      System.err.println();hata mesajını renklı olarak verir.Bu sayede konsolda diger mesajlardan ayırabiliriz.
    9-Eger try body icindeki kod sorunsuz calısırsa catch blok devreye girmez.
     */
    public static void main(String[] args) {
//        divide(6,2);//3
//        divide(0,2);//0
//        divide(6,0);//Matematikte bir sayı sıfır ile bolunemez.


//        divide1(5,0);
        divide1(12,0);
    }
    //1.Yol Tavsiye edilmez.
    //Bir developer için tum matematik kurallarını ezbere bilmek mumkun degıldır.
    //Java matematik ile ilgili karsılasılması muhtemel tum istisnaları,hataları AritmeticException classına koymustur.
    //Matematikteki tum ıstısnaları detayları bilmek zorunda degiliz.
    public static void divide(int a,int b){
        if(b==0){
            System.out.println("Bir sayı sıfır ile bolunemez.");
        }else {
            System.out.println(a/b);
        }

    }
    //2.Yol
    //try -catch kullanarak exception ı handle etmek tavsiye edilir.
    public static void divide1(int a,int b){

        try{
            System.out.println(a/b);
            System.out.println(" hi exception");
            System.out.println(" bye exception");

        }catch(ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu..."+ e.getMessage());
            e.printStackTrace();
            System.err.println("Bolme isleminde bir problem olustu...");
        }
    }




}

