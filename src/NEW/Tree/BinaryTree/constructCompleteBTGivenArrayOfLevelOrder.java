package NEW.Tree.BinaryTree;

public class constructCompleteBTGivenArrayOfLevelOrder {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static Node root;
    public static void main(String[] args) {
        constructCompleteBTGivenArrayOfLevelOrder tree=new constructCompleteBTGivenArrayOfLevelOrder();
        int arr[] = {1, 2, 3, 4, 5, 6,6,6,6};
        tree.root=constructTree(arr,0,tree.root);
        printInOrdr(tree.root);
    }

    private static void printInOrdr(Node rootOfTree) {
    if(rootOfTree!=null)
    {
        printInOrdr(rootOfTree.left);
        System.out.print(rootOfTree.data+" ");
        printInOrdr(rootOfTree.right);
    }
    }


    private static Node constructTree(int[] arr, int i, Node root) {
    if(i<arr.length) {
        Node rootNode = new Node(arr[i]);
        root=rootNode;
        rootNode.left=constructTree(arr,2*i+1,rootNode.left);
        rootNode.right=constructTree(arr,2*i+2,rootNode.right);
    }
    return root;
    }
}
