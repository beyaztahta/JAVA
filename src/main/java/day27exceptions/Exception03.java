package day27exceptions;

    /*
    1)Java Exception'lar oluşturarak Developer'ların Java kurallarına uymalarını temin etmiştir.
    2)Biz de Application üretirken kendi Exception'larımızı oluşturarak diğer Developer'ların bizim ortaya koyduğumuz kurallara uymalarını temin ederiz.
    3)Javanın degil bizim ürettiğimiz Exception'lara "Custom Exception" denir.
    4)"Custom Exception" da "RunTimeException"ve "CompileTimeException" olabilir.
    5)Custom "RuntimeException" üretmek için "extends RuntimeException" deriz.
    6)Custom "CompileTimeException" üretmek için "extends Exception" deriz.
 */

public class Exception03 {
    public static void main(String[] args) throws IllegalGradeException {
        printGrade(90);
        checkNameFormat("ali");
    }
    //Ogrenci notlarını yazdıran bir method yazın.
    public static void printGrade(double grade) throws IllegalGradeException {
          if(grade<0 || grade>100){
              throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz.");
          }else{
              System.out.println(grade);
          }
    }

    //Verilen ismin ilk harfin buyuk olamaması durumunda exception atan method yazınız.

    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
           return true;
        }else{
            throw new IllegalNameException("İsimler buyuk harfle baslamalıdır.");
        }
    }


}
