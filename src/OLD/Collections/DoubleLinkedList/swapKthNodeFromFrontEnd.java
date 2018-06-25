package OLD.Collections.DoubleLinkedList;

/**
 * Created by PRudrawar on 11/17/2017.
 */
public class swapKthNodeFromFrontEnd {

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

    int lengthOfLinkedList(){
        Node k=head;
        int len=0;
        while(k!=null){
            len++;
            k=k.next;
        }
        return len;
    }

    public void swapNodes(int k,int lengthOfLinkedList){
        Node kStart,kEnd,kStartPrev=null,kEndPrev=null;

        Node traverse=head;
        int i=1;
        while (traverse!=null && i<k) {
            kStartPrev=traverse;
            traverse = traverse.next;
            i++;
        }
        kStart=traverse;

        //kth node from last means n-k+1 th node from first
        //ex in ll of 5 second node from last means 5-2+1 =4th node from first
        traverse=head;
        i=1;
        while (traverse!=null && i<lengthOfLinkedList-k+1) {
            kEndPrev=traverse;
            traverse = traverse.next;
            i++;
        }
        kEnd=traverse;

        //2 3 4 5 6

        while (k>lengthOfLinkedList){
            return;
        }

        if (kStart !=kEnd) {
            kStartPrev.next = kEnd;
            kEnd.prev=kStartPrev;

            Node temp=kEnd.next;

            kEnd.next=kStart.next;
            if(kEnd.next !=null)
                kEnd.next.prev=kEnd;

            kEndPrev.next=kStart;
            kStart.prev=kEndPrev;
            kStart.next=temp;
            if(kStart.next != null)
                kStart.next.prev=kStart;

        }
    }

    public static void main(String[] args) {
        swapKthNodeFromFrontEnd ob = new swapKthNodeFromFrontEnd();
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.push(6);

        int len=ob.lengthOfLinkedList();

        System.out.println(len);

        ob.printlist(head);

        ob.swapNodes(2,len);

        ob.printlist(head);

    }

    }
