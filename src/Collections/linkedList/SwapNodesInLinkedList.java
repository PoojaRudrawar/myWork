package Collections.linkedList;

/**
 * Created by PRudrawar on 11/13/2017.
 */
public class SwapNodesInLinkedList {
    Node head;
   static class Node{
        int data;
        Node next;
        Node(int i){
            data=i;
        }
    }

    public void swapNodes(int x,int y){
        if(x==y)
            return;

        Node prevX=null, currentX=head;
        while (currentX != null && currentX.data != x){
            prevX=currentX;
            currentX=currentX.next;
        }

        Node prevY=null, currentY=head;
        while(currentY != null && currentY.data != y){
            prevY=currentY;
            currentY=currentY.next;
        }

        if(currentX==null || currentY==null)
            return;


        if(prevX==null)
            head=currentY;
        else
            prevX.next=currentY;

        if(prevY == null)
            head=currentX;
        else
            prevY.next=currentX;


        Node temp = currentX.next;
        currentX.next = currentY.next;
        currentY.next = temp;

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
        SwapNodesInLinkedList ll=new SwapNodesInLinkedList();
        ll.head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);

        ll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        ll.printList();

        ll.swapNodes(1,3);

        ll.printList();
    }
}
