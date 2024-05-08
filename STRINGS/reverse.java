public class reverse {
    public static void main(String[] args) {
        String str = "My Name is ADNAN AHMAD";
        String gtr = "";
        int x = 0;
        int j = str.length() - 1;
        for (j = str.length() - 1; j > -1; j--) {
            gtr = gtr + str.charAt(j);
        }

        System.out.println(gtr);

    }
}
