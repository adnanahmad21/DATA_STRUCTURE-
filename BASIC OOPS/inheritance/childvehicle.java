
//heirarchial representation  of inheritance
public class childvehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.vehicleType = "Car";
        obj.name = "Alto";
        obj.colour = "Maroon";
        obj.price = 423775.00f;
        obj.bioData();
        System.out.println();
        Bike obj1 = new Bike();
        obj1.vehicleType = "Bike";
        obj1.name = "PulsarN160";
        obj1.colour = "Black";
        obj1.price = 152375.00f;
        obj1.fueltype = "Petrol";
        obj1.bioData();
        System.out.println();
        Scooty obj2 = new Scooty();
        obj2.vehicleType = "Scooter";
        obj2.name = "Activa5g";
        obj2.colour = "White";
        obj2.price = 952375.00f;
        obj2.fueltype = "Petrol";
        obj2.bioData();
    }

}

class Car extends parentvehicle {
    Car() {
    super("Alto");  // call parentvehicle constructor or parent co=lass constructuor
    super.start(); // call parent stsrt( )method
 
    }

    // void start() { // final method cannot be recreated
    //     System.out.println("Car start");
    // }

    void bioData() {
        System.out.println("Vehicle Type = " + vehicleType);
        System.out.println("Name of " + vehicleType + " is " + name);
        System.out.println("Colour = " + colour);
        System.out.println("Price = Rs" + price);
        start();
    }

}

class Bike extends parentvehicle {
    Bike() {

    }

    // void start() {
    //     System.out.println("Bike start");
    // }

    String engineType;
    String fueltype;

    void bioData() {
        System.out.println("Vehicle Type = " + vehicleType);
        System.out.println("Name of " + vehicleType + " is " + name);
        System.out.println("Colour = " + colour);
        System.out.println("Price = Rs" + price);
        start();
    }
}

class Scooty extends parentvehicle {
    Scooty() {

    }

    // void start() {
    //     System.out.println("Bike start");
    // }

    String engineType;
    String fueltype;

    void bioData() {
        System.out.println("Vehicle Type = " + vehicleType);
        System.out.println("Name of " + vehicleType + " is " + name);
        System.out.println("Colour = " + colour);
        System.out.println("Price = Rs" + price);
        start();
    }

}