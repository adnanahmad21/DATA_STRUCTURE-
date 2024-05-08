import java.util.Arrays;
import java.util.Stack;

public class nextGreaterelement2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        int a[] = { 1, 5, 3, 2, 1, 6, 3, 4 };
        int ans[]=new int[a.length];
        st.push(0);
        for(int i=1;i<a.length;i++){
            while (st.size()!=0 && a[st.peek()]<a[i]) {
                ans[st.pop()]=a[i];
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
