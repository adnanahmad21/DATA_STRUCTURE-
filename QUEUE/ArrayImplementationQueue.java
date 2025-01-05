

public class ArrayImplementationQueue {

    public static class Queue {
        int arr[] = new int[20];
        int size = 0;
        int front = -1;
        int rear = -1;
    
        void add(int val) {
            if (rear == arr.length-1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                arr[++front] = val;
                rear++;
            } else
                arr[++rear] = val;
                
            size++;
    
        }
    
        int remove() {
            if (front == rear ) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[0];
            for(int i=0;i<rear;i++)
            arr[i]=arr[i+1];
            size--;
            return x;
        }
    
        int peek() {
            if (front != -1) {
                int x = arr[front];
                return x;
            } else
                return -1;
        }
      boolean isEmpty(){
        if(rear==-1) return true;
        else return false;
      }
        void display() {
            if(!isEmpty()){
            for (int i = 0; i <=rear; i++) {
                System.out.print(arr[i] + " ");
            }
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
        q.display();
        q.remove();
        q.display();

    }
}
