import java.util.Stack;

public class StacksImplementation2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head = null;
        int idx = 0;
        int i = 0;

        void push(int data) {
            Node newNode = new Node(data);
            if (head != null)
                newNode.next = head;
            head = newNode;
            idx++;
        }

        int pop() {
            int x = head.data;
            head = head.next;
            idx--;
            return x;
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            return false;
        }

        int peek() {
            if (head != null)
                return head.data;
            return -1;
        }

        void displayrec(Node temp) {
            if (temp == null)
                return;
            displayrec(temp.next);
            System.out.print(temp.data + " ");
        }

        void display() {
            displayrec(head);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.push(30);
        st.push(35);
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.display();
    }
}
