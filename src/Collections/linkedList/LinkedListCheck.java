package Collections.linkedList;

public class LinkedListCheck{


static class Node{
        Node next;
        int data;
        Node(int d){
        data=d;
        next=null;
        }
        }

        Node head;

public void printList(){

        Node n= head;
        while(n!=null){
        System.out.print(n.data + " ");
        n=n.next;
        }
        System.out.println();
        }


       public void insertAfter(Node prev,int data){
        if(prev== null){
        System.out.print("Previous node cant be null");
        return;
        }
        Node newNode=new Node(data);
        newNode.next=prev.next;
        prev.next=newNode;

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

        public void deleteNode(int key){
           Node temp=head;
           Node prev=null;
           if(temp.data==key){
               head=temp.next; //deleting first node
           }
           while(temp.next !=null && temp.data !=key){
               prev=temp;
               temp=temp.next;
           }
           prev.next=temp.next;

           if (temp == null)return;
        }

public static void main (String[] args) {
        LinkedListCheck l=new LinkedListCheck();
        l.head=new Node(11);
        Node sec= new Node(22);
        Node third= new Node(33);
        l.head.next=sec;
        sec.next=third;

        l.printList();

        //add node in front
       Node newNode=new Node(0);
       newNode.next=l.head;
       l.head=newNode;
       l.printList();

       l.insertAfter(sec,25);
       l.printList();

       l.append(35);
       l.printList();
       l.deleteNode(25);

       l.printList();
        }
        }