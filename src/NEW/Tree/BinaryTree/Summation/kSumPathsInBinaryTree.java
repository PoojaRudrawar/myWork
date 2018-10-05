package NEW.Tree.BinaryTree.Summation;

import java.util.ArrayList;
import java.util.List;

public class kSumPathsInBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        kSumPathsInBinaryTree tree=new kSumPathsInBinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(3);
        tree.root.right=new Node(-1);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(1);
        tree.root.left.right.left=new Node(1);

        tree.root.right.left=new Node(4);

        tree.root.right.right=new Node(5);

        tree.root.right.right.right=new Node(6);

        tree.root.right.left.left=new Node(1);

        tree.root.right.left.right=new Node(2);

        constructPaths(tree.root,5);

    }
    static List<Integer> list=new ArrayList<>();
    private static void constructPaths(Node root, int realSum) {
            if(root==null)
                return;
            list.add(root.data);
            constructPaths(root.left,realSum);
            constructPaths(root.right,realSum);

       int  sum=0;
        for(int i=list.size()-1;i>=0;i--) {
            sum = sum + list.get(i);
            if (realSum == sum) {
                for(int j=i;j<list.size();j++)
                    System.out.print(list.get(j) + " ");

                System.out.println();
            }

        }
        list.remove(list.size()-1);

    }
}
