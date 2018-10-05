package NEW.Tree.Heap;
/* Java program to checks if a binary tree is max heap ot not */

// A Binary Tree node
class Node
{
    int key;
    Node left, right;

    Node(int k)
    {
        key = k;
        left = right = null;
    }
}

public class isBinaryTreeMaxHeap {

    public static void main(String args[])
    {
        isBinaryTreeMaxHeap bt = new isBinaryTreeMaxHeap();

        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(2);
        root.left.right.left = new Node(1);

        if(bt.isHeap(root) == true)
            System.out.println("Given binary tree is a Heap");
        else
            System.out.println("Given binary tree is not a Heap");
    }

    private boolean isHeap(Node root) {
    if(root==null)
        return true;

    int node_count=countNodes(root);
    return isCompleteUtil(root,0,node_count)&&isHeapUtil(root);
    }

    private int countNodes(Node root) {
        if(root==null)
            return 0;

        return 1+countNodes(root.left)+countNodes(root.right);
    }

    boolean isCompleteUtil(Node root,int index,int totalNodes){

        if(root==null)
            return true;

        if(index>=totalNodes)
            return false;

        return isCompleteUtil(root.left,2*index+1,totalNodes) &&
                isCompleteUtil(root.right,2*index+2,totalNodes);
    }

    boolean isHeapUtil(Node root){
        if(root==null)
            return true;

        if(root.right==null && root.left==null)
            return true;

        if(root.right==null)
        {if(root.key>root.left.key)
            return true;
        return false;
        }
else {
            if(root.key>root.left.key &&root.key>root.right.key)
                return isHeapUtil(root.left)&&isHeapUtil(root.right);
else
            return false;
        }

    }

}
