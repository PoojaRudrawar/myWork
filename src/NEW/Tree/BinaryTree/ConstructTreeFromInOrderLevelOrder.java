package NEW.Tree.BinaryTree;

/*Let us consider the above example.

in[] = {4, 8, 10, 12, 14, 20, 22};
level[] = {20, 8, 22, 4, 12, 10, 14};

In a Levelorder sequence, the first element is the root of the tree. So we know ’20’ is root for given sequences. By searching ’20’ in Inorder sequence, we can find out all elements on left side of ‘20’ are in left subtree and elements on right are in right subtree. So we know below structure now.

             20
           /    \
          /      \
 {4,8,10,12,14}  {22}
Let us call {4,8,10,12,14} as left subarray in Inorder traversal and {22} as right subarray in Inorder traversal.
In level order traversal, keys of left and right subtrees are not consecutive. So we extract all nodes from level order traversal which are in left subarray of Inorder traversal. To construct the left subtree of root, we recur for the extracted elements from level order traversal and left subarray of inorder traversal. In the above example, we recur for following two arrays.

// Recur for following arrays to construct the left subtree
In[]    = {4, 8, 10, 12, 14}
level[] = {8, 4, 12, 10, 14}
Similarly, we recur for following two arrays and construct the right subtree.

// Recur for following arrays to construct the right subtree
In[]    = {22}
level[] = {22} */
public class ConstructTreeFromInOrderLevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void main(String args[])
    {

        ConstructTreeFromInOrderLevelOrder tree = new ConstructTreeFromInOrderLevelOrder();
        int in[] = new int[]{4, 8, 10, 12, 14, 20, 22};
        int level[] = new int[]{20, 8, 22, 4, 12, 10, 14};
        int n = in.length;
        Node node = tree.buildTree(level, in);

        /* Let us test the built tree by printing Inorder traversal */
        System.out.print("Inorder traversal of the constructed tree is ");
        tree.printInorder(node);
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

    private static int getIndexOfCurrentNodeInInorder(int[] inordersequence, int data) {
        for(int i=0;i<inordersequence.length;i++){
            if(data==inordersequence[i]){
                return i;
            }
        }
        return -1;
    }


    private Node buildTree(int[] level,int[] in) {
        Node startNode=null;
       return conStructTree(startNode,level,in,0,in.length-1);
    }

    private Node conStructTree(Node startNode, int[] level, int[] in, int start, int end) {
        if(start>end){
            return null;
        }
        if(start==end){
            return new Node(in[start]);
        }

        boolean found=false;
        int index=0;

        for(int i=0;i<level.length;i++){
            int data=level[i];
            for(int j=start;j<end;j++){
                if(in[j]==data)
                {       index=j;
                    found=true;
                    startNode=new Node(data);
                    break;
                }
            }
            if(found)
                break;

        }
        startNode.left=conStructTree(startNode,level,in,start,index-1);
        startNode.right=conStructTree(startNode,level,in,index+1,end);
        return startNode;
    }

}
