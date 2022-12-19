package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example:Sayıları kullanıcıdan alan ve toplama islemi yapan kodu gırınız.

        //1.Adım:Scanner classından obje olusturun.
            Scanner input = new Scanner(System.in);

        //2.Adım:Kullanıcıya ne yapacagını soyle.

        System.out.println("Ilk sayıyı gırınız...");
        double sayı1 = input.nextDouble();

        System.out.println("Ikıncı sayıyı gırınız...");
        double sayı2 = input.nextDouble();

        System.out.println( sayı1+sayı2 );

    }
}
