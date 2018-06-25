package Collections.linkedList;

/**
 * Created by PRudrawar on 11/13/2017.
 */
public class MiddleNodeOfLinkedList {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public Node middleNode(){

            Node nextNode=head,nextToNext=head;
        while (nextToNext!=null && nextToNext.next!=null ){
            nextNode=nextNode.next;
            nextToNext=nextToNext.next.next;
        }



        return nextNode;

    }

    public void printList(){

        Node n= head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MiddleNodeOfLinkedList ll=new MiddleNodeOfLinkedList();
        ll.head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);

        ll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        ll.printList();
        Node middleNode=ll.middleNode();
        System.out.print(middleNode.data);
    }
}
