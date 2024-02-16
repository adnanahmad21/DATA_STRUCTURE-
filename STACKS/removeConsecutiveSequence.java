import java.util.Arrays;
import java.util.Stack;

public class removeConsecutiveSequence {
    static int[] remove(int a[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            if (st.isEmpty() || st.peek() != a[i])
                st.push(a[i]);
            else if (i == a.length - 1 || a[i] != a[i + 1])
                st.pop();
        }
        int result[] = new int[st.size()];
        for (int i = st.size() - 1; i > -1; i--)
            result[i] = st.pop();
        return result;
    }


    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 5, 7, 7, 2};
        int result[] = remove(a);
        System.out.println(Arrays.toString(result));
    }

}