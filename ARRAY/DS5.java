import java.util.Scanner;

class DS5 {
    
    public static void main(String[] args) {
        String a;
        int b[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.next();
        try {
            for (int i = 0; i < 5; i++) {
                b[i] = (int) a.charAt(i);
                if (b[i] >= 65)
                    sum += (b[i]);
                else
                    sum += b[i] - 48;

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println(sum);

    }

}
