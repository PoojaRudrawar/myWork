package NEW.Queue;

/*
 *Created by PRudrawar on 8/11/2018
 */
public class BasicQueueUsingArray {
    int front,rear,size,capacity;
    public int[] qArray;

    BasicQueueUsingArray(int capacity){
        this.capacity=capacity;
        this.size=this.front=0;
        qArray=new int[capacity];
        this.rear=capacity-1;
    }

    public boolean isEmpty(BasicQueueUsingArray queue){
        return (queue.size==0);
    }

    public boolean isFull(BasicQueueUsingArray queue){
        return (queue.size==capacity);
    }
    public void enqueue(int data){
        if(isFull(this))
            return;
        this.rear=(this.rear+1)%this.capacity;
        this.qArray[this.rear]=data;
        this.size=this.size+1;
    }


    public int dequeue(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;

        int data=this.qArray[this.front];
        this.front=(this.front+1)%this.capacity;
        this.size=this.size-1;
        return data;
    }

    public  int front(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
        return this.qArray[this.front];
    }

    public int rear(){
        if(isFull(this)){
            return Integer.MIN_VALUE;
        }
        return this.qArray[this.rear];
    }

    public static void main(String[] args) {
        BasicQueueUsingArray queue=new BasicQueueUsingArray(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() +
                " dequeued from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());

    }


}
