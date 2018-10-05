package NEW.Tree.BinaryTree;

import java.util.Arrays;

public class constructTreeFromPreOrderAndItsMirror {

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
        int preOrder[] = {1,2,4,5,3,6,7};
        int preOrderMirror[] = {1,3,7,6,2,5,4};

        root=constructTree(preOrder,preOrderMirror,0,preOrder.length-1);
        printPreOrder(root);

    }

    private static void printPreOrder(Node root) {

    if (root!=null){
        System.out.println(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    }

    private static Node constructTree(int[] preOrder, int[] preOrderMirror,int min,int max) {
    Node root=null;

    if(min>max){
        return null;
    }
    if(min==max){
        return new Node(preOrder[min]);
    }

    root=new Node(preOrder[min]);
    int nextleft=preOrder[min+1];
    int indexLeftinmirror=getIndex(preOrderMirror,nextleft);
    int indexRightinpreorder=getIndex(preOrder,preOrderMirror[min+1]);
    int[] leftPreOrder= Arrays.copyOfRange(preOrder,min+1,indexRightinpreorder);
    int[] rightPreOrder= Arrays.copyOfRange(preOrder,indexRightinpreorder,max+1);
    int[] leftPreOrderMirror= Arrays.copyOfRange(preOrderMirror,indexLeftinmirror,max+1);
    int[] rightPreOrderMirror= Arrays.copyOfRange(preOrderMirror,min+1,indexLeftinmirror);


    root.left=constructTree(leftPreOrder,leftPreOrderMirror,0,leftPreOrder.length-1);
    root.right=constructTree(rightPreOrder,rightPreOrderMirror,0,rightPreOrder.length-1);


    return root;
    }

    private static int getIndex(int[] preOrderMirror, int nextleft) {
        int index=0;
        for(int i=0;i<preOrderMirror.length;i++){
            if(nextleft==preOrderMirror[i])
                return i;
        }
        return -1;
    }
}
