package Collections.linkedList;

/**
 * Created by PRudrawar on 11/13/2017.
 */
public class reverseLinkedList {
    Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void reverseList(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
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
        reverseLinkedList ll=new reverseLinkedList();
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
        ll.reverseList();
        ll.printList();
    }
}
