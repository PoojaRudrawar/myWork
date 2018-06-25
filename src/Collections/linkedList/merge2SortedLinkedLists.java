package Collections.linkedList;

import java.util.LinkedList;

public class merge2SortedLinkedLists {
    Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    static merge2SortedLinkedLists merge2LL(merge2SortedLinkedLists list1, merge2SortedLinkedLists list2){
        merge2SortedLinkedLists outlist=new merge2SortedLinkedLists();

        if(list1==null)
            return list2;
        if(list2==null)
            return list1;

        Node headptr1=list1.head;

        System.out.println(headptr1.data);
        Node headptr2=list2.head;

        while(headptr1!=null &&headptr2!=null){
            if(headptr1.data<headptr2.data){
                outlist.append(headptr1.data);
                headptr1=headptr1.next;
            }else {
                outlist.append(headptr2.data);
                headptr2=headptr2.next;
            }
        }
        if(headptr1!=null){
            while (headptr1!=null) {
                outlist.append(headptr1.data);
                headptr1 = headptr1.next;
            }
        }


        if(headptr2!=null){
            while (headptr2!=null) {
                outlist.append(headptr2.data);
                headptr2 = headptr2.next;
            }
        }

        return outlist;
    }

    public void append(int data){
        Node n=head;
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        while(n.next!= null){
            n=n.next;
        }
        n.next=newNode;
        return;
        /*complexity of append is o(n) which can be reduced by maintaining pointer @ last node i.e. tail node*/
    }


    public static void main(String[] args) {
        merge2SortedLinkedLists ll=new merge2SortedLinkedLists();
        ll.head=new Node(1);
        Node n2=new Node(3);
        Node n3=new Node(7);
        Node n4=new Node(9);
        Node n5=new Node(11);
        Node n6=new Node(615);

        ll.head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        merge2SortedLinkedLists ll2=new merge2SortedLinkedLists();
        ll2.head=new Node(2);
        Node n22=new Node(4);
        Node n23=new Node(5);
        Node n24=new Node(8);
        Node n25=new Node(12);
        Node n26=new Node(14);

        ll2.head.next=n22;
        n22.next=n23;
        n23.next=n24;
        n24.next=n25;
        n25.next=n26;

       merge2SortedLinkedLists mergedList= merge2LL(ll,ll2);
mergedList.printList();
    }

    public void printList(){

        Node n= head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }
}
