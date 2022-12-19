package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanıcıdan bir dikdortgenin en ve boyunu alıp ,alan ve cevresini hesaplayan kodu yazınız.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenın enini giriniz...");
        int en = input.nextInt();

        System.out.println("Dikdortgenın boyunu gırınız...");
        int boy = input.nextInt();

        System.out.println("Alan"+(en*boy));
        System.out.println("cevre"+2*(en+boy));
    }

}
