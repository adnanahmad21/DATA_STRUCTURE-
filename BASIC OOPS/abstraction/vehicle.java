 sealed abstract class vehicle1  permits car,bike{

    abstract void accelerate();

    abstract void brake();
    void start() {
        System.out.println(" start");
    }
    int vehilce_No;
}

 final class car extends vehicle1 {
   
 int vehilce_No;
   public  void accelerate() {

        System.out.println("Car is  accelerating");

    }

    public void brake() {
        System.out.println("Car have brake");
    }

}

final class bike extends vehicle1 {
 bike(){
    System.out.println("wfwf");
 }
    public void accelerate() {

        System.out.println("bike is  accelerating");

    }

    public void brake() {
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
       

        System.out.println(c1.vehilce_No);

    }
}