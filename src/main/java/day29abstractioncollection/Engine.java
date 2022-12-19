package day29abstractioncollection;

public interface Engine extends Vehicle{
      //child                 parent
    //class-------->         interface implements
    //class-------->          class   extends
    //interface ------>      interface  extends
    //interface-------->     class   mumkun degil

    //"interface "lerdeki tum variablelar otomatik olarak(default) " public" tir.
    //"interface "lerdeki tum variablelar otomatik olarak "final" dır.
    //"interface "lerdeki tum variablelar otomatik olarak "static"tir.
    int price=2000;

    double weight=23.5;

    void run();
}

