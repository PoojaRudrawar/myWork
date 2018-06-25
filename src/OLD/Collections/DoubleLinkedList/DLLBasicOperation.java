package OLD.Collections.DoubleLinkedList;

/**
 * Created by PRudrawar on 11/16/2017.
 */
public class DLLBasicOperation {
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

    public void insertAfter(Node prev_node,int data){

        Node new_node=new Node(data);

        if(prev_node ==null) {
            System.out.println("Node can not be null");
            return;
        }
        new_node.next=prev_node.next;
        if(prev_node.next != null)
            prev_node.next.prev=new_node;
        new_node.prev=prev_node;
        prev_node.next=new_node;
    }

    public void append(int data){
        Node new_node=new Node(data);

        if(head == null){
            head=new_node;
            return;
        }

        Node last=head;

        while(last.next != null){
            last=last.next;
        }

        last.next=new_node;
        new_node.prev=last;
    }

    public void deleteNode(Node del){
        if(head==null || del== null){
            return;
        }
        if(head==del){
            head=del.next;
            head.prev=null;

            return;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }

        /* Change prev only if node to be deleted is NOT the first node */
        if (del.prev != null) {
            del.prev.next = del.next;
        }
    }

    public static void main(String[] args) {
    DLLBasicOperation ob=new DLLBasicOperation();
    ob.push(2);
    ob.push(58);
    ob.push(23);
    ob.push(27);

    ob.insertAfter(ob.head.next,8);

    ob.append(99);

    ob.printlist(head);

    ob.deleteNode(ob.head);
        ob.printlist(head);

        ob.deleteNode(ob.head.next);
        ob.printlist(head);

    }
}
