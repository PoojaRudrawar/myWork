package OLD.Collections.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

static Node root;


    public static void main(String[] args) {
        LevelOrderTraversal ltr=new LevelOrderTraversal();

        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Height of tree is :"+ltr.height(root));

        System.out.println("Print level 3:");
        printGivenLevel(root,3);

        System.out.println("Level order traversal via print given level is:");
        printLevelOrder(root);


        System.out.println("Level order traversal via Queue:");
        printLevelOrderUsingQueue(root);
    }

    private static void printLevelOrderUsingQueue(Node root) {
        Node temp=root;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            temp=queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    private static void printLevelOrder(Node root) {
        int height=height(root);
        for(int i=1;i<=height;i++)
        {
            printGivenLevel(root,i);
            System.out.println();
        }
    }

    private static void printGivenLevel(Node rootNode, int level){
        if(rootNode==null){
            return;
        }
        if(level==1){
            System.out.print(rootNode.data+" ");
        }
        else if(level>1){
            printGivenLevel(rootNode.left,level-1);
            printGivenLevel(rootNode.right,level-1);
        }

    }

    public static int height(Node root){


        if(root==null){return 0;}
        int lheight=height(root.left);

        int rheight=height(root.right);
        if(lheight>rheight)
            return 1+lheight;
        else
            return 1+rheight;

    }
}
