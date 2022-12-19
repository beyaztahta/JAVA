package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanıcıdan data almaya yarar,Scanner kullanıcı ile etkileşim kurmamaızı sağlar.
    //Scanner bir java class tır,bu clss ı kullanabilmek için"import"etmak gerekir.
    //Scanner class ı javanın "util"kutuphanesındedır.

    public static void main(String[] args) {
        //Kullanıcıdan dta almak için yapılması gerekenler

        //1.Adım:Scanner class ından objeler olusturun.
              Scanner input = new Scanner(System.in);

        //2.Adım: Kullanıcıya ne yapavagını solememız gerekıyor.
        System.out.println("Hey kullanıcı yasını gır...");

        //3.Adım:Kullanıcıdan aldıgımız datayı bir varıable ın ıcıne koy.
        byte age = input.nextByte();
        System.out.println("Hey kullanıcı senin yasın "+ age);
    }
}
