public class LinkedListImplementationQueue {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Queue {
        Node front = null;
        Node rear = null;
        Node head = null;
        Node temp = null;
        int size = 0;

        void add(int val) {
            Node newNode = new Node(val);
            if (head == null)
                head = temp = front = rear = newNode;
            else
                temp.next = newNode;
            temp = newNode;
            rear = newNode;
            size++;
        }

        Node remove() {
            if (front == null) {
                System.out.println("Empty Queue");
                return null;
            }
            size--;
            Node x = front;
            front = front.next;
            return x;
        }

        int peek() {
            if (front != null)
                return front.data;
            return -1;
        }

        void display() {
            temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        q.add(30);
        q.add(35);
        q.add(40);
        q.add(45);
        q.add(50);
        System.out.println(q.peek());
        System.out.println(q.size);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.display();

    }
}
