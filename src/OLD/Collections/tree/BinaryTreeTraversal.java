package OLD.Collections.tree;

/**
 * Created by PRudrawar on 12/4/2017.
 */
public class BinaryTreeTraversal {
    static class Node{
        Node left,right;
        int key;
        Node(int val){
            key=val;
            left=null;
            right=null;
        }
    }
    Node root;
    BinaryTreeTraversal(){

        root=null;

    }

    public void printPreOrder(Node n){
        if(n==null)
            return;

        System.out.print(n.key+ "");

        printPreOrder(n.left);

        printPreOrder(n.right);

//        System.out.println();

    }

    public void printPostOrder(Node n){

        if(n==null)
            return;

        printPostOrder(n.left);

        printPostOrder(n.right);

        System.out.print(n.key+ "");

      //  System.out.println();



    }

    public void printInOrder(Node n){
        if(n== null)
            return;

        printInOrder(n.left);

        System.out.print(n.key);

        printInOrder(n.right);

  //      System.out.println();
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tt=new BinaryTreeTraversal();
        tt.root=new Node(4);
        tt.root.left=new Node(3);
        tt.root.left.left=new Node(1);
        tt.root.left.right=new Node(2);
        tt.root.right=new Node(5);
        tt.root.right.right=new Node(7);
        tt.root.right.left=new Node(6);

        tt.printPreOrder(tt.root); //root left right
        System.out.println();
        tt.printPostOrder(tt.root);//left right root
        System.out.println();
        tt.printInOrder(tt.root);  //left root right



    }
}
