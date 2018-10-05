package NEW.Tree.BinaryTree.Traversal;

public class nthNodeOfInorderTraversal {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;
    static int count=0;

    public static void main(String[] args) {
        nthNodeOfInorderTraversal tree = new nthNodeOfInorderTraversal();
        Node rootNode = new Node(1);
        tree.root = rootNode;
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        nthNodeOfInorder(tree.root, 5);

    }

    private static void nthNodeOfInorder(Node root, int i) {
        if(root!=null){
            nthNodeOfInorder(root.left,i);

            count++;
            if(count==i){
                System.out.println(root.data);
            }

            nthNodeOfInorder(root.right,i);
        }
    }
}