class nestedClass {
    int a = 5;
    float y = 1.1f;
    String name = "AdnanAhmad";

    class nested1 {

        void print() {
            System.out.println("nested 1 is called");
        }

    }

    class nested2 {

        void print() {
            System.out.println("nested 2 is called");
        }

    }

    public static void main(String[] args) {
        // different ways to sccess outr to innr
        nestedClass n1 = new nestedClass();
        System.out.println(new nestedClass().name); // instead of n1.name
        n1.new nested1().print(); // to access innerclass via outer object
        n1.new nested2().print();
        nested1 c1 = n1.new nested1(); // to create object for innerclass
        nested2 c2 = n1.new nested2();
        c1.print();
        c2.print();
        nested1 c3 = new nestedClass().new nested1(); // to use outerclass without object
        c3.print();
        nested2 c4 = new nestedClass().new nested2();
        c4.print();

    }

}
