package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {


        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
//static variablelara objeleri kullanarak ulasmak mumkun ama uzun yoldur.
        System.out.println(car1.price);
        System.out.println(car1.counter);

   //static variablelara class ismi kulanarak ulasılmalıdır.
        System.out.println(Car.counter);

        System.out.println(car2.price);
        System.out.println(Car.counter);

        System.out.println(car3.price);
        System.out.println(Car.counter);

        System.out.println(Car.counter);
        System.out.println(car4.price);
    }
}
