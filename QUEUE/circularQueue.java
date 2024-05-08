public class circularQueue {
    public static class CQueue {
        int arr[] = new int[20];
        int size = 0;
        int front = -1;
        int rear = -1;

        void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return ;
            } else if (size == 0) {
                front = rear = 0;
                arr[front] = val;

            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[++rear] = val;
            }
            size++;

        }

        int remove() {
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;}
            else {
                int x = arr[front];

                if (front == arr.length - 1) {
                    front = 0;
                }

                else front++;
                size--;
                return x;
            }
            
            
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            } else
                return arr[front];

        }

        void display() {
            if (size == 0){
                System.out.println("Queue is Empty");
                return ;}
            else if(front>rear){
            for (int i = front; i <= arr.length-1; i++) 
                System.out.print(arr[i] + " ");
            for (int i = 0; i <= rear; i++) 
                System.out.print(arr[i] + " ");
            }
            else
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        CQueue q = new CQueue();
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
       System.out.println(q.peek());
       System.out.println(q.size);
       q.display();
       q.remove();
       System.out.println(q.peek());
       System.out.println(q.size);
       q.display();
       
       

    }
}
