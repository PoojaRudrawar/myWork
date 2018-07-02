package NEW.Tree.ChecknPrint;

import java.util.Arrays;

public class checkIfGivenPrePostInorderOfSameTree {
    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        int inOrder[] = {4, 2, 5, 1, 3};
        int preOrder[] = {1, 2, 4, 5, 3};
        int postOrder[] = {4, 5, 2, 3, 1};
        root=new Node(preOrder[0]);
        root=constructTree(preOrder,postOrder,root,0);
        inorderTraverse(root,inOrder);

        System.out.println(flag);

    }
    static int i=0;
          static boolean flag=true;
    private static void inorderTraverse(Node root,int[] inorder) {
       if(root!=null) {
           inorderTraverse(root.left,inorder);

           if(inorder[i]!=root.data)
               flag=false;
           i++;

           inorderTraverse(root.right,inorder);
       }
    }

    private static Node constructTree(int[] preOrder, int[] postOrder, Node rootNode, int index) {
       /* if(rootNode==null)
            return null;*/
if(preOrder.length==1){
    return new Node(preOrder[0]);
}

        int indexPostOrderVal=getIndexOfPreOrdervalInPostOrder(postOrder,preOrder[index+1]);
        int leftPostOrder[]= Arrays.copyOfRange(postOrder,index,indexPostOrderVal+1);
        int rightPostOrder[]=Arrays.copyOfRange(postOrder,indexPostOrderVal+1,postOrder.length-1);
        int leftPreOrder[]=Arrays.copyOfRange(preOrder,index+1,indexPostOrderVal+2);
        int rightPreOrder[]=Arrays.copyOfRange(preOrder,indexPostOrderVal+2,preOrder.length);
        rootNode=new Node(preOrder[index]);
        rootNode.left=constructTree(leftPreOrder,leftPostOrder,rootNode,0);
        rootNode.right=constructTree(rightPreOrder,rightPostOrder,rootNode,0);
        return rootNode;
    }

    private static int getIndexOfPreOrdervalInPostOrder(int[] postOrder, int val) {
        for(int i=0;i<postOrder.length;i++){
            if(postOrder[i]==val)
                return i;
        }
        return -1;
    }
}
