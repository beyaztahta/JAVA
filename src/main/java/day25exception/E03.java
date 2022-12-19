package day25exception;

public class E03 {
    public static void main(String[] args) {
        String str="Ali";
        getNumOfChars(str);//3

        String s="";
        getNumOfChars(s);//0

        String t=null;
        getNumOfChars(t);//NullPointerException
        //Eger length() methodunda null kullanırsanız bu exception ı alırsınız.
    }
    //Bir string de bulunan karakterlerin sayısını bulabilmek için bir method olusturun.
    public static void getNumOfChars(String str){
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("length() methodunda bir problem olustu");
            e.printStackTrace();//bu methodu kullandıgınız zamna sout u kullanmanıza gerek yok,kendi icerisınde var

        }

    }
}
