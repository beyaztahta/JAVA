package day32maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

     //Size verilen bir kelimedeki kullanılan harflerin kacar kere kullanıldıgını gosteren kodu yazınız.


        String str="abbcaa";

        HashMap<String,Integer>gorunum=new HashMap<>();//{  gorunum mapi                  }

        String str1[]=str.split("");

        for (String w:str1) {
           Integer gorunumSayısı= gorunum.get(w);
           if(gorunumSayısı==null){
               gorunum.put(w,1);
           }else{
               gorunum.put(w,gorunumSayısı+1);
           }
        }
        System.out.println(gorunum); //{a=3, b=2, c=1}
    }
}
