package day28abstraction;

public abstract class Animal {

    //Body si olmayan methodlar "abstract method"olarak adlandırılır.
    //Bir methodu abstract yapmal içn 1)method body i sil.2) "abstract "keyword kullan.
    //"abstract method"lar abstract class icinde olmalıdır.
  // "abstract"classlar da hem "abstract" method hem de "concarate(non-abstract)"method kullanılabilir.

    public abstract void eat();

    public void drink(){
        System.out.println("Animals drink...");
    }

    //abstract "move" method olusturunuz.

    public abstract void move ();



}

