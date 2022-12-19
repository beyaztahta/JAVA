package day28abstraction;

public class Dog extends Mammal{

    @Override
    public void eat() {
        System.out.println("Dog eats...");
    }

    @Override
    public void drink() {
        System.out.println("Dogs drink...");
    }

    @Override
    public void move() {
        System.out.println("Dogs move...");
    }
}
