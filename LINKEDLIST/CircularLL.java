import java.util.Scanner;
public class CircularLL {
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	Node head = null;
	Node temp;
	static int size = 0;
	void create(int data) {
		Node newnode = new Node(data);
		if (head == null)
			head = newnode;
		else{
			temp.next = newnode;
        newnode.next=head;}
        temp = newnode;
		size++;
	}
	void insertAtBeg(int data) {
		if (size == 0) {
			create(data);
		} else {
			Node newnode = new Node(data);
			newnode.next = head;
			head = newnode;
            newnode.next=head;
		}
		size++;
    }
	void insertAtLast(int data) {
		if (size == 0 ) {
			create(data);
		} else {
			temp = head;
			while (temp.next!=null &&temp.next != head)
				temp = temp.next;
			Node newnode = new Node(data);
			temp.next = newnode;
            newnode.next=head;
		}
        
		size++;
	}
	void insertAtPosition(int data, int position) {
		int i = 0;
		temp = head;
		while (i < position - 1) {
			temp = temp.next;
			i++;
		}
		Node newnode = new Node(data);
		newnode.next = temp.next;
		temp.next = newnode;
		size++;
	}

	void display() {
   if(size!=0) {
        System.out.print(" " + head.data);
		temp = head.next;
        
		while (temp!= head) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}}

	public static void main(String args[]) {
		CircularLL ll = new CircularLL();
		int choice, position, data;
	

		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i < 1) {
			System.out.println("Enter Choice");
			System.out.println("1 for insert at beg");
			System.out.println("2 for insert at last");
			System.out.println("3 for insert at any position");
			System.out.println("4 for display");
			System.out.println("5 for exit");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter data");
				data = sc.nextInt();
				ll.insertAtBeg(data);
				System.out.println("Data insert at beg successfully");
			} else if (choice == 2) {
				System.out.println("Enter data");
				data = sc.nextInt();
				ll.insertAtLast(data);
				System.out.println("Data insert at last  successfully");
			}

			else if (choice == 3) {
				System.out.println("Enter data and position");
				data = sc.nextInt();
				position = sc.nextInt();
				if (position > size)
					System.out.println("Enter correct position");
				else if (position == 0)
					ll.insertAtBeg(data);
				else if (position == size)
					ll.insertAtLast(data);
				else
					ll.insertAtPosition(data, position);
				System.out.println("Data insert at specific pos  successfully");
			} else if (choice == 4) {
				ll.display();
			} else if (choice > 5 || choice < 1)
				System.out.println("Invalid choice");
			else if (choice == 5)
				System.exit(0);
		}

	}
}
