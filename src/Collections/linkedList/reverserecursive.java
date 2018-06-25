package Collections.linkedList;

public class reverserecursive {
    Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void reverseList(Node input){
       if(input== null){
           return;
       }

       Node curr=input;
       Node rest=input.next;

        //list have only one node
       if(rest==null){
           head=curr;
           return;
       }
        reverseList(input.next);  //reverse rest so curr.next is reversed ll .next=curr
       curr.next.next=curr;
       curr.next=null;






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
        reverserecursive ll=new reverserecursive();
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
        ll.reverseList(ll.head);
        ll.printList();
    }

}
