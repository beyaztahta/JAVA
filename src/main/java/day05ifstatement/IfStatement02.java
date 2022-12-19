package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 1:Kullanıcı gun numarası girsin,kod gun ismini yazsın.
        Scanner input=new Scanner(System.in);
        System.out.println("Gun numarasını giriniz");
        byte gunNo=input.nextByte();
        if(gunNo==1) {
            System.out.println("pazar");
        }else if(gunNo==2) {
            System.out.println("pazartesi");

        }else if(gunNo==3){
            System.out.println("salı");
        }else if(gunNo==4){
            System.out.println("carsamba");
        }else if(gunNo==5){
            System.out.println("persembe");
        }else if(gunNo==6){
            System.out.println("cuma");
        }else if(gunNo==7){
            System.out.println("cumaertesi");
        }else{
            System.out.println("Gecerli bir gun numarası giriniz.Gecerli gun numaraları 1,2,3,4,5,6,7 den birisidir");

        }

    }
}
