package day24statickeywordencapsulation;

public class Student {

    /*
   => Encapslation: "Data Hiding"(gizlemek) demektir.
   => Datayı niçin gizlersiniz? Datayı dıs etkılerden korumak için.
   => Datayı nasıl gizlersiniz?Access modifierini "private" yaparak gizlerim.
   => Datayı gizledikten sonra baska classlardan okumak istersen ne yaparsın?
     "get"methodlar(getter) olusturarak gizledigimiz dataları okunur hale getirebiliriz.
   =>Datayı gizledikten sonra baska classlardan degistirmek istersen ne yaparsın?
      "set"methodlar(setter) olusturarak gizledigimiz dataları degistirebiliriz.
   =>Variable data type ı ile "get"methodun return type aynı olmalıdır.
   =>get methodları isimlendirirken "get+ variable name" ancak varıable ın data type boolean ıse "is + variabla name" yapılır.
   =>set methodların return type "void"tir.

   Bir variable'i encapsule etmek icin
   1- Access modifier'i private yapariz
   2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
       - Eger sadece okunmasini istiyorsaniz getter
       - Sadece deger girilebilsin isterseniz setter
        methodlarini olustururuz.
        Bir variable icin hem getter hem setter olusturursaniz
        o variable public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz
    */

    public String stdName="Tom Hanks";

    private String stdId="TH202201";

    private double gpa=3.8;

    private boolean retired=false;


    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;


    }
}
