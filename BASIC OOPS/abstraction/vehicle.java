abstract class vehicle1 {
    abstract void accelerate();

    abstract void brake();

    int vehilce_No;

    void start() {
        System.out.println(" start");
    }
}

class car extends vehicle1 {

    car() {
        System.out.println("hihisa");
    }

    void accelerate() {

        System.out.println("Car is  accelerating");

    }

    void brake() {
        System.out.println("Car have brake");
    }

}

class bike extends car {

    void accelerate() {

        System.out.println("bike is  accelerating");

    }

    void brake() {
        System.out.println("bike have brake");
    }

}

/**
 * vehicle
 */
public class vehicle {

    public static void main(String[] args) {
        car c1 = new car();
        c1.accelerate();
        c1.brake();
        c1.vehilce_No = 1790;

        System.out.println(c1.vehilce_No);
        bike b1 = new bike();
        b1.accelerate();
        b1.brake();
        b1.vehilce_No = 0415;
        b1.start();

        System.out.println(c1.vehilce_No);

    }
}