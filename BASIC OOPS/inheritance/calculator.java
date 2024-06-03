class calculator1 { //PARENT CLASS
    int add(int a, int b) {
        return a + b;
    }
 
    int subtract(int a, int b) {
        return a - b;
    }
}

class calculator2 extends calculator1 { //CHILD CLASS -> SINGLE LEVEL INHERTANCE && PARENT OF CALCULATOR 3
    int mul(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

class calculator3 extends calculator2 { //CHILD CLASS  OF CALCULATOR 2 -> MULTI LEVEL INHERITANCE
    int mod(int a, int b) {
        return a % b;
    }

    int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}

class calculator {
    public static void main(String[] args) {
        calculator3 c2 = new calculator3();
        System.out.println(c2.add(5, 7));
        System.out.println(c2.subtract(5, 7));
        System.out.println(c2.mul(5,7));
        System.out.println(c2.divide(5,7));
        System.out.println(c2.pow(5, 2));
        System.out.println(c2.mod(5, 7));
    }
}
