package Collections.tree;

import sun.reflect.generics.tree.Tree;

import java.util.List;

public class BinaryTreeToDLL {
    static class Node{
        Node left,right;
        int data;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static Node root;

    public Node convertTreeToDLL(Node input){
        if(input==null)
            return null;
        Node leftHead=convertTreeToDLL(input.left);
        Node rightHead=convertTreeToDLL(input.right);

        // Make a circular linked list of single node
        // (or root). To do so, make the right and
        // left pointers of this node point to itself
        input.left = input.right = input;
        return mergeList(mergeList(leftHead,input),rightHead);
    }

    private Node mergeList(Node firstNode, Node secondNode) {

        if(firstNode==null)
            return secondNode;

        if(secondNode==null)
            return firstNode;


        Node lastOfFirstList=firstNode.left;
        Node lastOfSecondNode=secondNode.left;


        secondNode.left=lastOfFirstList;
        lastOfFirstList.right=secondNode;
        lastOfSecondNode.right=firstNode;
        firstNode.left=lastOfSecondNode;

             return firstNode;
    }

    public void traverse(Node head){
        Node temp=head;

       do{
            System.out.print(temp.data+ " -> ");
            temp=temp.right;
        } while(temp!=head);
    }

    public static void main(String[] args) {
        BinaryTreeToDLL obj=new BinaryTreeToDLL();
        obj.root=new Node(10);
        obj.root.left=new Node(20);
        obj.root.right=new Node(30);
        obj.root.left.left=new Node(40);
        obj.root.left.right=new Node(50);
        obj.root.right.left=new Node(60);
        obj.root.right.right=new Node(70);

        Node head=obj.convertTreeToDLL(root);

        obj.traverse(head);
        }
}
