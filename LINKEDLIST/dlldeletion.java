import java.util.Scanner;

public class dlldeletion {
    class Node 
    {
        int data;
        Node prev;
        Node next;
        Node(int data){ 
            this.data=data;
        }
    }

static Node head = null;
static Node temp = null;
static Node last = null;
static int size = 0;
void add(int data) {
    Node newNode = new Node(data);
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
        Node prev1 = head;
        temp = head;
        while (temp.next != null) {
            prev1 = temp;
            temp = temp.next;
        }
        prev1.next = null;
        last=prev1;
        size--;
    }
}
void deletionAtPosition(int position) {
    if (size == 0)
        System.out.println("UnderFlow");
    else {
        Node prev1 = head;
        temp = head;
        int i = 0;
        while (i < position - 1) {
            prev1 = temp;
            temp = temp.next;
            i++;
        }
        prev1.next = temp.next;
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
    dlldeletion ll = new dlldeletion();
    int choice, position, data;
    Scanner sc = new Scanner(System.in);
    ll.add(5);
    ll.add(10);
    ll.add(15);
    ll.add(20);
    ll.add(25);
    ll.add(30);
    ll.add(35);
    ll.add(40);

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
