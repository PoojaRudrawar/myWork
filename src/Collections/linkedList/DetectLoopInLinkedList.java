package Collections.linkedList;

import java.util.HashSet;

/**
 * Created by PRudrawar on 11/17/2017.
 */
public class DetectLoopInLinkedList {

    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }

    static Node head=null;

    public void printList(){

        Node n= head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    /* Inserts a new Node at front of the list. */
    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    private static boolean detectLoop(Node head) {
        HashSet<Node> s=new HashSet<Node>();

        while(head != null){
            if(s.contains(head))
                return true;
            s.add(head);
            head=head.next;

        }
        return false;


    }

    /*Simultaneously go through the list by ones (slow iterator) and by twos (fast iterator). If there is a loop the fast iterator will go around that loop twice as fast as the slow iterator. The fast iterator will lap the slow iterator within a single pass through the cycle. Detecting a loop is then just detecting that the slow iterator has been lapped by the fast iterator.

     */
    // Best solution
    private static boolean hasLoop(Node startNode){
        Node slowNode =startNode; Node fastNode1 = startNode;Node fastNode2 = startNode;
        while (slowNode!=null ){
            fastNode1 = fastNode2.next ;
            fastNode2 = fastNode1.next;
            if (slowNode == fastNode1 || slowNode == fastNode2) return true;
            slowNode = slowNode.next;
        }
        return false;
    }

    public static void main(String[] args)
    {
        DetectLoopInLinkedList llist = new DetectLoopInLinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

        if(hasLoop(head))
            System.out.println("Loop found in best solution");
        else
            System.out.println("No loop");

    }


}
