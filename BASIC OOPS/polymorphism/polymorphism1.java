class car {
    String name;
    float price;
    String colour;

    void start() {
        System.out.println(" car is start");
    }
// method overloading
    int kms(int actual) {
    return actual+12;
    }

    int kms(int actual, int given) {
        return actual + given;
    }
}

class polymorphism1 extends car {
    @Override
    int kms(int actual) {
        return actual;
    }

    public static void main(String[] args) {

        polymorphism1 p1 = new polymorphism1();

        System.out.println(p1.kms(5));
        System.out.print(p1.kms(5, 7));

    }
}