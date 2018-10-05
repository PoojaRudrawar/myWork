package NEW.Tree.BinaryTree.Traversal;

public class InOrderSuccesorOfAllNodes {
    static class Node{
        int data;
        Node left,right,next;
        Node(int data){
            this.data=data;
            left=right=next=null;
        }
    }
static Node root;
    static Node next=null;
    public static void main(String[] args) {
        InOrderSuccesorOfAllNodes tree=new InOrderSuccesorOfAllNodes();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(3);

        tree.populateNext(tree.root);

        Node ptr = tree.root.left.left;
        while (ptr != null)
        {
            // -1 is printed if there is no successor
            int print = ptr.next != null ? ptr.next.data : -1;
            System.out.println("Next of " + ptr.data + " is: " + print);
            ptr = ptr.next;
        }
    }

    private void populateNext(Node node) {
        if(node!=null){
            populateNext(node.right);

            node.next=next;
            next=node;

            populateNext(node.left);
        }
    }
}
