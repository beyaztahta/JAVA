package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){

        System.out.println("Solve questions...");
    }

    public Math(){
          super("Second");
        System.out.println("Constructor 1...");
    }
   public Math(int a) {
            this();//aynı methodun icinde diger constructoru kullan
        System.out.println("Constructor 2...");
   }























}
