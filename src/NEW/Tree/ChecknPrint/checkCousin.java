package NEW.Tree.ChecknPrint;
//2 nodes @ same level and have different parents
public class checkCousin {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {

        checkCousin tree = new checkCousin();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        Node Node1, Node2;
        Node1 = tree.root.left.left;
        Node2 = tree.root.left.right;
        if (tree.isCousin(tree.root, Node1, Node2))
            System.out.println("Cousins:Yes");
        else
            System.out.println("Cousins:No");

        if(tree.isSibling(tree.root,Node1,Node2))
            System.out.println("Siblings:yes");
        else
            System.out.println("No Siblings:No");
    }

    private boolean isCousin(Node root, Node node1, Node node2) {
        return (!isSibling(root,node1,node2)&&(level(root,node1,1)==level(root,node2,1)));
    }

    private int level(Node root, Node node1, int level) {
        if(root==null)
            return 0;

        if(root==node1)
            return level;

        int l=level(root.left,node1,level+1);

        if(l!=0)
            return l;

        return level(root.right,node1,level+1);
    }

    private boolean isSibling(Node root, Node node1, Node node2) {
        if(root==null)
            return false;
        return ((root.left==node1&&root.right==node2)||(root.left==node2&&root.right==node1)|| isSibling(root.left,node1,node2)||isSibling(root.right,node1,node2));
    }

}
