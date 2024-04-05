import java.util.Scanner;

class lldeletion {
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

    void deletionAtBeg() {
        if (size == 0)
            System.out.println("UnderFlow");
        else {
            head = head.next;
            size--;
        }

    }

    void deletionAtLast() {
        if (size == 0)
            System.out.println("UnderFlow");
        else {
            Node prev = head;
            temp = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            size--;
        }
    }

    void deletionAtPosition(int position) {
        if (size == 0)
            System.out.println("UnderFlow");
        else {
            Node prev = head;
            temp = head;
            int i = 0;
            while (i < position - 1) {
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
            size--;
        }
    }

    void display() {
        temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lldeletion ll = new lldeletion();
        int choice, position, data;
        Scanner sc = new Scanner(System.in);
        ll.create(5);

        int i = 0;
        while (i < 1) {
            System.out.println("Enter Choice");
            System.out.println("1 for deletion at beg");
            System.out.println("2 for deletion at last");
            System.out.println("3 for deletion at any position");
            System.out.println("4 for display");
            System.out.println("5 for exit");
            choice = sc.nextInt();
            if (choice == 1) {

                ll.deletionAtBeg();
                System.out.println("Data deleted successfully");
            } else if (choice == 2) {
                ll.deletionAtLast();
                System.out.println("Data  deleted  successfully");
            }

            else if (choice == 3) {
                System.out.println("Enter position");
                position = sc.nextInt();
                if (position > size)
                    System.out.println("Enter correct position");
                else if (position == 1)
                    ll.deletionAtBeg();
                else if (position == size)
                    ll.deletionAtLast();
                else
                    ll.deletionAtPosition(position);
                System.out.println("Data deleted successfully");
            } else if (choice == 4) {
                ll.display();
            } else if (choice > 5 || choice < 1)
                System.out.println("Invalid choice");
            else if (choice == 5)
                System.exit(0);
        }

    }
}