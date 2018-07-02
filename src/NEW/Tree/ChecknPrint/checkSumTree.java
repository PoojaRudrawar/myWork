package NEW.Tree.ChecknPrint;

public class checkSumTree {

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

        checkSumTree tree = new checkSumTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(2);

        int height=getHeight(tree.root,0);

        boolean output = checkValidSumTree(tree.root,height-1);
        System.out.println(output);
    }

    private static int getHeight(Node root,int initial) {
        if(root!=null){
            initial++;
            int leftHeight=getHeight(root.left,initial);

            int rightHeight=getHeight(root.right,initial);

            return (leftHeight>rightHeight)?leftHeight:rightHeight;
        }
        return initial;
    }

    static boolean valid = true;

    private static boolean checkValidSumTree(Node root,int height) {
        if (root != null) {
            boolean left = checkValidSumTree(root.left,height-1);
            boolean right = checkValidSumTree(root.right,height-1);
            if (left && right) {
                if (root.left == null && root.right == null)
                    return true;
                if (root.data == height * (((root.left != null) ? root.left.data : 0) + ((root.right != null) ? root.right.data : 0)))
                    return true;
                else
                    return false;
            } else {
                return false;
            }

        }
        return true;

    }
}
