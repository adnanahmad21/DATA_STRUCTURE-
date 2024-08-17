class calc {
    calc() {

    }

    calc(int x, int y) {
        System.out.println(x + y);
    }

    static void add(int x, int y) {
        System.out.println(x + y);
    }

    void add1(int x, int y) {
        System.out.println(x + y);
    }
}

interface cal {
    void sum(int x, int y);
  
}
public class methodreference {
    public static void main(String[] args) {
        cal c = calc::add;
        c.sum(5, 10); // static method of refernce
        calc c1 = new calc();
        cal c11 = c1::add1; // instance method
        c11.sum(5, 10);

        cal c12 = calc::new;
        c12.sum(5, 10);
    }
}

