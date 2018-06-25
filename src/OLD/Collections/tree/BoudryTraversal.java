package OLD.Collections.tree;

public class BoudryTraversal {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.left=this.right=null;
            this.data=data;
        }

    }
    static Node root;
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        boundryTraversal(root);
    }

    private static void boundryTraversal(Node root) {
            traverseLeft(root);//top down
           printleafElements(root);//all leaf
           traverseRight(root);//bottom up
    }

    private static void traverseRight(Node root) {
    if(root==null)
        return;
    if(root.right!=null)
    {
        traverseRight(root.right);
        System.out.print(root.data +" ");
    }
    else if(root.left!=null) {
        traverseRight(root.left);
        System.out.print(root.data +" ");
    }

    }

    private static void printleafElements(Node root) {
        if(root==null)
            return;

        if(root.left!=null)
            printleafElements(root.left);
        if(root.right!=null)
            printleafElements(root.right);

        if(root.left==null &&root.right==null)
            System.out.print(root.data+" ");
    }

    private static void traverseLeft(Node root) {
            if(root==null)
                return;


            if(root.left!=null){
                System.out.print(root.data+" ");
                traverseLeft(root.left);
            }else if(root.right!=null){
                System.out.print(root.data+" ");
                traverseLeft(root.right);
            }


    }
}
