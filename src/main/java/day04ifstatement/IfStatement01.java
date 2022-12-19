package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.

        int s = 12;
        if(s>0){
            System.out.println("Positive");
        }
        //Example 2: Verilen character buyuk harf ıse ekrana 'Buyuk Harf' yazdırın.
        char ch ='V';
         if(ch>='A' && ch<='Z'){
             System.out.println("Buyuk Harf");
         }
          /*
            && islemi sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
            && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.
        */

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli" yazdiriniz.
         int n = 123;
         n=Math.abs(n);
         if(n>=100 && n<=999){
             System.out.println("Uc basamaklı");
         }
        //Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.
         int p =-18;
         p=Math.abs(p);
         if(p%2==0){
             System.out.println("Cift sayı");
         }

        // "=" isareti atama operatorudur, matematikteki esittir anlamina gelmez.
        //        //Matematikteki esittir sembolu Java'da "==" seklindedir
        //        //2+3  ==  5

        //Example 5:Verilen sayI 300 den kucuk veye 1200 den buyuk ise ekrana "HarikaSayı" yazdırın.
         int r = 250;
         if(r<300 || r>1200){
             System.out.println("HarikaSayı");
         }
         /*
             || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false
            Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter
         */

    }
}
