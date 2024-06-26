interface example {
    int sum(int a, int b); // functional interface
   
}

class fucntionalInterface {
    public static void main(String[] args) {
        // lambda expression
        example ex = (a, b) -> {
            return a + b;
        };
        System.out.println(ex.sum(5, 7));
        example ex1 = (a, b) -> (a+b);
        // OR
      
        System.out.println(ex1.sum(15, 7));
    }
}
