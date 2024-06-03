class parentvehicle {
    String name;
    String vehicleType;
    float price;
    String colour;

    String engineType;
    String fueltype;
    parentvehicle(){

    }
 parentvehicle(String name){
    System.out.println(" Parent class is inherited by "+name);
 }
    // parentvehicle(String name, String vehicleType, float price, String Colour) {
    //     this.name = name;
    //     this.vehicleType = vehicleType;
    //     this.price = price;
    //     this.colour = colour;
    // }

     final void start() {
        System.out.println(this.name + " is start ");
    }
}