package day28abstraction;

public  class Bird extends Animal{

    @Override
    public void eat() {
        System.out.println("Bird eat...");
    }

    @Override
    public void drink() {
        System.out.println("Birds drink water...");
    }

    @Override
    public void move() {
        System.out.println("Birds move...");
    }
}
