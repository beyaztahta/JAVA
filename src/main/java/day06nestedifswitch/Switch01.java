package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
          /*
            Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz
            1 ==> Pazar       2 ==> Pazartesi   ...
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir gub ismi giriniz");
        byte gunNo=input.nextByte();
        if(gunNo==1){
            System.out.println("pazar");
        }else if(gunNo==2){
            System.out.println("pazartesi");
        }else if(gunNo==3){
            System.out.println("salı");
        }else if(gunNo==4){System.out.println("carsamba");
        }else if(gunNo==5){System.out.println("persembe");
        }else if(gunNo==6){System.out.println("cuma");
        }else if(gunNo==7){ System.out.println("cumartesi");
        }else{
            System.out.println("Gecerli bir gun numarası giriniz");
        }
        //2.yol SWİTCH
        switch(gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persambe");
                break;
            case 6:
                System.out.println("cuma");
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("Gecerli bir gun sayısı giriniz.");
        }



    }
}
