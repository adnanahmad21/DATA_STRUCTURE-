import java.util.InputMismatchException;
import java.util.Scanner;

class trycache {
    public static void main(String[] args) throws Exception {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        try {
            System.out.printf("Before error\n ");
            // System.out.println(a[9]);
            int x = 5 / 10;
            int y;
            y = new Scanner(System.in).nextInt();
            String str = new Scanner(System.in).next();
            int n = Integer.parseInt(str);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("After error");
        }
    }
}
