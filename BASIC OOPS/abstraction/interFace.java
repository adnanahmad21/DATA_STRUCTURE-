interface phone {

    int price = 15000;
    int ram = 8;

    void funct();

    void call();

    default void print() {
        System.out.println("phone interface  is called");
    }

}

interface laptop extends phone {
    // int price = 55000;
    int ram = 16;

    void funct();

    void call();

    void software(String os);

    void display();

}

class samsung implements laptop {
    String company = "Samsung";

    public void funct() {
        System.out.println("phone is working");
    }

    public void call() {
        System.out.println("Someone is calling");
    }

    public void software(String os) {
        System.out.println("Sogtware use = " + os);
    }

    public void display() {
        System.out.println("display is on");
    }

}

public class interFace {
    public static void main(String[] args) {
        samsung s1 = new samsung();
        s1.funct();
        s1.call();
        s1.software("android");
        s1.print();
        s1.display();
        System.out.println(samsung.price);

    }
}
