package Collections.DoubleLinkedList;

/**
 * Created by PRudrawar on 11/16/2017.
 */
public class reverseDoublyLinkedList {

    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            next=prev=null;
        }
    }

    static Node head;

    //add node in font of list
    public void push(int new_data){

        Node new_node=new Node(new_data);

        if(head==null){
            new_node.next=null;
            new_node.prev=null;
            head=new_node;
            return;
        }

        new_node.next=head;
        head.prev=new_node;
        head=new_node;


    }


    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while(node != null)
        {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null)
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    private void reverse() {
        Node current=head;
        Node temp=null;
        while (current != null){
             temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }


        /* Before changing head, check for the cases like empty
         list and list with only one node */
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        reverseDoublyLinkedList ob=new reverseDoublyLinkedList();
        ob.push(23);
        ob.push(21);
        ob.push(12);
        ob.push(56);
        ob.push(222);

        ob.printlist(head);

        ob.reverse();

    System.out.println("After reversal");
        ob.printlist(head);

    }


}
