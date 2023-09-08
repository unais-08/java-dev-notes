class Car {
    int wheel;
    boolean staring = true;
    String brand1 = "vary for every company";
    double price;
}

class BMW extends Car {
    String brand = "BMW";

}

public class ClassAndObject {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.wheel = 5;
        int newdata = car1.wheel;
        System.out.println(newdata);
        // if (newdata!=4) {
        // car1.staring=false;
        // }
        System.out.println(car1.staring);

        // new class instance which is BMW
        BMW refBmw = new BMW();
        System.out.println(refBmw.brand);
        refBmw.staring = false;
        System.out.println(car1.staring);
        System.out.println(refBmw.staring);

        System.out.println(car1.brand1);

    }

}
