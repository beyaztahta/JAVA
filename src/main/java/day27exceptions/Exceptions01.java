package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
       double r1= compireNumOfCharacters("java","xy");
        System.out.println(r1);

        double r2= compireNumOfCharacters(null,"xy");
        System.out.println(r2);

        double r3= compireNumOfCharacters("selenium","");
        System.out.println(r3);
    }
  //Verilen iki stringden birinin karakter sayısının dıgerinin kac katı oldugunu veren method olusturunuz.

    public static double compireNumOfCharacters(String s,String t){
       double result=0;
        try{
            result=s.length()/t.length();
        }catch(NullPointerException e){
            System.out.println("length() methodu null ile kullanılamaz.");
        }catch(ArithmeticException e){
            System.out.println("Herhangi bir sayı sıfır ile bolunemez.");
        }finally {
            System.out.println("Datebase ile connection kesildi");
        }
        return result;

        /*
        Java da birbirine benzeyen 3 tane keyword vardır:
        final,finally,finalize acıklayınız.
       ==> final :bir keywordtur.Variable larda kullanılır.
                         public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.

       ==> finally : bir kod bloktur.try-catch veya sadece try ile kullanılır.finally kod blok icine yazılan kodlar her halukarda calıstırılır.
        finally en sonda kullanılır. Mesela datebase ile connctionı kesmek her halukarda yapılması gereken bir fiildir bunu finally ile yapabiliriz.
       ==>finalize: bir methodtur. bu method java tarafından datalar imha edilmeden once cagrılır.bu method dataları imha edilecek hale getirir ve daha
       sonra "garbage collector" bu dataları imha eder.

       NOTE: finalize methodunu java developerlar da cagırabilir ama java kendi bildigini yapar.
         */


    }

}
