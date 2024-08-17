import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class collectionsFramework {
    void ArrayListt() {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        System.out.println(ar.size());
        System.out.println(ar.contains(2));
        System.out.println(ar.get(1));
        System.out.println(ar.remove(3));
        System.out.println(ar);
        System.out.println(ar.add(5));
    }

    void LinkedListt() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println(ll.size());
        System.out.println(ll.clone());
        System.out.println(ll.isEmpty());
        System.out.println(ll);

    }

    void Stacks() {
        Stack<String> st = new Stack<>();
        st.push("Hello");
        st.push("EveryOne");
        st.push(" ");
        st.push("My name is Adnan Ahmad");
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st);

    }

    void Queue() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q);

        q.offer(6);
        System.out.println(q);

    }

    public static void main(String[] args) {
        collectionsFramework cf = new collectionsFramework();
        // cf.ArrayListt();
        // cf.LinkedListt();
        // cf.Stacks();
        cf.Queue();
    }
}