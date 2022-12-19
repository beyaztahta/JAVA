package day25exception;

public class E02 {
    public static void main(String[] args) {
        String arr[]={"ali","alican","veli","han"};
        getElementFromArray(arr,2);//veli
        getElementFromArray(arr,0);//ali
        getElementFromArray(arr,1);//alican
        getElementFromArray(arr,3);//han
        getElementFromArray(arr,4);//ArrayIndexOutOfBoundsException hatası verdi.

    }
    //Bir string arrayden indeks girerek eleman elde edebilmek için bir method olusturun.

    public static void getElementFromArray(String arr[],int idx){
        try{
            System.out.println(arr[idx]);

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array index te bir problem meydana geldi.===>"+ e.getMessage());//bu benim teknik olmayan acıklamam.
            e.printStackTrace();//Exception (Alınan hata ) ile ilgili teknik mesaj verecek.
            System.err.println("Array index te bir problem yasandı.");// hata mesajını dıger hata mesajlarından ayırmak için kullanırız
        }

    }
}
