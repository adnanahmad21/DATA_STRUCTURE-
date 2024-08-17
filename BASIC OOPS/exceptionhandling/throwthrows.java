public class throwthrows {

    public void errors()  throws Exception {
        System.out.println("before error");
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
      int ac= a[1]/0;

    }

    public static void main(String[] args) {
        try {
            new throwthrows().errors();
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            // System.out.println(e);
        }
    }
}
