package NEW.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int d)
    {
        data = d;
        next = null;
    }
}

// A binary tree node
class BinaryTreeNode
{
    int data;
    BinaryTreeNode left, right = null;
    BinaryTreeNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class CompleteBinaryTrreWithLinkedListeRepresentation {
    ListNode head;
    BinaryTreeNode root;

    // Function to insert a node at the beginning of
    // the Linked List
    void push(int new_data) {
        // allocate node and assign data
        ListNode new_node = new ListNode(new_data);

        // link the old list off the new node
        new_node.next = head;

        // move the head to point to the new node
        head = new_node;
    }

    void inorderTraversal(BinaryTreeNode node)
    {
        if (node != null)
        {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        CompleteBinaryTrreWithLinkedListeRepresentation tree = new CompleteBinaryTrreWithLinkedListeRepresentation();
        tree.push(36); /* Last node of Linked List */
        tree.push(30);
        tree.push(25);
        tree.push(15);
        tree.push(12);
        tree.push(10); /* First node of Linked List */
        BinaryTreeNode node = tree.convertList2Binary(tree.root);

        System.out.println("Inorder Traversal of the"+
                " constructed Binary Tree is:");
        tree.inorderTraversal(node);
    }

    private BinaryTreeNode convertList2Binary(BinaryTreeNode root) {
        Queue<BinaryTreeNode> btqueue=new LinkedList<BinaryTreeNode>();
        BinaryTreeNode node;
        if(head==null) {
            node = null;
            return null;
        }
        BinaryTreeNode bTreeRoot=new BinaryTreeNode(head.data);
node=bTreeRoot;
        btqueue.add(bTreeRoot);
head=head.next;
        while (head!=null){
            BinaryTreeNode currentNode=btqueue.peek();
            BinaryTreeNode rightChild=null;
            btqueue.poll();

            BinaryTreeNode leftChild=new BinaryTreeNode(head.data);
            btqueue.add(leftChild);

            head=head.next;
            if(head!=null) {
                 rightChild = new BinaryTreeNode(head.data);
                head = head.next;
                btqueue.add(rightChild);
            }
                currentNode.left=leftChild;
            currentNode.right=rightChild;
             }


        return bTreeRoot;
    }

}