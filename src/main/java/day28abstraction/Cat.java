package day28abstraction;

public class Cat extends Mammal{

       /*
          method parentclass da abstract method ise;
         1) Child class o methodu "override" edip kullanmak zorundadir.
         2)O yuzden herhangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method u abstract method yapmalisiniz
    */

    @Override
    public void eat() {
        System.out.println("Cats eat..");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void move() {
        System.out.println("Cats move..");
    }
}
