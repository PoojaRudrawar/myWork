package NEW.Queue;

/*
 *Created by PRudrawar on 8/13/2018
 */
public class LRUCacheUsingQueue {
    int size;
    Node head;
    int count;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public boolean ifExist(int val){
        Node temp=head,prev=null;
        boolean found=false;
        while(temp!=null){
            if(temp.data==val){
                prev.next=temp.next;
                temp.next=head;
                head=temp;
                return true;
            }
            prev=temp;
            temp=temp.next;
        }
        System.out.println();
        return false;
    }

    public void add(int data){

        if(!ifExist(data)){
            Node n1=new Node(data);
            n1.next=head;
            head=n1;
            count++;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        if(size==count) {
            temp.next = null;
            count--;
        }
        printList();
    }


    public static void main(String[] args) {
        int[] input=new int[] {1,2,3,4,1,4,5,1,2};
        LRUCacheUsingQueue cache=new LRUCacheUsingQueue();
        for(int i:input){
            cache.add(i);
        }

    }
}
