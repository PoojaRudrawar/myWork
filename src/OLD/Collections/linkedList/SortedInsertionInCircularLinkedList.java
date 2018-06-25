package OLD.Collections.linkedList;

/**
 * Created by PRudrawar on 11/10/2017.
 */
public class SortedInsertionInCircularLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data1){
            data=data1;
            next=null;
        }
    }

    public void printList(){
        if(head != null){
            Node temp=head;
            do{
                if (head != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }while (temp!=head);
        }
        System.out.println();
    }

    public void sortedInsert(Node n1){
     Node current=head;
        if(head==null){
            head=n1;
            n1.next=n1;
        }
        else if(head.data > n1.data){//insert first pos
            Node lastNode=head;
            while (lastNode.next !=head){
                lastNode=lastNode.next;
            }
            n1.next=lastNode.next;
            lastNode.next=n1;
            head=n1;

        }
        else{
            while(current.next != head && current.next.data<n1.data){
                current=current.next;
            }
            n1.next=current.next;
            current.next=n1;
        }
    }

    public static void main(String[] args) {
        SortedInsertionInCircularLinkedList l=new SortedInsertionInCircularLinkedList();

        int arr[] = new int[] {12, 56, 2, 11, 1, 90};

        /* start with empty linked list */
        Node temp = null;

        /* Create linked list from the array arr[].
         Created linked list will be 1->2->11->12->56->90*/
        for (int i = 0; i < 6; i++)
        {
            Node insertNode=new Node(arr[i]);
            l.sortedInsert(insertNode);
            l.printList();
        }

        l.printList();




    }
}
