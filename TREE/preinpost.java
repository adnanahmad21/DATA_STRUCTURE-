public class preinpost {
    public   static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
static  void preorderTraversal(Node root){
        if(root==null) return;;
    System.out.print(root.val+" ");
    preorderTraversal(root.left);
    preorderTraversal(root.right);


}
    static  void nthlevel(Node root,int level) {
        if (root == null) return;
        if (level == 1)
            System.out.print(root.val + " ");
        nthlevel(root.left, level - 1);
        nthlevel(root.right, level - 1);
    }
    static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return  0;
        return  1+Math.max(height(root.left),height(root.right));
    }
    static  void inorderTraversal(Node root){
        if(root==null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
    static  void postorderTraversal(Node root){
        if(root==null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val+" ");
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

        System.out.println("PREORDER => ");
        preorderTraversal(root);
        System.out.println("\nINORDER => ");
        inorderTraversal(root);
        System.out.println("\nPOSTORDER => ");
        postorderTraversal(root);
        System.out.println("\nnthlevel => ");
        int level=height(root)+1;
        for(int i=1;i<=level;i++) {
            nthlevel(root, i);
            System.out.println();
        }

    }
}
