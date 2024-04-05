public class llreverse {
    class Node {
        int data;
        Node next;
    }

    Node head, temp = null;
    static int size = 0;

    void create(int data) {

        Node newnode = new Node();
        newnode.data = data;
        if (head == null)
            head = newnode;
        else
            temp.next = newnode;
        temp = newnode;
        size++;
    }

    Node reverseList() {
     
        Node prevNode = null;
        Node currentNode = head;
        Node nexNode = null;
        while (currentNode != null) {
            nexNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nexNode;
        }
        return prevNode;

    }

    public static void main(String[] args) {
        llreverse ll = new llreverse();
        ll.create(5);
        ll.create(10);
        ll.create(15);
        ll.create(20);
        ll.create(25);
        ll.create(35);
        ll.create(40);
        ll.create(45);
        ll.create(50);
        ll.create(55);
        ll.create(60);
        ll.temp = ll.head;
        if(ll.size==0){ System.out.println("List is Empty");
        System.exit(0);
    }
        System.out.println("BEFORE REVERSING LIST");
        while (ll.temp != null) {
            System.out.print(" " + ll.temp.data+"->");
            ll.temp = ll.temp.next;
        }
        System.out.println();
        Node rev = ll.reverseList();
        System.out.println("AFTER REVERSING LIST");
        while (rev != null) {
            System.out.print(" " + rev.data+"->");
            rev = rev.next;
        }
    }
}
