public class StacksImplementation {
    static class stack {
        int a[] = new int[5];
        int top = 0;

        void push(int x) {
            a[top] = x;
            top++;
        }

        int pop() {
            if (top != 0) {
                return a[--top];
            } else
                return -1;
        }

        int peek() {
            if (top != 0)
                return a[top - 1];
            else
                return -1;
        }

        boolean isEmpty() {
            int i = 0;
            while (i < top) {
                if (a[i] != 0)
                    return false;
            }
            return true;
        }

        int size() {
            int i = 0;
            while (i < top) {
                i++;
            }
            return i;
        }

        void display() {
            System.out.print("[");
            for (int i = 0; i < top; i++) {
                // System.out.println("[");
                System.out.print(a[i] + " ");
            }
            System.out.print("]");
            System.out.println();
        }

        void reverse() {
            System.out.print("[");
            for (int i = top - 1; i > -1; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.reverse();
        System.out.println("Stack size " + st.size());
        System.out.println("Peak Element " + st.peek());
        System.out.println("Pop Element " + st.pop());
        System.out.println("Peak Element " + st.peek());
        System.out.println(st.isEmpty());

    }

}