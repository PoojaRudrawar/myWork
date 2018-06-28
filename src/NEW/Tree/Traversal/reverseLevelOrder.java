package NEW.Tree.Traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseLevelOrder {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        reverseLevelOrder tree = new reverseLevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        printReverseLevelOrder(tree.root);
        printReverseLevelOrderUsingStackQueue(tree.root);
    }

    private static void printReverseLevelOrderUsingStackQueue(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Stack<Node> stack=new Stack<>();

        while (!q.isEmpty()){
            Node currentNode=q.peek();
            q.remove();
            stack.push(currentNode);

            if(currentNode.right!=null){
                q.add(currentNode.right);
            }
            if(currentNode.left!=null){
                q.add(currentNode.left);
            }
        }

        while (!stack.isEmpty()){
            Node n=stack.peek();
            System.out.print(n.data+" ");
            stack.pop();
        }
    }

    private static void printReverseLevelOrder(Node root) {
        int height = getHeightOfTree(root, 0);
        for(int i=height;i>0;i--){
            printGivenLevel(root,i);
            System.out.println();
        }

    }

    private static void printGivenLevel(Node root, int level) {
            if(root==null)
                return;
            if(level==1) {
                System.out.print(root.data+" ");
                return;
            }

            if(level>1){
                printGivenLevel(root.left,level-1);
                printGivenLevel(root.right,level-1);
            }

    }

    private static int getHeightOfTree(Node root, int height) {
        if (root != null) {
            height++;
            int leftHeight = getHeightOfTree(root.left, height);
            int rightHeight = getHeightOfTree(root.right, height);
            return (leftHeight > rightHeight ? leftHeight : rightHeight);
        }
        return height;
    }
}
