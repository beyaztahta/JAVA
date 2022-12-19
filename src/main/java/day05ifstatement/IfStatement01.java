package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1: Kullanıcıdan alınan sayının tek mi cıft mi oldugunu ekrana yazdıran kodu yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int s = input.nextInt();
        //1.YOL
        if (s % 2 == 0) {
            System.out.println("cift sayı");
        }
        //"!=" eşit degıl demektır.
        if (s % 2 != 0) {
            System.out.println("tek sayı");
        }
        //2.YOL
        if (s % 2 == 0) {
            System.out.println("cift sayı");
        } else {
            System.out.println("tek sayı");
        }
        //Example 2:Bir sayının negatif,pozitif ve notr oldugunu soyleyen kodu yazınız.

        System.out.println("Bir sayı giriniz.");
        double d = input.nextDouble();
        if (d > 0) {
            System.out.println("cift sayı");
        } else if (d == 0) {
            System.out.println("notr");
        } else {
            System.out.println("negatif");

        }
    }
}