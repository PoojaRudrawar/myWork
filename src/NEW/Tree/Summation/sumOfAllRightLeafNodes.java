package NEW.Tree.Summation;

public class sumOfAllRightLeafNodes
{
static class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

static Node root;

    public static void main(String[] args) {
        sumOfAllRightLeafNodes tree=new sumOfAllRightLeafNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        int val=getSumOfRightNodes(tree.root,0);
        System.out.println(val);
    }

    private static int getSumOfRightNodes(Node root, int sum) {
       if(root!=null) {
           sum=getSumOfRightNodes(root.left,sum);
           sum=getSumOfRightNodes(root.right,sum);
           if(root.left==null &&root.right!=null&&root.right.left==null&&root.right.right==null)
                sum=sum+root.right.data;


       }
           return sum;

    }
}
