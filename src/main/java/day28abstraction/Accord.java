package day28abstraction;

public class Accord implements Engine,Ac,Hood {


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");

    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi tecnology");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital Ac");
    }

    @Override
    public void climatel() {
        System.out.println("Uses climatel tecnology");
    }

    @Override
    public void steel() {
        System.out.println("Hood is made steel");
    }
}
