public class doublyLL {
    class Node 
    {
        int data;
        Node prev;
        Node next;
    }
    static Node head = null;
    static Node temp = null;
    static Node last = null;
    static int size = 0;
    void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null)
            head = newNode;
        else {
            temp.next = newNode;
            newNode.prev = temp;
        }
        temp = newNode;
        last = newNode;
        size++;
    }
    public static void main(String[] args) {
        doublyLL ll = new doublyLL();
        ll.add(5);
        ll.add(15);
        ll.add(20);
        ll.add(25);
        ll.add(30);
        ll.add(35);
        ll.add(40);
        temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
        temp = last;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.prev;
        }
    }
}
