import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int a[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
        int nge[] = new int[a.length];
        nge[a.length - 1] = -1;
        st.push(a[a.length - 1]);
        for (int i = a.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < a[i])
                st.pop();
            if (st.isEmpty())
                nge[i] = -1;
            else
                nge[i] = st.peek();
            st.push(a[i]);
        }
        System.out.println(Arrays.toString(nge));
    }

}
