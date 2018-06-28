package NEW.Tree;
/*
* Real trick in this code snippet is to use preIndex++ when you want to retrieve elements*/

public class ConstructTreeFromInorderPreorder {
    static class Node{
        char data;
        Node left;
        Node right;
        Node(char data){
            this.data=data;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        char[] Inordersequence=new char[]{ 'D', 'B', 'E', 'A', 'F', 'C'};
        char[] Preordersequence=new char[]{'A','B','D','E','C','F'};
    int startIndexInOrder=0;
    int startIndexPreOrder=0;
    int endIndexInOrder=Inordersequence.length;
    int endIndexPreOrder=endIndexInOrder;
        Node treeNode=constructTree(Inordersequence,startIndexInOrder,endIndexInOrder-1,Preordersequence);

        printInorder(treeNode);
    }
    static int preIndex=0;

    private static Node constructTree(char[] inordersequence, int startIndexInOrder, int endIndexInOrder, char[] preordersequence) {

        if(startIndexInOrder>endIndexInOrder)
            return null;


     //   char nodevalOfCurrentNode=preordersequence[preIndex++];

        Node treeNode=new Node(preordersequence[preIndex++]);

        if(startIndexInOrder==endIndexInOrder)
            return treeNode;


        int indexOfCurrentNode=getIndexOfCurrentNodeInInorder(inordersequence,startIndexInOrder,endIndexInOrder,treeNode.data);

        treeNode.left=constructTree(inordersequence,startIndexInOrder,indexOfCurrentNode-1,preordersequence);
        treeNode.right=constructTree(inordersequence,indexOfCurrentNode+1,endIndexInOrder,preordersequence);

        return  treeNode;
    }

    private static int getIndexOfCurrentNodeInInorder(char[] inordersequence, int start,int end,char nodevalOfCurrentNode) {
                for(int i=start;i<=end;i++){
                    if(nodevalOfCurrentNode==inordersequence[i]){
                        return i;
                    }
                }
        return -1;
    }

    static void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

}
