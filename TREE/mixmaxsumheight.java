public class mixmaxsumheight {
    public   static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    static int sum(Node root){
        if(root==null) return  0;
        return  root.val+sum(root.left)+sum(root.right);
    }
    static int prod(Node root){
        if(root==null) return  1;
        return  root.val*prod(root.left)*prod(root.right);
    }
    static int max(Node root){
        if(root==null) return  Integer.MIN_VALUE;
        return  Math.max(root.val,Math.max(max(root.left),max(root.right)));

    }
    static int min(Node root){
        if(root==null) return  Integer.MAX_VALUE;
        return  Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return  0;
        return  1+Math.max(height(root.left),height(root.right));
    }
//    static void display(implementation.Node root){
//        if(root==null) return;
//        System.out.print(root.val+" ->,");
//        if(root.left!=null)
//            System.out.print(root.left.val+",");
//        else System.out.print("null,");
//        if(root.right!=null)
//            System.out.print(root.right.val+",");
//        else System.out.print("null,");
//        System.out.println();
//        display(root.left);
//        display(root.right);
//    }
    public static void main(String[] args) {
        Node root=new Node(2);
        Node a=new Node(3);
        Node b=new Node(4);
        root.left=a;
        root.right=b;
        Node c=new Node(5);
        Node d=new Node(1);
        a.left=c;
        a.right=d;
        Node e=new Node(8);
        b.right=e;
        Node f=new Node(6);
        e.right=f;
//        display(root);
        System.out.println("SUM of  tree "+sum(root));
        System.out.println("MAX in tree " +max(root));
        System.out.println("Min in tree " +min(root));
        System.out.println("Product in tree " +prod(root));
        System.out.println("Height of tree " +height(root));
    }
}
