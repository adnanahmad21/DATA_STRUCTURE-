public class pattern {
    static void print(int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            print(row, col + 1);
            System.out.print("* ");
        } else {
            print(row - 1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4, 0);
    }
}
