package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //Size verilen bir cumledeki kelimenin kac kere kullanıldıgını gosteren kodu yazınız.
        //I like to move it, move it.I=1,like=1,to=1,move=2,it=2

        String str="I like to move it, move it.";

        str=str.replaceAll("\\p{Punct}","");//Noktalama isaretlerini sildik

        System.out.println(str);

        String arr[]=str.split(" ");//Kelimeleri almak için split methodu kullandık
        System.out.println(Arrays.toString(arr)); //[I, like, to, move, it, move, it]

        HashMap<String,Integer>gorunum=new HashMap<>();

        for (String w:arr) {
            Integer gorunumSayısı=gorunum.get(w);
            if(gorunumSayısı==null){
                gorunum.put(w,1);
            }else{
                gorunum.put(w,gorunumSayısı+1);
            }
        }
        System.out.println(gorunum);

        //






    }
}
