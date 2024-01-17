import java.util.Stack;

class stacks01 {
    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) {
            st.pop();
            return;
        }
        int x = st.pop();

        reverse(st);
        st.push(x);

    }

    public static void remove(Stack<Integer> st, int idx) {
        // Stack<Integer> rt = new Stack<>();
        // if (idx > st.size())
        // return;
        // while (st.size() > idx)
        // rt.push(st.pop());
        // st.pop();
        // while (rt.size() > 0)
        // st.push(rt.pop());
        if (st.size() == idx) {
            st.pop();
            return;
        }
        int x = st.pop();
        remove(st, idx);
        st.push(x);

        
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        // reverse(st);'
        remove(st, 8);
        System.out.println(st);

    }
}