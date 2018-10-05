package OLD.Collections.linkedList;

/**
 * Created by PRudrawar on 11/13/2017.
 */
public class removeDuplicate {
    Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void printList(){

        Node n= head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    public void removeDuplicate(){
        Node temp=head;
        Node compareNode,prev;

        if(head ==null)
            return;

        while (temp != null){
            compareNode=temp.next;
            prev=temp;
            while(compareNode !=null){
                if(temp.data == compareNode.data){
                    prev.next=compareNode.next;
                }
                prev=compareNode;
                compareNode=compareNode.next;
            }
            temp=temp.next;

        }

    }

    public static void main(String[] args) {
        removeDuplicate ll=new removeDuplicate();
        ll.head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(1);
        Node n4=new Node(4);
        Node n5=new Node(2);
        Node n6=new Node(6);

        ll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        ll.printList();
        ll.removeDuplicate();
        ll.printList();

    }
}

