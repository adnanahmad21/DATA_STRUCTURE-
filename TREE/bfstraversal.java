import java.util.ArrayDeque;
import java.util.Queue;

public class bfstraversal {
    public   static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }

    }
    static  void  bfstraversal(Node root){
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.peek();
            if(temp.left !=null) q.add(temp.left);
            if(temp.right!=null) q.add((temp.right));
            System.out.print(temp.val+" ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(7);
        Node b=new Node(9);
        root.left=a;
        root.right=b;
        Node c=new Node(2);
        Node d=new Node(6);
        a.left=c;
        a.right=d;
        Node g=new Node(5);
        d.left=g;
        Node h=new Node(11);
        d.right=h;
        Node e=new Node(9);
        b.right=e;
        Node f=new Node(5);
        e.left=f;
        System.out.println("Element traversal using bredth first search");
        bfstraversal(root);

    }
}
