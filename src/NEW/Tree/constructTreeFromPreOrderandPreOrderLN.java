package NEW.Tree;

import java.util.LinkedList;
import java.util.Queue;

/* int pre[] = new int[]{10, 30, 20, 5, 15};
        char preLN[] = new char[]{'N', 'N', 'L', 'L', 'L'};
        */
public class constructTreeFromPreOrderandPreOrderLN {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
static Node root;
    public static void main(String[] args) {
        int pre[] = new int[]{10, 30, 20, 5, 15};
        char preLN[] = new char[]{'N', 'N', 'L', 'L', 'L'};
        root=constructTree(pre,preLN,root);
        printPreOrder(root);
    }

static int i;
    private static Node constructTree(int[] arr,char[] preLN,  Node root) {
        if(i<arr.length) {
            Node rootNode = new Node(arr[i]);
            root=rootNode;
            if(preLN[i]!='L')
            {   i++;
                rootNode.left=constructTree(arr,preLN,rootNode.left);
                i++;
                rootNode.right=constructTree(arr,preLN,rootNode.right);
            }
        }
        return root;
    }

    private static void printPreOrder(Node root) {

        if (root!=null){
            System.out.println(root.data+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }


}
